
package com.StudentManagerSystem;

import java.util.LinkedList;

public class SubjectSearcher {


    private int id;
    private String title = "";
    private Boolean searchById = false;
    private Boolean searchByTitle = false;


//    private LinkedList<Subject> subjects = new LinkedList<>();
//    private LinkedList<Integer> indexes_title = new LinkedList<>();

    private LinkedList<Integer> searchResultId = new LinkedList<>();
    private LinkedList<Integer> searchResultTitle = new LinkedList<>();
    private LinkedList<Integer> index = new LinkedList<>();
    private LinkedList<Subject> subjects = new LinkedList<>();



///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods
///////////////////////////////////////////////////////////////Methods



    public void matchResults() {

        if (searchByTitle)
            index = (LinkedList<Integer>) searchResultTitle.clone();
        else if (searchById)
            index = (LinkedList<Integer>) searchResultId.clone();
        else
            index = null;

    }

    public int popIndex() {
        return index.pop();
    }

    public Subject pushSubject(Subject subject) {

        subjects.push(subject);
        return subject;
    }













//////////////////////////////////////////////////////////Getters and Setters
//////////////////////////////////////////////////////////Getters and Setters
//////////////////////////////////////////////////////////Getters and Setters
//////////////////////////////////////////////////////////Getters and Setters




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    //
    public Boolean getSearchById() {
        return searchById;
    }

    public void setSearchById(Boolean searchById) {
        this.searchById = searchById;
    }

    public Boolean getSearchByTitle() {
        return searchByTitle;
    }

    public void setSearchByTitle(Boolean searchByTitle) {
        this.searchByTitle = searchByTitle;
    }

    public LinkedList<Integer> getSearchResultId() {
        return searchResultId;
    }

    public void setSearchResultId(java.util.List<Integer> searchResultId) {
        this.searchResultId = (LinkedList<Integer>) searchResultId;
        this.searchResultId = (LinkedList<Integer>) this.searchResultId.clone();
    }

    public LinkedList<Integer> getSearchResultTitle() {
        return searchResultTitle;
    }

    public void setSearchResultTitle(LinkedList<Integer> searchResultTitle) {
        this.searchResultTitle = (LinkedList<Integer>) searchResultTitle.clone();
    }

    public LinkedList<Integer> getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index.push(index);
    }

    public void setIndex(LinkedList<Integer> index) {
        this.index = index;
    }

    public LinkedList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(LinkedList<Subject> subjects) {
        this.subjects = subjects;
    }
}
