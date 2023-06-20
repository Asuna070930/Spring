package com.atguigu.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    private String userName;
    private String passWord;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;
    private Pet pet;

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", birthday=" + birthday +
                ", pet=" + pet +
                '}';
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(String userName, String passWord, Date birthday) {
        this.userName = userName;
        this.passWord = passWord;
        this.birthday = birthday;
    }
}
