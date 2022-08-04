package com.example.demo.Contoller;

import com.example.demo.Model.UserActivitiy;
import com.example.demo.Model.UserCommunity;
import com.example.demo.Service.UserActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/UserActivity")
public class UserActivityController {
    private final UserActivityService userActivityService;

    public UserActivityController(UserActivityService userActivityService){this.userActivityService=userActivityService;}

    @GetMapping("/{accoundId}/{activityId}")
    @CrossOrigin
    public ResponseEntity<UserActivitiy> activityUserSave(@PathVariable long accoundId, @PathVariable long activityId){
        return ResponseEntity.ok(userActivityService.save(accoundId,activityId));
    }


    @GetMapping("/{userId}")
    @CrossOrigin
    public ResponseEntity<List<UserActivitiy>> getCommunityFromUserId(@PathVariable long userId){
        return ResponseEntity.ok(userActivityService.getById(userId));
    }



}
