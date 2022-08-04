package com.example.demo.Contoller;

import com.example.demo.Model.Activitiy;
import com.example.demo.Model.Community;
import com.example.demo.Service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/activity")
@CrossOrigin
public class ActivityController {
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService){this.activityService=activityService;}

    @PostMapping()
    public ResponseEntity<Activitiy> createNewCustomer(@RequestBody Activitiy activitiy) {
        return ResponseEntity.ok(activityService.saveActivity(activitiy));
    }

    @GetMapping("/getall")
    @CrossOrigin
    public ResponseEntity<List<Activitiy>> getAllCommunity(){
        return ResponseEntity.ok(activityService.getAll());
    }

    @GetMapping("/community/{id}")
    @CrossOrigin
    public ResponseEntity<List<Activitiy>> getByCreatorId(@PathVariable Long id){
        return ResponseEntity.ok(activityService.findByCommunityId(id));
    }
    @GetMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<Activitiy> getByActivityId(@PathVariable Long id){
        return ResponseEntity.ok(activityService.findActivityyById(id));
    }




    @GetMapping("/creatorId/{id}")
    @CrossOrigin
    public ResponseEntity<List<Activitiy>> getByCreatorIdd(@PathVariable String id){
        return ResponseEntity.ok(activityService.getCreator(id));
    }






}
