
package com.StudentManagerSystem;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;

public class Subject {

    private int index = -1;
    private int databaseID = -1;
    private int capacity = -1;
    private int unitVal = -1;
    private int studentCount = 0;

    public enum Faculty{

        COMPUTER, LITERATURE
    }

    //should not be written in DS
    private int id = -1;
    private int code = -1;
    //should not be written in DS

    private String title;
    private String professorName;

    private ClassTiming classTiming = new ClassTiming(null,null);
    private RequirementsSchema requirements = new RequirementsSchema();


    private LocalDate examDate;

    private class RequirementsSchema {


//        todo after writing the preEnrollments this method should use them as requirements
        private int[] requiredSubjects_index;

        private LinkedList<Subject> requiredSubjects;
    }

    public static class Time implements Serializable{
        int day;
        int classNumber;
        int hour;
        int minute;
        int campusCode;
//        Faculty faculty;
        int unitValue;

        public Time(int day, int classNumber, int hour, int minute, int campusCode, int unitValue) {
            this.day = day;
            this.classNumber = classNumber;
            this.hour = hour;
            this.minute = minute;
            this.campusCode = campusCode;
            this.unitValue = unitValue;
        }
    }

    public static class ClassTiming implements Serializable {
        private LinkedList<Time> classTiming = new LinkedList<>();

        public ClassTiming(Time one, Time two) {
            Time tmp = new Time(0,0,0,0,0,0);
            if (one == null) one = tmp;
            if (two == null) two = tmp;
            classTiming.add(one);
            classTiming.add(two);
        }

        @Override
        public String toString() {

            return String.format("%s", classTiming.get(0).day) +
                    String.format("%4s", classTiming.get(0).classNumber) +
                    String.format("%2s", classTiming.get(0).hour) +
                    String.format("%2s", classTiming.get(0).minute) +
                    String.format("%3s", classTiming.get(0).campusCode) +
                    String.format("%s", classTiming.get(0).unitValue) +

                    String.format("%s", classTiming.get(1).day) +
                    String.format("%4s", classTiming.get(1).classNumber) +
                    String.format("%2s", classTiming.get(1).hour) +
                    String.format("%2s", classTiming.get(1).minute) +
                    String.format("%3s", classTiming.get(1).campusCode) +
                    String.format("%s", classTiming.get(1).unitValue);
        }

        public static ClassTiming ToclassTiming (String input){
            int day = Integer.parseInt (input.substring(0,1));
            int classNumber = Integer.parseInt (input.substring(1,5).replaceAll(" ",""));
            int hour = Integer.parseInt (input.substring(5,7).replaceAll(" ",""));
            int minute = Integer.parseInt (input.substring(7,9).replaceAll(" ",""));
            int campusCode = Integer.parseInt (input.substring(9,12).replaceAll(" ",""));
            int unitValue = Integer.parseInt (input.substring(12,13));
            Time one = new Time(day,classNumber,hour,minute,campusCode,unitValue);

            day = Integer.parseInt (input.substring(13,14));
            classNumber = Integer.parseInt (input.substring(14,18).replaceAll(" ",""));
            hour = Integer.parseInt (input.substring(18,20).replaceAll(" ",""));
            minute = Integer.parseInt (input.substring(20,22).replaceAll(" ",""));
            campusCode = Integer.parseInt (input.substring(22,25).replaceAll(" ",""));
            unitValue = Integer.parseInt (input.substring(25,26));
            Time two = new Time(day,classNumber,hour,minute,campusCode,unitValue);

            return new ClassTiming(one,two);
        }
    }


    public void copy(Subject s) {
        this.setCapacity(s.getCapacity());
        this.setUnitVal(s.getUnitVal());
        this.setTitle(s.getTitle());
        this.setIndex(s.getIndex());
        this.setCode(s.getCode());
        this.setProfessorName(s.getProfessorName());
        this.setRequirements(s.getRequirements());
        this.setExamDate(s.getExamDate());
        this.setStudentCount(s.getStudentCount());
        this.setDatabaseID(s.getDatabaseID());
    }







//    getters and setters

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public ClassTiming getClassTiming() {
        return classTiming;
    }

    public void setClassTiming(ClassTiming classTiming) {
        this.classTiming = classTiming;
    }

    public RequirementsSchema getRequirements() {
        return requirements;
    }

    public void setRequirements(RequirementsSchema requirements) {
        this.requirements = requirements;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public int getUnitVal() {
        return unitVal;
    }

    public void setUnitVal(int unitVal) {
        this.unitVal = unitVal;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public int getId() {
        return id;
    }

    public int getDatabaseID() {
        return databaseID;
    }

    public void setDatabaseID(int databaseID) {
        this.databaseID = databaseID;
    }

    public int calculateDatabaseID() {
        this.databaseID = this.id*100 + this.code;
        return this.databaseID;
    }

}