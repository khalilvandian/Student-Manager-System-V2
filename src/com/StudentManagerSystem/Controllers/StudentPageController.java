package com.StudentManagerSystem.Controllers;

import com.StudentManagerSystem.*;

import java.io.IOException;
import java.util.LinkedList;

public class StudentPageController {

    private static Student information;

    public class Input {

        String subjectID;
        String subjectCode;


//        TODO setters and getters should change data types : string to int ...
        public int getSubjectID() {
            return Integer.parseInt(subjectID);
        }

        public void setSubjectID(String subjectID) {
            this.subjectID = subjectID;
        }

        public String getSubjectCode() {
            return subjectCode;
        }

        public void setSubjectCode(String subjectCode) {
            this.subjectCode = subjectCode;
        }
    }
    public class UpdatedInput{
        String studentID;
        String subjectID;
        String updatedGpcode;
        Enrollment updatedenrollment;

        public int getStudentID() {
            return Integer.parseInt(studentID);
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public int getSubjectID() {
            return Integer.parseInt(subjectID);
        }

        public void setSubjectID(String subjectID) {
            this.subjectID = subjectID;
        }

        public int getUpdatedGpcode() {
            return Integer.parseInt(updatedGpcode);
        }

        public void setUpdatedGpcode(String updatedGpcode) {
            this.updatedGpcode = updatedGpcode;
        }

        public Enrollment getUpdatedenrollment() {
            return updatedenrollment;
        }

        public void setUpdatedenrollment(Enrollment updatedenrollment) {
            this.updatedenrollment = updatedenrollment;
        }
    }
    public class SearchByStudent{
        String studentID;

        public int getStudentID() {
            return Integer.parseInt(studentID);
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }
    }
    public class SearchBySubject{
        String subjectID;

        public int getSubjectID() {
            return Integer.parseInt(subjectID);
        }

        public void setSubjectID(String subjectID) {
            this.subjectID = subjectID;
        }
    }


//    course offering
    public static void addSubject(Input input) throws IOException {

        Enrollment enrollment = new Enrollment();
        enrollment.setStudentID(information.getUniID());
        enrollment.setSubjectID(input.getSubjectID());
        SystemManage.addEnrollment(enrollment);
    }
    public static void removeSubject(Input input) throws IOException {

        Enrollment enrollment = new Enrollment();
        enrollment.setStudentID(information.getUniID());
        enrollment.setSubjectID(input.getSubjectID());
        SystemManage.setEnrollmentTmp(enrollment);
        SystemManage.removeEnrollment(enrollment);
    }
    public static void updateSubjectGpCode(UpdatedInput updatedInput) throws Exception{
        EnrollmentSearcher enrollmentSearcher = new EnrollmentSearcher();
        enrollmentSearcher.setSearchByStudent(true);
        int studentid = updatedInput.getStudentID();
        int subjectid = updatedInput.getSubjectID();
        enrollmentSearcher.setStudentID(studentid);
        enrollmentSearcher.setSubjectID(subjectid);
        Enrollment updated = updatedInput.getUpdatedenrollment();
        LinkedList<Enrollment> enrollents = SystemManage.searchEnrollment(enrollmentSearcher);
        Enrollment enrollment = enrollents.pop();
        SystemManage.editEnrollment(updated);
    }
    public static LinkedList showSubjectsInformation(SearchByStudent searchByStudent) throws Exception{
         LinkedList subjects = new LinkedList<Subject>();
         int id = searchByStudent.getStudentID();
        EnrollmentSearcher enrollmentSearcher = new EnrollmentSearcher();
        enrollmentSearcher.setSearchByStudent(true);
        enrollmentSearcher.setStudentID(id);
        LinkedList<Enrollment> enrollements = SystemManage.searchEnrollment(enrollmentSearcher);
        while (!enrollements.isEmpty()){
            Enrollment enrollment;
            enrollment= enrollements.pop();
            subjects.push(enrollment.getSubject());
        }
        return subjects;
    }
    public static LinkedList searchSubject(SearchBySubject searchBySubject)throws IOException, ClassNotFoundException{
        SubjectSearcher subjectSearcher = new SubjectSearcher();
        int id = searchBySubject.getSubjectID();
        subjectSearcher.setSearchById(true);
        subjectSearcher.setId(id);
        return SystemManage.searchSubject(subjectSearcher);
    }
    public static void loadInformation(SearchByStudent searchByStudent) throws IOException, ClassNotFoundException {
        //TODO sets properties to information
        int uniID = searchByStudent.getStudentID();
        StudentSearcher searcher = new StudentSearcher();
        searcher.setUniID(uniID);
        searcher.setSearchByUniID(true);
        LinkedList <Student>slinkedlist= SystemManage.searchStudent(searcher);
        information.setLastname(slinkedlist.peek().getLastname());
        information.setName(slinkedlist.peek().getName());
        information.setId(slinkedlist.peek().getId());
        information.setUniID(slinkedlist.peek().getUniID());
        information.setBirthDate(slinkedlist.peek().getBirthDate());
        information.setPhoneNum(slinkedlist.peek().getPhoneNum());
        information.setIndex_PersonalInfo(slinkedlist.peek().getIndex_PersonalInfo());
    }
    public static Student displayInformation() {
        return information;
    }

}
