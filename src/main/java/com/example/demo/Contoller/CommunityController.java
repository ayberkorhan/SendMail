package com.example.demo.Contoller;

import com.example.demo.Model.Community;
import com.example.demo.Service.CommunityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/community")
@CrossOrigin
public class CommunityController {
private final CommunityService communityService;

public  CommunityController(CommunityService communityService){this.communityService=communityService;}

    @PostMapping()
    public ResponseEntity<Community> createNewCustomer(@RequestBody Community community) {
        return ResponseEntity.ok(communityService.saveCommunity(community));
    }

    @GetMapping("/getall")
    @CrossOrigin
    public ResponseEntity<List<Community>> getAllCommunity(){
        return ResponseEntity.ok(communityService.getAll());
    }


    @GetMapping("/single")
    public ResponseEntity<Community> getByidCommunity(@RequestParam Long id){ return ResponseEntity.ok(communityService.findCommunityById(id));
    }

    @GetMapping("/creator/{id}")
    public ResponseEntity<List<Community>> getByCreatorId(@PathVariable String id){
    return ResponseEntity.ok(communityService.findCreatorById(id));
    }

}
