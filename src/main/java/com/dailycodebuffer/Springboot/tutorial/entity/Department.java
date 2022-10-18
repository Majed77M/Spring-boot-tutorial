package com.dailycodebuffer.Springboot.tutorial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentID;
    private String departmentname;
    private String departmentaddress;
    private String departmentcode;

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }

    public Department() {
    }

    public Department(long departmentID, String departmentname, String departmentaddress, String departmentcode) {
        this.departmentID = departmentID;
        this.departmentname = departmentname;
        this.departmentaddress = departmentaddress;
        this.departmentcode = departmentcode;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDepartmentaddress() {
        return departmentaddress;
    }

    public void setDepartmentaddress(String departmentaddress) {
        this.departmentaddress = departmentaddress;
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID=" + departmentID +
                ", departmentname='" + departmentname + '\'' +
                ", departmentaddress='" + departmentaddress + '\'' +
                ", departmentcode='" + departmentcode + '\'' +
                '}';
    }
}
