package com.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long UserID;
    private String UserName;
    private Date time_created;
    private Date last_updated;
    private String password;
    @OneToMany(mappedBy = "User", orphanRemoval = true, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Project> projects;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "ProjectUser", joinColumns = {@JoinColumn(name = "ProjectUserID"), @JoinColumn(name = "UserID")},
            inverseJoinColumns = {@JoinColumn(name = "ProjectID")}

    )
    private Set<Project> project = new HashSet<>();
    public Long getUserID() {
        return UserID;
    }

    public void setUser_ID(Long userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Date getTime_created() {
        return time_created;
    }

    public void setTime_created(Date time_created) {
        this.time_created = time_created;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

