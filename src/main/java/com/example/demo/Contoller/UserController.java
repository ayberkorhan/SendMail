package com.example.demo.Contoller;

import com.example.demo.Model.User;
import com.example.demo.Service.MailSenderService;
import com.example.demo.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/register")
public class UserController {
private final UserService userService;
    private final MailSenderService mailSenderService;
    public UserController(UserService userService, MailSenderService mailSenderService){this.userService=userService;
        this.mailSenderService = mailSenderService;
    }
    @PostMapping()
    @CrossOrigin
    public ResponseEntity<User> createNewUser(@RequestBody User user) {
        //mailSenderService.sendSimpleMessage(user.getEmail(),"welcome to community","TNX for sign up to community ");
        return ResponseEntity.ok(userService.register(user, user.getAccount()));
    }

    @GetMapping("/accountId/{id}")
    @CrossOrigin
    public ResponseEntity<User> getUserByAccountId(@PathVariable long id) {
        //mailSenderService.sendSimpleMessage(user.getEmail(),"welcome to community","TNX for sign up to community ");
        return ResponseEntity.ok(userService.findUserByAccountId(id));
    }





}
