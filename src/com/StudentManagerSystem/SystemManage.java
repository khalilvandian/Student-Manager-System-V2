package com.StudentManagerSystem;

import com.StudentManagerSystem.Controllers.LoginPageController;
import com.StudentManagerSystem.fileHandler.FileManage;
import com.StudentManagerSystem.ui.manager.searchStudent.SearchStudent;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.IOException;
import java.util.DuplicateFormatFlagsException;
import java.util.LinkedList;

public class SystemManage {

    private static IndexManage indexManage = new IndexManage();
    private static UniIDManage uniIDManage = new UniIDManage();
    private static Student studentTmp = new Student();
    private static Student updatedStudentTmp = new Student();
    private static Subject subjectTmp = new Subject();
    private static Subject updatedSubjectTmp = new Subject();
    public  static LinkedList<Pair> CampusCode = new LinkedList<>();
    private static Enrollment enrollmentTmp;

    static class Pair<T,N>{
        T key;
        N value;

        Pair(T key, N value) {
            this.key = key;
            this.value = value;
        }
    }



    //read and save the program in files
    public static void loadProgram() throws IOException, ClassNotFoundException {
        setCampusCode();
        BTreeManage.load();
        indexManage = FileManage.loadIndexManage();
        uniIDManage = FileManage.loadUniIDManage();
    }
    public static void saveProgram() throws IOException {

        BTreeManage.save();
        FileManage.saveIndexManage(indexManage);
        FileManage.saveUniIDManage(uniIDManage);
    }

    //buttons

//    STUDENTS

    public static LinkedList<Student> searchStudent(StudentSearcher searcher)
            throws IOException, ClassNotFoundException {

        StudentSearcher foundSearch = BTreeManage.readStudent(searcher);
        foundSearch.matchFoundIndexes();
        while (!foundSearch.getIndexes().isEmpty()) {
            Student tmp = FileManage.readStudent(foundSearch.popIndexes());
            foundSearch.pushStudent(tmp);
        }
        return foundSearch.getStudents();
    }
    public static Student signupStudent() throws IOException {
        if(BTreeManage.checkDuplicity(studentTmp)) throw new DuplicateFormatFlagsException("ID Error");
        int uniId = uniIDManage.createNewID(97, 0);
        int index = indexManage.addStudent();
        studentTmp.setIndex_PersonalInfo(index);
        studentTmp.setUniID(uniId);
        BTreeManage.createStudent(studentTmp);
        FileManage.createStudent(studentTmp);
        return studentTmp;
    }
    public static Student updateStudent() throws IOException {
        //TODO reconsider the code for checking duplicity
        if (studentTmp.getId() != updatedStudentTmp.getId()) { if (BTreeManage.checkDuplicity(updatedStudentTmp)) throw new DuplicateFormatFlagsException("ID ERROR"); }
        FileManage.updateStudent(studentTmp, updatedStudentTmp);
        BTreeManage.updateStudent(studentTmp, updatedStudentTmp);
        studentTmp.setStudent(updatedStudentTmp);
        updatedStudentTmp = new Student();
        return studentTmp;
    }
    public static Student removeStudent() throws IOException {

        int index;
        index = studentTmp.getIndex_PersonalInfo();
        BTreeManage.deleteStudent(studentTmp);

        indexManage.removeStudent(index);
        FileManage.deleteStudent(studentTmp);// i don't know if it's needed cause if u remove the index the data i considered removed
        return studentTmp;
    }



//    SEMESTERS MANAGING

    public static void addEnrollment(Enrollment enrollment) throws IOException {


        indexManage.createEnrollment(enrollment);
        BTreeManage.createEnrollment(enrollment);
        FileManage.createEnrollment(enrollment);

    }
    public static LinkedList<Enrollment> searchEnrollment(EnrollmentSearcher searcher)
            throws IOException, ClassNotFoundException {
        EnrollmentSearcher result = BTreeManage.readEnrollment(searcher);
        if (searcher.isSearchByStudent() && searcher.isSearchBySubject())
            result.matchResults();
        LinkedList<Integer> indexes = result.getResult();
        LinkedList<Enrollment> searchResults = new LinkedList<>();
        if (indexes == null)
            return null;
        while (!indexes.isEmpty()) {
            int index = indexes.pop();
            Enrollment tmp = FileManage.readEnrollment(index);
            searchResults.push(tmp);
        }

        return searchResults;
    }
    public static void editEnrollment(Enrollment enrollment) {

        if (enrollmentTmp.isPreEnrollment())
            return;
        BTreeManage.updateEnrollment(enrollmentTmp, enrollment);
        FileManage.updateEnrollment(enrollmentTmp, enrollment);
    }
    public static void removeEnrollment(Enrollment enrollment) throws IOException {

        if (enrollment.isPreEnrollment())
            return;
        indexManage.deleteEnrollment(enrollmentTmp);
        BTreeManage.deleteEnrollment(enrollmentTmp);
        FileManage.deleteEnrollment(enrollmentTmp);
    }
    public static void recordEnrollment() {

        if (enrollmentTmp.getStatus() != null && enrollmentTmp.getScore() != -1)
            enrollmentTmp.toPreEnrollment();
    }




//    COURSES AND SUBJECTS MANAGING

    public static Subject addSubject() throws IOException, ClassNotFoundException {
//        todo subjects with the same id r not handled code and id should be managed
        if (!BTreeManage.checkDuplicity(subjectTmp)) {

            int id = uniIDManage.createSubjectID();
            subjectTmp.setID(id);
        }
//        else {
////            searches the subject by title in the condition that it is duplicated and extracts the id as to set to the subject in hand
//
//            SubjectSearcher searcher = new SubjectSearcher();
//            searcher.setSearchByTitle(true);
//            searcher.setTitle(subjectTmp.getTitle());
//            LinkedList<Subject> result = searchSubject(searcher);
//            subjectTmp.setId(result.peek().getDatabaseID()/10);
//            subjectTmp.setCode(result.size()+1);
//            subjectTmp.calculateDatabaseID();
//        }
        int index = indexManage.addSubject();
        subjectTmp.setIndex(index);
        BTreeManage.createSubject(subjectTmp);
        FileManage.createSubject(subjectTmp);
        return subjectTmp;

    }
    public static LinkedList<Subject> searchSubject(SubjectSearcher subjectSearcher) throws IOException, ClassNotFoundException {

        SubjectSearcher foundSearch = BTreeManage.readSubject(subjectSearcher);
        foundSearch.matchResults();
//        results are in the property named "index" as a list
        while (!foundSearch.getIndex().isEmpty()) {
            Subject tmp = FileManage.readSubject(foundSearch.popIndex());
            foundSearch.pushSubject(tmp);
        }
        return foundSearch.getSubjects();
    }
    public static Subject editSubject() throws IOException {

//        if (studentTmp.getId() != updatedStudentTmp.getId()) { if (BTreeManage.checkDuplicity(updatedStudentTmp.getId())) throw new DuplicateFormatFlagsException("ID ERROR"); }
        FileManage.updateSubject(subjectTmp, updatedSubjectTmp);
        BTreeManage.updateSubject(subjectTmp, updatedSubjectTmp);
        subjectTmp.copy(updatedSubjectTmp);
        updatedSubjectTmp = new Subject();
        return subjectTmp;

    }
    public static Subject removeSubject() throws IOException {
//      todo id and code must be set correctly
        indexManage.deleteSubject(subjectTmp.getIndex());
        BTreeManage.deleteSubject(subjectTmp);
        FileManage.deleteSubject(subjectTmp);
        return subjectTmp;
    }



//    USER AUTHENTICATION

    public static Boolean authenticateStudent(int username, String password) {

        StudentSearcher searcher = new StudentSearcher();
        searcher.setSearchByUniID(true);
        searcher.setUniID(username);
        String pass = null;
        try {
            pass = searchStudent(searcher).peek().getPassword();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (pass.equals(password))
            return true;

        return false;
    }
    public static Boolean authenticateManager(int username, int password) {return true;}
    public static Boolean authenticateAdministrator(String username, String password) {return true;}





    //get and set properties
    //get and set properties
    //get and set properties
    //get and set properties
    //get and set properties
    public static void setStudentTmp(Student student) {
        studentTmp.setStudent(student);
    }
    public static Student getStudentTmp() {
        return studentTmp;
    }
    public static void setUpdatedStudentTmp(Student student) {
        updatedStudentTmp.setStudent(student);
    }
    public static void setSubjectTmp(Subject subject) {
        subjectTmp.copy(subject);
    }
    public static void setUpdatedSubjectTmp(Subject subject) {

        updatedSubjectTmp.copy(subject);
    }
    private static void setCampusCode(){
        CampusCode.add(new Pair<Integer, String>(0,"computer"));
        CampusCode.add(new Pair<Integer, String>(1,"electronic"));
    }
    private static String getCampusTitle(int code){
        for (Pair pair : CampusCode) {
            if ((Integer) pair.key == code) {
                return (String) pair.value;
            }
        }
        return null;
    }
    public static void setEnrollmentTmp(Enrollment enrollment) {

        enrollment.setEnrollmentIndex(enrollmentTmp.getEnrollmentIndex());
        enrollment.setSubjectID(enrollmentTmp.getSubjectID());
        enrollment.setStudentID(enrollmentTmp.getStudentID());
        enrollment.setStudentIndex(enrollmentTmp.getStudentIndex());
        enrollment.setSubjectIndex(enrollmentTmp.getSubjectIndex());
    }
}