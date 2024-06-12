
package com.StudentManagerSystem;

import java.util.LinkedList;

public class StudentSearcher {

    private int index = -1;
    private int uniID = -1;
    private int id = -1;
    private String name = "";
    private String lastname = "";
    private Boolean searchByUniID = false;
    private Boolean searchByID = false;
    private Boolean searchByName = false;
    private Boolean searchByLastname = false;

    private LinkedList<Student> students = new LinkedList<>();
    private LinkedList<Integer> indexes_name = new LinkedList<>();
    private LinkedList<Integer> indexes_lastname = new LinkedList<>();
    private LinkedList<Integer> indexes = new LinkedList<>();







    public void pushStudent(Student student) {
        students.push(student);
    }
    public Student popStudent() {return students.pop();}

    public void pushIndexes(int index) {
        indexes.push(index);
    }
    public int popIndexes() {return indexes.pop();}

    public void matchFoundIndexes(){

        indexes.clear();
        if ((searchByID && !searchByUniID) || (!searchByID && searchByUniID)){
            indexes.push(index);
        }
        else if(searchByName && !searchByLastname) {
            indexes = indexes_name;
        }
        else if(!searchByName && searchByLastname) {
            indexes = indexes_lastname;
        }
        else{
            for (Integer anIndexes_name : indexes_name) {
                for (Integer anIndexes_lastname : indexes_lastname) {
                    if (anIndexes_name.equals(anIndexes_lastname)) {
                        indexes.add(anIndexes_name);
                        break;
                    }
                }
            }
        }

    }

//    public void pushSubject(Subject subject) {
//        subjects.push(subject);
//    }
//    public Subject popSubject() {return subjects.pop();}
//    public void matchindexes(){
//        indexes.clear();
//        if (searchBySubjectID){
//            indexes.push(index);
//        }
//        else if(searchByTitle){
//            indexes = indexes_title;
//        }
//    }

    //-----------------------------------------------
    //-----------------------------------------------
    //-----------------------------------------------
    //------------GETTERS AND SETTERS----------------
    //-----------------------------------------------
    //-----------------------------------------------
    //-----------------------------------------------


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

    public Boolean getSearchByUniID() {
        return searchByUniID;
    }

    public void setSearchByUniID(Boolean searchByUniID) {
        this.searchByUniID = searchByUniID;
    }

    public Boolean getSearchByID() {
        return searchByID;
    }

    public void setSearchByID(Boolean searchByID) {
        this.searchByID = searchByID;
    }

    public Boolean getSearchByName() {
        return searchByName;
    }

    public void setSearchByName(Boolean searchByName) {
        this.searchByName = searchByName;
    }

    public Boolean getSearchByLastname() {
        return searchByLastname;
    }

    public void setSearchByLastname(Boolean searchByLastname) {
        this.searchByLastname = searchByLastname;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    public LinkedList<Integer> getIndexes_name() {
        return indexes_name;
    }

    public void setIndexes_name(LinkedList<Integer> indexes) {
        this.indexes_name = (LinkedList<Integer>) indexes.clone();
    }

    public LinkedList<Integer> getIndexes_lastname() {
        return indexes_lastname;
    }

    public void setIndexes_lastname(LinkedList<Integer> indexes_lastname) {
        this.indexes_lastname = (LinkedList<Integer>) indexes_lastname.clone();;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public LinkedList<Integer> getIndexes() {
        return indexes;
    }

    public void setIndexes(LinkedList<Integer> indexes) {
        this.indexes = indexes;
    }

}

