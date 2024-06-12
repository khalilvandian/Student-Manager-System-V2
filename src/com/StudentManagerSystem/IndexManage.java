package com.StudentManagerSystem;

import java.io.Serializable;
import java.util.LinkedList;

public class IndexManage implements Serializable {

    private int studentCount = 0;
    private int lineCountStudent = 0;
    private int lineCountSubject = 0;
    private int lineCountEnrollment = 0;
    private LinkedList<Integer> recentlyDeletedStudents = new LinkedList<>();
    private LinkedList<Integer> recentlyDeletedSubjects = new LinkedList<>();
    private LinkedList<Integer> recentlyDeletedEnrollments = new LinkedList<>();


    int addStudent() {

        if (recentlyDeletedStudents.isEmpty()) {

            studentCount++;
            return ++lineCountStudent;
        } else
            return recentlyDeletedStudents.pop();
    }
    void removeStudent(int index) {

        recentlyDeletedStudents.push(index);
        studentCount--;
    }


    int addSubject() {

         if (recentlyDeletedSubjects.isEmpty()) {

             return ++lineCountSubject;
         } else
             return recentlyDeletedSubjects.pop();
     }
    void deleteSubject(int index) {

        recentlyDeletedSubjects.push(index);
    }


    void createEnrollment(Enrollment enrollment) {

        if (recentlyDeletedEnrollments.isEmpty())
            enrollment.setEnrollmentIndex(++lineCountEnrollment);

        else
            enrollment.setEnrollmentIndex(recentlyDeletedStudents.pop());
    }
    static void updateEnrollment(Enrollment enrollment) {}
    void deleteEnrollment(Enrollment enrollment) {

        recentlyDeletedStudents.push(enrollment.getEnrollmentIndex());
    }





}




