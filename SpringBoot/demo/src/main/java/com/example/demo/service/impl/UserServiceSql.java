package com.example.demo.service.impl;

import com.example.demo.dto.request.UserRequestDtoSql;

import com.example.demo.dto.response.UserResponseDtoSql;
import com.example.demo.mysql.model.UserCredential;
import com.example.demo.mysql.model.UserModel;
import com.example.demo.repository.UserCredentialsRepository;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.IUserSql;
import com.google.common.hash.Hashing;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceSql implements IUserSql {

    @Autowired
    Userrepository userrepository;

    @Autowired
    UserCredentialsRepository userCredentialRepository;

//    @Override
//    public UserDtoSql getAllDetails() {
//
//        Optional<UserModel> userModel = userrepository.findById(1);
//        UserDtoSql userDtoSql = new UserDtoSql();
//        if (userModel.isPresent()){
//            userDtoSql = convertUserModelToUserDtoSql(userModel.get());
//        }
//        return userDtoSql;
//    }
//    private UserDtoSql convertUserModelToUserDtoSql(UserModel userModel) {
//        UserDtoSql userDtoSql= new UserDtoSql();
//        userDtoSql.setId(userModel.getId());
//        userDtoSql.setFirstName(userModel.getFirstName());
//        userDtoSql.setLastName(userModel.getLastName());
//        userDtoSql.setMobile(userDtoSql.getMobile());
//        userDtoSql.setEmail(userDtoSql.getEmail());
//        return  userDtoSql;
//    }


    @Override
    public UserRequestDtoSql getUserById(Integer id) {

        Optional<UserModel> userModel = userrepository.findById(id);
        UserRequestDtoSql userRequestDtoSql = new UserRequestDtoSql();
        if (userModel.isPresent()) {
            userRequestDtoSql = convertUserModelToUserDtoSql(userModel.get());
        }
        return userRequestDtoSql;
    }


    @Override
    public List<UserRequestDtoSql> getAllUsers() {
        List<UserModel> userModelList = (List<UserModel>) userrepository.findAll();
        List<UserRequestDtoSql> userRequestDtoSqlList = new ArrayList<>();
        for (UserModel userModel : userModelList) {
            UserRequestDtoSql userRequestDtoSql = convertUserModelToUserDtoSql(userModel);
            userRequestDtoSqlList.add(userRequestDtoSql);
        }
        return userRequestDtoSqlList;

    }

    //for getuserbyId and getAllUsers
    private UserRequestDtoSql convertUserModelToUserDtoSql(UserModel userModel) {
        UserRequestDtoSql userRequestDtoSql = new UserRequestDtoSql();
        userRequestDtoSql.setId(userModel.getId());
        userRequestDtoSql.setFirstName(userModel.getFirstName());
        userRequestDtoSql.setLastName(userModel.getLastName());
        userRequestDtoSql.setMobile(userModel.getMobile());
        userRequestDtoSql.setEmail(userModel.getEmail());
        return userRequestDtoSql;
    }

    @Override
    @Transactional
    public UserResponseDtoSql createUser(UserRequestDtoSql userRequestDtoSql) {
        // Below code saves data in users table
        UserModel userModel = new UserModel();
        userModel = convertUserDtoToUserModel(userRequestDtoSql, userModel);
        userModel.setCreatedBy(1);
        userModel.setCreatedAt(LocalDateTime.now());
        userModel = userrepository.save(userModel);

        // Below code saves data in user_credentials table
        UserCredential userCredential = new UserCredential();
        String uuid = UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);
        final String computedPassword = Hashing.sha256()
                .hashString(userRequestDtoSql.getPassword(), StandardCharsets.UTF_8).toString() + uuid;
        userCredential.setUserId(userModel.getId());
        userCredential.setUsername(userRequestDtoSql.getUsername());
        userCredential.setPassword(computedPassword);
        userCredential.setPasswordSalt(uuid);
        userCredential.setLoginDateTime(LocalDateTime.now());
        userCredential.setCreatedBy(1);
        userCredential.setCreatedAt(LocalDateTime.now());
        userCredential.setUpdatedBy(1);
        userCredential.setUpdatedAt(LocalDateTime.now());
        userCredentialRepository.save(userCredential);

        //ye response me jo dikhna chaiye postman me uske liye hai
        // jab sari value post karenge to database me save hone k baad bas ye 3 value show hogi
        UserResponseDtoSql userResponseDtoSql = new UserResponseDtoSql();
        userResponseDtoSql.setId(userModel.getId());
        userResponseDtoSql.setUsername(userCredential.getUsername());
        userResponseDtoSql.setFirstName(userModel.getFirstName());
        return userResponseDtoSql;
    }

    @Override
    public UserRequestDtoSql updateUser(UserRequestDtoSql userRequestDtoSql) {
        Optional<UserModel> userModelOptional = userrepository.findById(userRequestDtoSql.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDtoSql.getId() + " not found");
        } else {
            UserModel userModel = convertUserDtoToUserModel(userRequestDtoSql, userModelOptional.get());
            userModel.setId(userRequestDtoSql.getId());
            userModel = userrepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userRequestDtoSql;
    }

    @Override
    public UserRequestDtoSql updatePatchUser(UserRequestDtoSql userRequestDtoSql) {
        Optional<UserModel> userModelOptional = userrepository.findById(userRequestDtoSql.getId());
        if (userModelOptional.isEmpty()) {
            System.out.println("User data with id: " + userRequestDtoSql.getId() + " not found");
        } else {
            UserModel userModel = userModelOptional.get();
            userModel.setFirstName(userRequestDtoSql.getFirstName() != null && !userRequestDtoSql.getFirstName().equals(userModel.getFirstName()) ? userRequestDtoSql.getFirstName(): userModel.getFirstName());
            userModel.setLastName(userRequestDtoSql.getLastName()!=null && !userRequestDtoSql.getLastName().equals(userModel.getLastName()) ? userRequestDtoSql.getLastName(): userModel.getLastName());
            userModel.setMobile(userRequestDtoSql.getMobile()!=null && !userRequestDtoSql.getMobile().equals(userModel.getMobile()) ? userRequestDtoSql.getMobile(): userModel.getMobile());
            userModel.setEmail(userRequestDtoSql.getEmail()!=null && !userRequestDtoSql.getEmail().equals(userModel.getEmail()) ? userRequestDtoSql.getEmail(): userModel.getEmail());
            userModel.setUpdatedBy(1);
            userModel.setUpdatedAt(LocalDateTime.now());
            userModel = userrepository.save(userModel);
            return convertUserModelToUserDtoSql(userModel);
        }
        return userRequestDtoSql;
    }


    @Override
    public UserRequestDtoSql deleteUser(Integer id) {
        Optional<UserModel> userModelOptional = userrepository.findById(id);
        if (userModelOptional.isEmpty()) {
            return null;
        } else {
            userrepository.deleteById(id);
            return convertUserModelToUserDtoSql(userModelOptional.get());
        }
    }


    //for create users and update users
    private UserModel convertUserDtoToUserModel(UserRequestDtoSql userRequestDtoSql, UserModel userModel) {
        userModel.setFirstName(userRequestDtoSql.getFirstName());
        userModel.setLastName(userRequestDtoSql.getLastName());
        userModel.setMobile(userRequestDtoSql.getMobile());
        userModel.setEmail(userRequestDtoSql.getEmail());
        userModel.setUpdatedBy(1);
        userModel.setUpdatedAt(LocalDateTime.now());
        return userModel;
    }


}
