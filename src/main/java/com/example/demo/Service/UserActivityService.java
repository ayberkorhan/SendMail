package com.example.demo.Service;

import com.example.demo.Model.*;
import com.example.demo.repositoy.UserActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActivityService {
    private final UserActivityRepository userActivityRepository;
    private final UserService userService;
    private final ActivityService activityService;

    public UserActivityService(UserActivityRepository userActivityRepository, UserService userService, ActivityService activityService) {
        this.userActivityRepository = userActivityRepository;
        this.userService = userService;
        this.activityService = activityService;
    }


    public UserActivitiy save(long userId, long activityId){

        User user = userService.findUserByAccountId(userId);
        Activitiy activitiy=activityService.findActivityyById(activityId);

        UserActivitiy userActivitiy= new UserActivitiy();
        userActivitiy.setActivitiy(activitiy);
        userActivitiy.setUser(user);

        return userActivityRepository.save(userActivitiy);
    }

    public List<UserActivitiy> getById(long accountId){
        User user = userService.findUserByAccountId(accountId);
        return userActivityRepository.findByUser(user);
    }


}
