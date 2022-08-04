package com.example.demo.repositoy;

import com.example.demo.Model.Account;
import com.example.demo.Model.Activitiy;
import com.example.demo.Model.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ActivityRepository extends JpaRepository<Activitiy,Long> {
  // List<Activitiy> findByCommunity(Long id);

   List<Activitiy> findByCommunity(Optional<Community> community);

   List<Activitiy> findByCreatorId(String id);
}