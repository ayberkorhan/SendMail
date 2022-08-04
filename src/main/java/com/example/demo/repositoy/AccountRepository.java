package com.example.demo.repositoy;

import com.example.demo.Model.Account;
import com.example.demo.Model.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByUserName(String email);
}
