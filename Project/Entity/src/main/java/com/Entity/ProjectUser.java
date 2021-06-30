/*package com.Entity;

import javax.persistence.*;

@Entity
public class ProjectUser {
    @Id
    @GeneratedValue
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = ""
    )
    private Long projectUserID;
    private Long ProjectID;
    private Long UserID;

    public Long getProjectUserID() {
        return projectUserID;
    }

    public void setProjectUserID(Long projectUserID) {
        this.projectUserID = projectUserID;
    }

    public Long getProjectID() {
        return ProjectID;
    }

    public void setProjectID(Long projectID) {
        ProjectID = projectID;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }
}*/
