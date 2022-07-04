package com.example.demo.Contoller;

import com.example.demo.Model.Community;
import com.example.demo.Service.CommunityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/community")
public class CommunityController {
private final CommunityService communityService;

public  CommunityController(CommunityService communityService){this.communityService=communityService;}

    @PostMapping()
    public ResponseEntity<Community> createNewCustomer(@RequestBody Community community) {
        return ResponseEntity.ok(communityService.saveCommunity(community));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Community>> getAllCommunity(){
        return ResponseEntity.ok(communityService.getAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Community> getByidCommunity(@PathVariable Long id){ return ResponseEntity.ok(communityService.findCommunityById(id));
    }



}
