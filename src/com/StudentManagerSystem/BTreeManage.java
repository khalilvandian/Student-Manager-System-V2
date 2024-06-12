package com.StudentManagerSystem;

import com.StudentManagerSystem.Btree.BPlusTree;
import com.StudentManagerSystem.fileHandler.FileManage;

import java.io.IOException;
import java.util.LinkedList;

public class BTreeManage {


//    SEMESTER BTREE

    private static BPlusTree<Integer,LinkedList<Integer>> semesterStudent = new BPlusTree<>();
    private static BPlusTree<Integer,LinkedList<Integer>> semesterSubject = new BPlusTree<>();


//    STUDENT AND SUBJECT BTREE

    private static BPlusTree<Integer,Integer> studentUniID_btree = new BPlusTree<>();
    private static BPlusTree<Integer,Integer> studentID_btree =new BPlusTree<>();
    private static BPlusTree<String,LinkedList<Integer>> studentName_btree = new BPlusTree<>();
    private static BPlusTree<String,LinkedList<Integer>> studentLastname_btree = new BPlusTree<>();
    private static BPlusTree<String,LinkedList<Integer>> subjectTitle_btree = new BPlusTree<>();
    private static BPlusTree<Integer, Integer>subjectID_btree = new BPlusTree<>();




    public static void load() {

        loadBtree_StudentUniID();
        loadBtree_StudentID();
        loadBtree_StudentName();
        loadBtree_StudentLastname();
        loadBtree_SubjectID();
        loadBtree_SubjectTitle();
    }
    public static void save() {

        saveBtree_StudentID();
        saveBtree_StudentUniID();
        saveBtree_StudentName();
        saveBtree_StudentLastname();
        saveBtree_SubjectID();
        saveBtree_SubjectTitle();
    }

    private static void loadBtree_StudentUniID() {
        // load btree if empty
        try {
            studentUniID_btree = (BPlusTree<Integer, Integer>) FileManage.loadBtree_StudentUniID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentID() {
        try {
            studentID_btree = (BPlusTree<Integer, Integer>) FileManage.loadBtree_StudentID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentName() {
        try {
            studentName_btree = (BPlusTree<String, LinkedList<Integer>>) FileManage.loadBtree_StudentName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_StudentLastname() {
        try {
            studentLastname_btree = (BPlusTree<String, LinkedList<Integer>>) FileManage.loadBtree_StudentLastName();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_SubjectID() {
        try {
            subjectID_btree = (BPlusTree<Integer, Integer>) FileManage.loadBtree_SubjectID();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }
    private static void loadBtree_SubjectTitle() {
        try {
            subjectTitle_btree = (BPlusTree<String, LinkedList<Integer>>) FileManage.loadBtree_SubjectTitle();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println( e.toString() );
        }
    }

    private static void saveBtree_StudentUniID() {
        // save btree if is't empty
        try {
            FileManage.saveBtree_StudentUniID(studentUniID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentName() {
        try {
            FileManage.saveBtree_StudentName(studentName_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentLastname() {
        try {
            FileManage.saveBtree_StudentLastName(studentLastname_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }
    }
    private static void saveBtree_StudentID() {
        try {
            FileManage.saveBtree_StudentID(studentID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }

    }
    private static void saveBtree_SubjectID() {
        try {
            FileManage.saveBtree_SubjectID(subjectID_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }

    }
    private static void saveBtree_SubjectTitle() {
        try {
            FileManage.saveBtree_SubjectTitle(subjectTitle_btree);
        } catch (IOException e) {
            System.out.println( e.toString() );
        }

    }


    //------------------------------------------------------------------------
    //------------------------------------------------------------------------


    @SuppressWarnings("unchecked")
    private static <key extends Comparable<? super key>, value> void createRecord(key input, Integer index, BPlusTree<key, value> bPlusTree) {

        if (input instanceof String){

            LinkedList<Integer> tmp = new LinkedList<>();

            if (bPlusTree.search(input) != null)
                tmp = (LinkedList<Integer>) bPlusTree.search(input);

            tmp.push(index);
            value val = (value) tmp;
            bPlusTree.insert(input, val);
        }

        else if (input instanceof Integer){

            value val = (value) index;
            bPlusTree.insert(input, val);
        }
    }
    private static <key extends Comparable<? super key>, value> value readRecord(key input , BPlusTree<key , value> bPlusTree){
        return bPlusTree.search(input);
    }
    private static <key extends Comparable<? super key>, value> void updateRecord(key input1, key input2, Integer index, BPlusTree<key, value> bPlusTree) {

        if (input1 instanceof String){
            if (!input1.equals(input2)){

                deleteRecord(input1, index, bPlusTree);
                //------------------------------------------------
                LinkedList tmp = (LinkedList<Integer>) bPlusTree.search(input2);
                if (tmp == null)
                    tmp = new LinkedList<>();
                tmp.push(index);
                bPlusTree.insert(input2 , (value) tmp);
            }
        }

        else if(input1 instanceof Integer) {

            if (input1 != input2) {
                bPlusTree.delete(input1);
                bPlusTree.insert(input2, (value) index);
            }
        }

    }
    private static <key extends Comparable<? super key>, value> void deleteRecord(key input, Integer index ,BPlusTree<key , value> bPlusTree){
        if (input instanceof String){

            LinkedList<Integer> tmp = (LinkedList<Integer>) bPlusTree.search(input);
            tmp.remove(tmp.indexOf(index));

            if (tmp.isEmpty())
                bPlusTree.delete(input);
            else
                bPlusTree.insert(input, (value) tmp);
        }

        else if (input instanceof Integer){
            bPlusTree.delete(input);
        }

    }


    //CRUD operations on student personal info

    //add student key and index to BTree

    static void createStudent(Student student) {

        createStudentUniID(student.getUniID() , student.getIndex_PersonalInfo());
        createStudentLastname(student.getLastname() , student.getIndex_PersonalInfo());
        createStudentName(student.getName() , student.getIndex_PersonalInfo());
        createStudentID(student.getId() , student.getIndex_PersonalInfo());
    }

    private static void createStudentUniID(int uniID, int index) {
//        studentUniID_btree.insert(uniID , index);
        createRecord(uniID, index, studentUniID_btree);
    }
    private static void createStudentID(int id, int index) {
//        studentID_btree.insert(id , index);
        createRecord(id, index, studentID_btree);
    }
    private static void createStudentName(String name, int index) {
//        LinkedList<Integer> tmp = new LinkedList<>();
//        if (studentName_btree.search(name) != null) {
//            tmp = studentName_btree.search(name);
//        }
//        tmp.push(index);
//        studentName_btree.insert(name , tmp);
        createRecord(name, index, studentName_btree);
    }
    private static void createStudentLastname(String lastname, int index) {
//        LinkedList<Integer> tmp = new LinkedList<>();
//        if (studentLastname_btree.search(lastname) != null)
//            tmp = studentLastname_btree.search(lastname);
//
//        tmp.push(index);
//        studentLastname_btree.insert(lastname , tmp);
        createRecord(lastname, index, studentLastname_btree);
    }



    //find and return index

    public static StudentSearcher readStudent(StudentSearcher searcher) {

        if (searcher.getSearchByUniID())
            searcher.setIndex(readByStudentUniID(searcher.getUniID()));
        else if (searcher.getSearchByID())
            searcher.setIndex(readByStudentID(searcher.getId()));
        else {

            if (searcher.getSearchByName())
                searcher.setIndexes_name(readByStudentName(searcher.getName()));
            if (searcher.getSearchByLastname())
                searcher.setIndexes_lastname(readByStudentLastname(searcher.getLastname()));
        }
        return searcher;

    }

    private static int readByStudentUniID(int input)    {

        return studentUniID_btree.search(input);
    }
    private static int readByStudentID(int  input)       {

        return studentID_btree.search(input);
    }
    private static LinkedList<Integer> readByStudentName(String input) {

        return studentName_btree.search(input);
    }
    private static LinkedList<Integer> readByStudentLastname(String input) {

        return studentLastname_btree.search(input);
    }


    //update

    public static void updateStudent(Student student1, Student student2) {

        updateStudentID(student1.getId(), student2.getId(), student1.getIndex_PersonalInfo());
        updateStudentUniID(student1.getUniID(), student2.getUniID(), student1.getIndex_PersonalInfo());
        updateStudentName(student1.getName(), student2.getName(), student1.getIndex_PersonalInfo());
        updateStudentLastname(student1.getLastname(), student2.getLastname(), student1.getIndex_PersonalInfo());
    }

    private static void updateStudentUniID(int uniID1, int uniID2, int index) {

//        if (uniID1 != uniID2) {
//
//            studentUniID_btree.delete(uniID1);
//            studentUniID_btree.insert(uniID2, index);
//        }
        updateRecord(uniID1 , uniID2 , index , studentUniID_btree);
    }
    private static void updateStudentID(int id1, int id2, int index) {

//        if (id1 != id2){
//            studentID_btree.delete(id1);
//            studentID_btree.insert(id2, index);
//        }
        updateRecord(id1 , id2 , index , studentID_btree);
    }
    private static void updateStudentName(String name1, String name2, int index) {

//        if (!name1.equals(name2)){
//
//            LinkedList<Integer> tmp ;
//            tmp = studentName_btree.search(name1);
//            tmp.remove(tmp.indexOf(index));
//
//            if (tmp.isEmpty())
//                studentName_btree.delete(name1);
//            else
//                studentName_btree.insert(name1 ,tmp);
//            //------------------------------------------------
//            tmp = studentName_btree.search(name2);
//            if (tmp == null)
//                tmp = new LinkedList<>();
//            tmp.push(index);
//            studentName_btree.insert(name2 , tmp);
//        }
        updateRecord(name1 , name2 , index , studentName_btree);

    }

    private static void updateStudentLastname(String lastname1, String lastname2, int index) {

//        if (lastname1.equals(lastname2)){
//
//            LinkedList<Integer> tmp ;
//            tmp = studentLastname_btree.search(lastname1);
//            tmp.remove(tmp.indexOf(index));
//
//            if (tmp.isEmpty())
//                studentLastname_btree.delete(lastname1);
//            else
//                studentLastname_btree.insert(lastname1 ,tmp);
//            //------------------------------------------------
//            tmp = studentLastname_btree.search(lastname2);
//            if (tmp == null)
//                tmp = new LinkedList<>();
//            tmp.add(index);
//            studentLastname_btree.insert(lastname2 , tmp);
//        }
        updateRecord(lastname1, lastname2, index, studentLastname_btree);
    }


    //remove index records from BTree
    public static void deleteStudent(Student student) {
        deleteStudentID(student.getId(), student.getIndex_PersonalInfo());
        deleteStudentName(student.getName(), student.getIndex_PersonalInfo());
        deleteStudentLastname(student.getLastname(), student.getIndex_PersonalInfo());
        deleteStudentUniID(student.getUniID(), student.getIndex_PersonalInfo());
    }

    private static void deleteStudentUniID(int UniId, int index)    {
//        studentUniID_btree.delete(UniId);
        deleteRecord(UniId, index, studentUniID_btree);
    }
    private static void deleteStudentName(String name, int index)     {

//        LinkedList<Integer> tmp = studentName_btree.search(name);
//        tmp.remove(tmp.indexOf(index));
//        if (tmp.isEmpty())
//            studentName_btree.delete(name);
//        else
//            studentName_btree.insert(name ,tmp);
        deleteRecord(name, index, studentName_btree);
    }
    private static void deleteStudentLastname(String lastname, int index) {

//        LinkedList<Integer> tmp = studentLastname_btree.search(lastname);
//        tmp.remove(tmp.indexOf(index));
//        if (tmp.isEmpty())
//            studentLastname_btree.delete(lastname);
//        else
//            studentLastname_btree.insert(lastname ,tmp);
        deleteRecord(lastname, index, studentLastname_btree);
    }
    private static void deleteStudentID(int id, int index)       {
//        studentID_btree.delete(id);
        deleteRecord(id, index, studentID_btree);
    }

    //add Subject
    //-----------------------------------------------------

//    Read OPS

//    public static SubjectSearcher readSubjects(SubjectSearcher searcher){
//
//        if (searcher.getSearchById()) {
//            searcher.setSearchResultId(subjectID_btree.search(searcher.getId()));
//        }
//        else if(searcher.getSearchByTitle()) {
//            searcher.setSearchResultTitle(subjectTitle_btree.search(searcher.getTitle()));
//        }
//        searcher.matchResults();
//        return searcher;
//    }
//
//    private static LinkedList<Integer> readsubjectsID(int input){
//
//        return subjectID_btree.search(input);
//    }
//    private static LinkedList<Integer> readSubjectTitle(String input) {
//
//        return subjectTitle_btree.search(input);
//    }


//    Create OPS

//    public static void createSubject(Subject subject){
//
//        createSubjectID(subject.getID() , subject.getIndex());
//        createSubjectTitle(subject.getTitle() , subject.getIndex());
//    }
//
//    private static void createSubjectTitle(String title , int index){
//        createRecord(title , index , subjectTitle_btree);
//    }
//    private static void createSubjectID(int id , int index){
//        createRecord(id , index , subjectID_btree);
//    }






    public static void createSubject(Subject subject){

//        update title BTREE
        LinkedList<Integer> tmp = subjectTitle_btree.search(subject.getTitle());
        if(tmp == null) {

            tmp = new LinkedList<>();

//            id set



//            code set
            subject.setCode(0);
        }
        else{

//            code set
            int code = tmp.size();
            subject.setCode(code);
//            todo this way of setting the code has the problem of the the times subjects have been mass deleted
//            todo as in the case of there being left only the code 25 in the list and next code will not be 26 but it will be size which is 1
            while (subjectID_btree.search(subject.calculateDatabaseID()) != null) {
                code++;
                subject.setCode(code);
            }
        }
        tmp.push(subject.getIndex());
        subjectTitle_btree.insert(subject.getTitle() , tmp);

//        update ID BTREE


//        subject.calculateDatabaseID();
//        while (subjectID_btree.search(subject.getDatabaseID())!=null){
//            subject.setCode(subject.getCode()+1);
//            subject.calculateDatabaseID();
//        }
        int id = subject.calculateDatabaseID();
        subjectID_btree.insert(id, subject.getIndex());
    }

//    todo methods must be divided into these 2 below
    private static void createSubjectID(Subject subject) {}
    private static void createSubjectTitle(Subject subject) {}

//    read subject methods

    public  static SubjectSearcher readSubject(SubjectSearcher searcher){
//        todo returning a list of indexes has the problem of id loss since code is not documented ... it might be better to return a list of students
        if (searcher.getSearchById()) {

            searcher.setSearchResultId(subjectID_btree.searchRange(searcher.getId()*100, BPlusTree.RangePolicy.INCLUSIVE, (searcher.getId()+1)*100, BPlusTree.RangePolicy.EXCLUSIVE));
        }
        else if(searcher.getSearchByTitle()) {
            searcher.setSearchResultTitle(subjectTitle_btree.search(searcher.getTitle()));
        }
        searcher.matchResults();
        return searcher;
    }

    public static void updateSubject(Subject s1, Subject s2){

        updateSubjectID(s1.calculateDatabaseID(), s2.calculateDatabaseID(), s1.getIndex(), subjectID_btree);
        updateSubjectTitle(s1.getTitle(), s2.getTitle(), s1.getIndex(), subjectTitle_btree);
    }
//    todo methods are written in generic and r a bit suspicious :(
    private static void updateSubjectID(int id1, int id2, int index, BPlusTree tree) {

        updateRecord(id1, id2, index, tree);
    }
    private static void updateSubjectTitle(String title1, String title2, int index, BPlusTree tree) {

        updateRecord(title1, title2, index, tree);
    }

//    public static void updateSubjectByID(Subject subject1 , Subject subject2 , int index){
////        subjectTitle_btree.search(index);
//        LinkedList<Integer> tmp = new LinkedList<>();
//        if (subject1.getID()!=subject2.getID()) {
//            tmp.remove(subject1.getID());
//            tmp.push(subject2.getID());
//        }
//
//    }
//    public static void updateSubjectByTitle(Subject subject1 , Subject subject2 , int index){
//        subjectID_btree.search(index);
//        LinkedList<Integer> tmp = new LinkedList<>();
//        if (subject1.getID()!=subject2.getID()) {
//            tmp.remove(subject1.getID());
//            tmp.push(subject2.getID());
//        }
//
//    }

    public static void deleteSubject(Subject subject){

        LinkedList tmp = subjectTitle_btree.search(subject.getTitle());
        tmp.remove(tmp.indexOf(subject.getIndex()));

        if (tmp.isEmpty())
            subjectTitle_btree.delete(subject.getTitle());
        subjectID_btree.delete(subject.calculateDatabaseID());

    }

    //    todo methods must be divided into these 2 below
    private static void deleteSubjectID(Subject subject) {}
    private static void deleteSubjectTitle(Subject subject) {}




//    Update OPS

//    public static void updateSubject(Subject subject1 , Subject subject2){
//        updateSubjectID(subject1.getID() , subject2.getID() , subject1.getIndex());
//        updateStudentTitle(subject1.getTitle() , subject2.getTitle() , subject1.getIndex());
//    }
//
//    private static void updateSubjectID(int id1, int id2, int index) {
//        updateRecord(id1 , id2 , index , subjectID_btree);
//    }
//    private static void updateStudentTitle(String title1, String title2, int index) {
//        updateRecord(title1 , title2 , index , subjectTitle_btree);
//
//
//    }



//    Delete OPS

//    public static void deleteSubject(Subject subject){
//        deleteSubjectID(subject.getID() , subject.getIndex());
//        deleteSubjectTitle(subject.getTitle() , subject.getIndex());
//    }
//
//    private static void deleteSubjectID(int id , int index){
//
//        deleteRecord(id , index , subjectID_btree);
//    }
//    private static void deleteSubjectTitle(String title , int index){
//        deleteRecord(title , index , subjectTitle_btree);
//    }




//    SEMESTER MANAGE
//    SEMESTER MANAGE


    public static void createEnrollment(Enrollment enrollment) {

        int studentID = enrollment.getStudentID();
        int subjectID = enrollment.getSubjectID();
        int studentIndex = studentUniID_btree.search(studentID);
        int subjectIndex = subjectID_btree.search(subjectID);
        int index     = enrollment.getEnrollmentIndex();

//        SET THE INDEXES OF STUDENT AND SUBJECT IN ENROLLMENT CLASS
        enrollment.setStudentIndex(studentIndex);
        enrollment.setSubjectIndex(subjectIndex);

//    SET SEMESTER STUDENT INDEX IN BTREE
        LinkedList<Integer> tmp = semesterStudent.search(studentID);

        if (tmp == null) {
            tmp = new LinkedList<Integer>();
        }
        tmp.push(index);
        semesterStudent.insert(studentID, tmp);


//    SET SEMESTER SUBJECT INDEX IN BTREE
        tmp = semesterSubject.search(subjectID);

        if (tmp == null) {
            tmp = new LinkedList<Integer>();
        }
        tmp.push(index);
        semesterSubject.insert(subjectID, tmp);



    }
    public static EnrollmentSearcher  readEnrollment(EnrollmentSearcher searcher) {

        LinkedList tmp = new LinkedList<>();
        if (searcher.isSearchBySubject() && searcher.isSearchByStudent()) {

            searcher.setStudentResult(semesterStudent.search(searcher.getStudentID()));
            searcher.setSubjectResult(semesterSubject.search(searcher.getSubjectID()));

            searcher.matchResults();
            if (searcher.getResult() == null)
                return null;
            return searcher;
        }

        else if (searcher.isSearchByStudent()) {
            searcher.setResult(semesterStudent.search(searcher.getStudentID()));
            return searcher;
        }

        else if (searcher.isSearchBySubject()) {
            searcher.setResult(semesterSubject.search(searcher.getSubjectID()));
            return searcher;
        }

        return null;
    }
    public static void updateEnrollment(Enrollment enrollment1, Enrollment enrollment2) {

        updateEnrollmentStudent(enrollment1.getStudentID(), enrollment2.getStudentID(), enrollment1.getEnrollmentIndex());
        updateEnrollmentSubject(enrollment1.getSubjectID(), enrollment2.getSubjectID(), enrollment1.getEnrollmentIndex());
    }
    private static void updateEnrollmentStudent(int id, int id2, int index) {

        if (id != id2) {

            deleteEnrollmentStudent(id, index);

            LinkedList tmp = semesterStudent.search(id2);
            if (tmp == null)
                tmp = new LinkedList();

            tmp.push(index);
            semesterStudent.insert(id2, tmp);
        }
    }
    private static void updateEnrollmentSubject(int id, int id2, int index){

        if(id!= id2){

            deleteEnrollmentSubject(id,index);

            LinkedList tmp=semesterSubject.search(id2);

            if(tmp==null)
               tmp=new LinkedList();

            tmp.push(index);
            semesterSubject.insert(id2,tmp);
        }
    }
    public static void deleteEnrollment(Enrollment enrollment) {

       Boolean a = deleteEnrollmentStudent(enrollment.getStudentID(), enrollment.getEnrollmentIndex());
       Boolean b = deleteEnrollmentSubject(enrollment.getSubjectID(), enrollment.getEnrollmentIndex());
//       if (!(a & b))
//           throw error;
//        todo throw the delete un successful error
    }

    private static Boolean deleteEnrollmentStudent(int studentID, int index) {

        LinkedList tmp = semesterStudent.search(studentID);
        for (int i = 0; i < tmp.size(); i++) {
            if ((int) tmp.get(i) == index) {
                tmp.remove(i);
                if (tmp.isEmpty())
                    semesterStudent.delete(studentID);
                return true;
            }
        }
        return false;
    }
    private static Boolean deleteEnrollmentSubject(int subjectID, int index) {

        LinkedList tmp = semesterSubject.search(subjectID);
        for (int i = 0; i < tmp.size(); i++) {
            if ((int) tmp.get(i) == index) {
                tmp.remove(i);
                if (tmp.isEmpty())
                    semesterSubject.delete(subjectID);
                return true;
            }
        }
        return false;
    }


    public static void createPreEnrollment(PreEnrollment preEnrollment) {}
    public static void readPreEnrollment(PreEnrollment preEnrollment) {}




    public static <type> boolean checkDuplicity(type input){

        if (input instanceof Subject) {
            return subjectTitle_btree.search(((Subject) input).getTitle()) != null;
        }
        else
            return studentID_btree.search(((Student) input).getId()) != null;
    }

}