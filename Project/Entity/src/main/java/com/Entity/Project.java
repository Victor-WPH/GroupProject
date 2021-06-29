package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Project {
    @Id
    @GeneratedValue
    private int project_id;
    private Date Datetime;

    public Date getDatetime() {
        return Datetime;
    }

    public void setDatetime(Date datetime) {
        Datetime = datetime;
    }

    public Date getOwner() {
        return owner;
    }

    public void setOwner(Date owner) {
        this.owner = owner;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    private Date owner;
}
