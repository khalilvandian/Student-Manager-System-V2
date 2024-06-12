
package com.StudentManagerSystem;

public class Enrollment {


    private int studentID;
    private int subjectID;
    private int studentIndex;
    private int subjectIndex;
    private int score;
    private int enrollmentIndex;
    private int semester;
    private boolean isPreEnrollment = false;
    private Status status = null;



    private Student student;
    private Subject subject;


    public enum Status {
        FAILED, ABSENCE_FAIL, PASSED, REMOVED
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

    public int getEnrollmentIndex() {
        return enrollmentIndex;
    }

    public void setEnrollmentIndex(int enrollmentIndex) {
        this.enrollmentIndex = enrollmentIndex;
    }

    public int getStudentIndex() {
        return studentIndex;
    }

    public void setStudentIndex(int studentIndex) {
        this.studentIndex = studentIndex;
    }

    public int getSubjectIndex() {
        return subjectIndex;
    }

    public void setSubjectIndex(int subjectIndex) {
        this.subjectIndex = subjectIndex;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 101 && score > -1)
            this.score = score;
    }

    public void toPreEnrollment() {
        this.isPreEnrollment = true;
    }

    public boolean isPreEnrollment() {
        return isPreEnrollment;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
