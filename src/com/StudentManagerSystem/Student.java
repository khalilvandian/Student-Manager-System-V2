/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem;

import java.util.LinkedList;

public class Student {

    //properties
    private int index_PersonalInfo;
    private int uniID;
    private int id;
    private String name;
    private String lastname;
    private String birthDate;
    private String phoneNum;
    private String password = "1234";


    //methods

    public int getIndex_PersonalInfo() {
        return index_PersonalInfo;
    }

    public void setStudent(Student s) {
        this.setIndex_PersonalInfo(s.getIndex_PersonalInfo());
        this.setUniID(s.getUniID());
        this.setId(s.getId());
        this.setName(s.getName());
        this.setLastname(s.getLastname());
        this.setBirthDate(s.getBirthDate());
        this.setPhoneNum(s.getPhoneNum());
        this.setPassword(s.getPassword());
    }

    public void setIndex_PersonalInfo(int input) {
        index_PersonalInfo = input;
    }

    public int getUniID() {
        return uniID;
    }

    public void setUniID(int uniID) {
        this.uniID = uniID;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
