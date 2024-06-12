package com.StudentManagerSystem.Controllers;

import com.StudentManagerSystem.*;

import javax.naming.Name;
import java.io.IOException;
import java.util.LinkedList;

public class StudentManagerPageController {

    private static Student information = new Student();
    public class SearchByStudent{
        String studentID;

        public int getStudentID() {
            return Integer.parseInt(studentID);
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }
    }
    public static class StudentInput{
        Student student;

        public StudentInput(Student student, Student updatedStudent) {
            this.student = student;
            this.updatedStudent = updatedStudent;
        }

        Student updatedStudent;

        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public Student getUpdatedStudent() {
            return updatedStudent;
        }

        public void setUpdatedStudent(Student updatedStudent) {
            this.updatedStudent = updatedStudent;
        }
    }
    public static class SubjectInput{
        public SubjectInput(Subject subject, Subject updatedsubject) {
            this.subject = subject;
            this.updatedsubject = updatedsubject;
        }

        Subject subject;
        Subject updatedsubject;

        public Subject getSubject() {
            return subject;
        }

        public void setSubject(Subject subject) {
            this.subject = subject;
        }

        public Subject getUpdatedsubject() {
            return updatedsubject;
        }

        public void setUpdatedsubject(Subject updatedSubject) {
            this.updatedsubject = updatedSubject;
        }
    }
    public static Student studentTmp;
    public static Subject subjectTmp;

    private static void loadStudentsInformation(int uniID) throws IOException, ClassNotFoundException{
        StudentSearcher searcher = new StudentSearcher();
        searcher.setUniID(uniID);
        searcher.setSearchByUniID(true);
        LinkedList<Student> slinkedlist= SystemManage.searchStudent(searcher);
        information.setLastname(slinkedlist.peek().getLastname());
        information.setName(slinkedlist.peek().getName());
        information.setId(slinkedlist.peek().getId());
        information.setUniID(slinkedlist.peek().getUniID());
        information.setBirthDate(slinkedlist.peek().getBirthDate());
        information.setPhoneNum(slinkedlist.peek().getPhoneNum());
        information.setIndex_PersonalInfo(slinkedlist.peek().getIndex_PersonalInfo());
    }
    public static Student displayInformation(int uniID) throws IOException, ClassNotFoundException {
        loadStudentsInformation(uniID);
        return information;
    }
    public static void loadSemesterSubjects(){}
    public static void loadAllSubjects(){}
    public static void loadAllSubjectsOfFaculty(){}
    public static void updateInformation(){}
    public static Subject addSubject(SubjectInput subjectInput) throws IOException, ClassNotFoundException {
        Subject subject = subjectInput.getSubject();
        SystemManage.setSubjectTmp(subject);
        return SystemManage.addSubject();
    }
    public static void removeSubject(SubjectInput subjectInput) throws IOException {
        Subject subject = subjectInput.getSubject();
        SystemManage.setSubjectTmp(subject);
        SystemManage.removeSubject();
    }
    public static LinkedList<Subject> searchsubjectByID(int id)
            throws IOException, ClassNotFoundException {
        SubjectSearcher subjectSearcher = new SubjectSearcher();
        subjectSearcher.setSearchById(true);
        subjectSearcher.setId(id);
        return SystemManage.searchSubject(subjectSearcher);
    }
    public static void SearchsubjectByTitle(SubjectInput subjectInput) throws IOException, ClassNotFoundException{
        Subject subject = subjectInput.getSubject();
        SystemManage.setSubjectTmp(subject);
        SubjectSearcher subjectSearcher = new SubjectSearcher();
        subjectSearcher.setSearchByTitle(true);
        subjectSearcher.setTitle(subject.getTitle());
        SystemManage.searchSubject(subjectSearcher);
    }
    public static void updateSubject(SubjectInput subjectInput) throws IOException {
        Subject subject1 = subjectInput.getSubject();
        Subject subject2 = subjectInput.getUpdatedsubject();
        SystemManage.setSubjectTmp(subject1);
        SystemManage.setUpdatedSubjectTmp(subject2);
        SystemManage.editSubject();
    }
    public static int addStudent(StudentInput studentInput) throws IOException{
        Student student = studentInput.getStudent();
        SystemManage.setStudentTmp(student);
        return SystemManage.signupStudent().getUniID();
    }
    public static void removeStudent(StudentInput studentInput) throws IOException{
        Student student = studentInput.getStudent();
        SystemManage.setStudentTmp(student);
        SystemManage.removeStudent();
    }
    public static void updatedStudent(StudentInput studentInput) throws IOException{
        Student student1 = studentInput.getStudent();
        Student student2 = studentInput.getUpdatedStudent();
        SystemManage.setStudentTmp(student1);
        SystemManage.setUpdatedStudentTmp(student2);
        SystemManage.updateStudent();
    }
    public static LinkedList<Student> searchStudent(String name, String lastName, int ID, int UniId) throws IOException, ClassNotFoundException {
        StudentSearcher searcher = new StudentSearcher();

        searcher.setSearchByUniID(UniId != 0);
        searcher.setSearchByID(ID != 0);
        searcher.setSearchByName(name != null);
        searcher.setSearchByLastname(lastName != null);

        searcher.setName(name);
        searcher.setLastname(lastName);
        searcher.setId(ID);
        searcher.setUniID(UniId);

        return SystemManage.searchStudent(searcher);
    }
}
