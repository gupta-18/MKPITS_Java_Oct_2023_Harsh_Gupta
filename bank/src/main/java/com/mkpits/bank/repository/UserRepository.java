package com.mkpits.bank.repository;

import com.mkpits.bank.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users,Integer> {
}
