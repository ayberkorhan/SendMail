package com.example.demo.Contoller;

import com.example.demo.Model.Community;
import com.example.demo.Model.UserCommunity;
import com.example.demo.Service.UserCommunityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/UserCommunity")
@CrossOrigin
public class UserCommunityController {
    private final UserCommunityService userCommunityService;

    public UserCommunityController(UserCommunityService userCommunityService) {
        this.userCommunityService = userCommunityService;
    }

    @GetMapping("/{accountId}/{communityId}")
    @CrossOrigin
    public ResponseEntity<UserCommunity> communityUserSave(@PathVariable long accountId,@PathVariable long communityId){
        return ResponseEntity.ok(userCommunityService.save(accountId,communityId));
    }

    @GetMapping("/getall")
    @CrossOrigin
    public ResponseEntity<List<UserCommunity>> getAllCommunity(){
        return ResponseEntity.ok(userCommunityService.getAll());
    }

    @GetMapping("/{userId}")
    @CrossOrigin
    public ResponseEntity<List<UserCommunity>> getCommunityFromUserId(@PathVariable long userId){
        return ResponseEntity.ok(userCommunityService.getById(userId));
    }



}