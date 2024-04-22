package com.hibernate.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "hibernate_emp_crud2")
public class employee {

    @Id
    @Column(name = "eid")
    private int id;

    @Column(name = "ename", length = 20)
    private String name;

    @Column(name = "esal")
    private int sal;

    @Column(name = "jdate")
    private Date jdate;

    // Constructors
    public employee() {
    }

    public employee(int id, String name, int sal, Date jdate) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.jdate = jdate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public Date getJdate() {
        return jdate;
    }

    public void setJdate(Date jdate) {
        this.jdate = jdate;
    }
}
