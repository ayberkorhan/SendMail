package com.example.demo.Service;

import com.example.demo.repositoy.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private  final AccountRepository accountRepository;

    public AccountService( AccountRepository accountRepository){this.accountRepository=accountRepository;}

    




}
