package com.example.demo.Contoller;

import com.example.demo.Model.Community;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/register")
public class UserController {
private final UserService userService;

    public UserController(UserService userService){this.userService=userService;}
    @PostMapping()
    public ResponseEntity<User> createNewUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user, user.getAccount()));
    }









}
