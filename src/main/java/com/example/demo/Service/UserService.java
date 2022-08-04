package com.example.demo.Service;

import com.example.demo.Model.Account;
import com.example.demo.Model.User;
import com.example.demo.repositoy.AccountRepository;
import com.example.demo.repositoy.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
private final UserRepository userRepository;
private final AccountRepository accountRepository;

public UserService(UserRepository userRepository, AccountRepository accountRepository){this.userRepository=userRepository;
    this.accountRepository = accountRepository;
}
public User register(User user, Account account){
    account.setUser(user);
    user.setAccount(account);
    accountRepository.save(account);
    return userRepository.save(user);
}
public  User findUserById(long id){
    return userRepository.findById(id).orElseThrow();
}

public User findUserByAccountId(Long id){

  Account account = accountRepository.getById(id);

    User user = userRepository.findByAccount(account);
    return user;

}

public User findUserByEmail(String email,String password){

    User user = null;

    user = userRepository.findByEmail(email);
    System.out.println(user.getEmail());

return user;
}



}
