package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.FetchType.LAZY;


@Entity
@Table(name = "UserCommunity")
public class UserCommunity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long UCId;

    public Long getUCId() {
        return UCId;
    }

    public void setUCId(Long UCId) {
        this.UCId = UCId;
    }



  /*  public User getUser(User user) {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/


    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    @ManyToOne
    @JoinColumn(name = "community_id")
    private Community community;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne(fetch = LAZY)
    @JsonIgnore
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private  User user;

}
