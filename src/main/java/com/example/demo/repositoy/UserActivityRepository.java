package com.example.demo.repositoy;

import com.example.demo.Model.User;
import com.example.demo.Model.UserActivitiy;
import com.example.demo.Model.UserCommunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserActivityRepository extends JpaRepository<UserActivitiy,Long> {
    List<UserActivitiy> findByUser(User userActivity);

}