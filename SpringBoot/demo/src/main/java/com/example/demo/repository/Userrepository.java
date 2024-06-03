package com.example.demo.repository;

import com.example.demo.mysql.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface Userrepository  extends CrudRepository<UserModel , Integer> {
}
