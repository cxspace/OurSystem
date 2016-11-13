package com.cx.sys.user.entity;

import java.util.Date;

/**
 * Created by cxspace on 16-11-11.
 */
public class User {

    private String id;

    private String user_name;

    private String password;

    private String head_img;

    private String account;

    private String phone;

    private String email;

    private int gender;

    private Date birthday;

    private long score;

    private int role;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getHead_img() {
        return head_img;
    }

    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public User(String account, Date birthday, String email, int gender, String head_img, String id, String password, String phone, int role, long score, String user_name) {
        this.account = account;
        this.birthday = birthday;
        this.email = email;
        this.gender = gender;
        this.head_img = head_img;
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.role = role;
        this.score = score;
        this.user_name = user_name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", head_img='" + head_img + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", role='" + role + '\'' +
                ", score=" + score +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
