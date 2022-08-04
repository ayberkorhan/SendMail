package com.example.demo.Service;

import com.example.demo.Model.Community;
import com.example.demo.repositoy.CommunityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityService {
private final CommunityRepository communityRepository;

public  CommunityService(CommunityRepository communityRepository){
    this.communityRepository = communityRepository;
}

public Community saveCommunity(Community community){
    return communityRepository.save(community);
}

public List<Community> getAll(){
    return communityRepository.findAll();
}

    public Community findCommunityById(Long id)  {
        return communityRepository.findById(id).orElseThrow();
    }
    public List<Community> findCreatorById(String id)  {
        return (List<Community>) communityRepository.findByCreatorId(id);
    }







}
