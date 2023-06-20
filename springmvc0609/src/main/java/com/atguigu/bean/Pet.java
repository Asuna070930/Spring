package com.atguigu.bean;

public class Pet {
    private String petname;

    @Override
    public String toString() {
        return "Pet{" +
                "petname='" + petname + '\'' +
                '}';
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }
}
