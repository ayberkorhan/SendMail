package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "User")

public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;

    @OneToMany(mappedBy = "user")
    Set<UserCommunity> userCommunity;

    public Set<UserActivitiy> getUserActivitiys() {
        return userActivitiys;
    }

    public void setUserActivitiys(Set<UserActivitiy> userActivitiys) {
        this.userActivitiys = userActivitiys;
    }

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    Set<UserActivitiy> userActivitiys;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

   /* public Set<UserCommunity> getUserid() {
        return userid;
    }

    public void setUserid(Set<UserCommunity> userid) {
        this.userid = userid;
    }*/

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<UserCommunity> getUserCommunity() {
        return userCommunity;
    }

    public void setUserCommunity(Set<UserCommunity> userCommunity) {
        this.userCommunity = userCommunity;
    }

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "accountId",unique = true)
    private Account account;

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String address;



}
