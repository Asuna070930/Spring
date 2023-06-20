package com.atguigu.bean;

public class Student {
    private String stuName;
    private Integer stuAge;
    private Grade grade;

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", grade=" + grade +
                '}';
    }

    public Student() {
    }

    public Student(String stuName, Integer stuAge, Grade grade) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.grade = grade;
    }

    public Student(String stuName) {
        this.stuName = stuName;
    }


    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}