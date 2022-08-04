package com.example.demo.Service;

import com.example.demo.Model.Account;
import com.example.demo.Model.User;
import com.example.demo.repositoy.AccountRepository;
import com.example.demo.repositoy.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private  final AccountRepository accountRepository;
    private  final UserRepository userRepository;
    public AccountService(AccountRepository accountRepository, UserRepository userRepository){this.accountRepository=accountRepository;
        this.userRepository = userRepository;
    }

    public Account findUserByUserName(String email, String password){

    Account account= null;

    account = accountRepository.findByUserName(email);

    if (account != null   ){

        if(password.equals(account.getPassword())) {
            System.out.println(password);
            System.out.println(account.getPassword());
            return account;
        }else {
            System.out.println("parola yanlis");
            account = null;
        }
    }else{
            System.out.println("obje null");    }

        return account;
    }




}
