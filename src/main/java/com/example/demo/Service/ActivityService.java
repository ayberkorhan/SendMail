package com.example.demo.Service;

import com.example.demo.Model.Activitiy;
import com.example.demo.Model.Community;
import com.example.demo.repositoy.ActivityRepository;
import com.example.demo.repositoy.CommunityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;
    private final CommunityRepository communityRepository;

    public ActivityService(ActivityRepository activityRepository, CommunityRepository communityRepository){this.activityRepository=activityRepository;
        this.communityRepository = communityRepository;
    }


    public Activitiy saveActivity(Activitiy activitiy){
        return activityRepository.save(activitiy);
    }

    public List<Activitiy> getAll(){return  activityRepository.findAll();}

    public List<Activitiy> findByCommunityId(Long id){

        Community community =  communityRepository.findById(id).orElseThrow();


        return activityRepository.findByCommunity(Optional.of(community));}


    public Activitiy findActivityyById(Long id)  {
        return activityRepository.findById(id).orElseThrow();
    }





    public List<Activitiy> getCreator(String id){return  activityRepository.findByCreatorId(id);}



}
