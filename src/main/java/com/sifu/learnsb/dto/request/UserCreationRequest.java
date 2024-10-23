package com.sifu.learnsb.dto.request;

import jakarta.validation.constraints.Size;

import java.util.Date;

public class UserCreationRequest {

    private String name;
    private Date birthday;
    private double salary;

    @Size(min = 3, message = "Username is at least 3 characters!")
    private String username;

    @Size(min = 8, message = "Password is at least 8 characters!")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
