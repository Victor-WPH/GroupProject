/*
package com.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Project_Resources {
    @Id
    @GeneratedValue
    private Long projectResourceID;
    private long projectID;
    private long resourceID;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = ""
    )

    public Long getProjectResourceID() {
        return projectResourceID;
    }

    public void setProjectResourceID(Long projectResourceID) {
        this.projectResourceID = projectResourceID;
    }

    public long getProjectID() {
        return projectID;
    }

    public void setProjectID(long projectID) {
        this.projectID = projectID;
    }

    public long getResourceID() {
        return resourceID;
    }

    public void setResourceID(long resourceID) {
        this.resourceID = resourceID;
    }
}
*/
