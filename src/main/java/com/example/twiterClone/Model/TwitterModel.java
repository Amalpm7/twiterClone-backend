package com.example.twiterClone.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class TwitterModel {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dob;
    private String phone;
    private String place;
    private String email_id;
    private String password;

    public TwitterModel(int id, String name, String dob, String phone, String place, String email_id, String password) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.place = place;
        this.email_id = email_id;
        this.password = password;
    }

    public TwitterModel() {
    }

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
