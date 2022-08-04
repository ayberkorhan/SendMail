package com.example.demo.repositoy;

import com.example.demo.Model.Account;
import com.example.demo.Model.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunityRepository extends JpaRepository<Community,Long> {
    List<Community> findByCreatorId(String id);
}
