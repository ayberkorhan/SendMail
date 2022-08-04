package com.example.demo.repositoy;

import com.example.demo.Model.Account;
import com.example.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
    //User findByAccountId(Account accountId);
    User findByAccount(Account a);

}