package com.example.demo.repositoy;

import com.example.demo.Model.User;
import com.example.demo.Model.UserCommunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserCommunityRepository extends JpaRepository<UserCommunity,Long> {
    List<UserCommunity> findByUser(User userCommunity);

}