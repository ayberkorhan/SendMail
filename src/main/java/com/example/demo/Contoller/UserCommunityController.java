package com.example.demo.Contoller;

import com.example.demo.Model.Community;
import com.example.demo.Model.UserCommunity;
import com.example.demo.Service.UserCommunityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/UserCommunity")
public class UserCommunityController {
    private final UserCommunityService userCommunityService;

    public UserCommunityController(UserCommunityService userCommunityService) {
        this.userCommunityService = userCommunityService;
    }

    @GetMapping("/{userId}/{communityId}")
    public ResponseEntity<UserCommunity> communityUserSave(@PathVariable long userId,@PathVariable long communityId){
        return ResponseEntity.ok(userCommunityService.save(userId,communityId));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<UserCommunity>> getAllCommunity(){
        return ResponseEntity.ok(userCommunityService.getAll());
    }





}