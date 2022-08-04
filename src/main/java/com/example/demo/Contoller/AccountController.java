package com.example.demo.Contoller;

import com.example.demo.Model.Account;
import com.example.demo.Model.User;
import com.example.demo.Service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("accountCheck")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService){
    this.accountService=accountService;
    }

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Account> checkAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.findUserByUserName(account.getUserName(),account.getPassword()));
    }

}
