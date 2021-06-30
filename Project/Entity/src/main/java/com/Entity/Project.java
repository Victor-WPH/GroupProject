package com.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PROJECT")
public class Project {
    @Id
    @GeneratedValue
    private Long projectID;
    private String projectName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UserID")
    private User user;
    @ManyToMany(mappedBy = "project", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<User> users = new HashSet<>();

    public Project(Long projectID, String projectName, User user, Set<User> users) {
        this.projectID = projectID;
        this.projectName = projectName;
        this.user = user;
        this.users = users;
    }

    public Project() {

    }

    public Long getProjectID() {
        return projectID;
    }

    public void setProject_ID(Long projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
