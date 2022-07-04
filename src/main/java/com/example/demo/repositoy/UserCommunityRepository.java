package com.example.demo.repositoy;

import com.example.demo.Model.UserCommunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserCommunityRepository extends JpaRepository<UserCommunity,Long> {


}