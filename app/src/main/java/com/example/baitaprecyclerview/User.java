package com.example.baitaprecyclerview;

import java.io.Serializable;

public class User implements Serializable {
    private int resourceId;
    private String name;
    private String email;
    private String address;
    private String phone;
    private String company;

    public User(int resourceId, String name, String email, String address, String phone, String company) {
        this.resourceId = resourceId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.company = company;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
