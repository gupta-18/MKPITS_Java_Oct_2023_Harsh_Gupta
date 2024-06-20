package com.mkpits.bank.repository;

import com.mkpits.bank.entity.Accounts;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends CrudRepository<Accounts, Integer> {

//CrudRepository<Accounts, Integer
// the Users type parameter specifies the entity type that this repository will manage.
// The Integer type parameter specifies the type of the primary key of the Users entity.

    Optional<Accounts> findByUserId(Integer userId);

    List<Accounts> findAccountsByUserId(Integer userId);

    int countByAccountType(String accountType);
}
