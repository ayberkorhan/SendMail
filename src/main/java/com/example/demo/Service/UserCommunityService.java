package com.example.demo.Service;

import com.example.demo.Model.Community;
import com.example.demo.Model.User;
import com.example.demo.Model.UserCommunity;
import com.example.demo.repositoy.UserCommunityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCommunityService {
    private final UserCommunityRepository userCommunityRepository;
    private final UserService userService;
    private final CommunityService communityService;

    public UserCommunityService(UserCommunityRepository userCommunityRepository, UserService userService, CommunityService communityService){this.userCommunityRepository = userCommunityRepository;
        this.userService = userService;
        this.communityService = communityService;
    }

    public UserCommunity save(long userId,long communityId){

        User user = userService.findUserById(userId);
        Community community = communityService.findCommunityById(communityId);

        UserCommunity userCommunity = new UserCommunity();

        userCommunity.setUser(user);
        userCommunity.setCommunity(community);

        return userCommunityRepository.save(userCommunity);
    }

    public List<UserCommunity> getAll(){
        return userCommunityRepository.findAll();
    }





}


