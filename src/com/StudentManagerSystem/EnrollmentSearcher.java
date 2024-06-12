
package com.StudentManagerSystem;

import java.util.LinkedList;

public class EnrollmentSearcher {


    private int studentID = -1;
    private int subjectID = -1;
    private boolean searchByStudent = false;
    private boolean searchBySubject = false;

    LinkedList result = new LinkedList();

    LinkedList studentResult = new LinkedList();
    LinkedList subjectResult = new LinkedList();

    
    
    public void matchResults() {

        for (int i = 0; i < studentResult.size(); i++) {
            for (int j = 0; j < subjectResult.size(); j++) {

                int m = (int) subjectResult.get(j);
                int k = (int) studentResult.get(i);
                if (m == k) {

                    LinkedList tmp = new LinkedList();
                    tmp.push(subjectResult.get(j));
                    result = (LinkedList) tmp.clone();
                    return;
                }
            }
        }
        result = null;
    }
    
    

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public boolean isSearchByStudent() {
        return searchByStudent;
    }

    public void setSearchByStudent(boolean searchByStudent) {
        this.searchByStudent = searchByStudent;
    }

    public boolean isSearchBySubject() {
        return searchBySubject;
    }

    public void setSearchBySubject(boolean searchBySubject) {
        this.searchBySubject = searchBySubject;
    }

    public LinkedList getResult() {
        return (LinkedList) result.clone();
    }

    public void setResult(LinkedList result) {
        this.result = (LinkedList) result.clone();
    }

    public LinkedList getStudentResult() {
        return (LinkedList) studentResult.clone();
    }

    public void setStudentResult(LinkedList studentResult) {
        this.studentResult = (LinkedList) studentResult.clone();
    }

    public LinkedList getSubjectResult() {
        return (LinkedList) subjectResult.clone();
    }

    public void setSubjectResult(LinkedList subjectResult) {
        this.subjectResult = (LinkedList) subjectResult.clone();
    }
}
