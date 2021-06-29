package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Project_Resources {
    @Id
    @GeneratedValue
    private int record_id;
    private Date Datetime;
    private int project_id;
    private int resource_id;
}
