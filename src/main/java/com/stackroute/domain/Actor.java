package com.stackroute.domain;

public class Actor {
    private String name;
    private int age;
    private String gender;

    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
    public void displayinfo(){
        System.out.println("Name is " +name+ " Gender is  " +gender+  " Age is " +age);
    }


}
