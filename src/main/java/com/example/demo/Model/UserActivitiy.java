package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "UserActivity")
public class UserActivitiy implements Serializable {

    public Long getUSId() {
        return USId;
    }

    public void setUSId(Long USId) {
        this.USId = USId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Activitiy getActivitiy() {
        return activitiy;
    }

    public void setActivitiy(Activitiy activitiy) {
        this.activitiy = activitiy;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long USId;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private  User user;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activitiy activitiy;

}
