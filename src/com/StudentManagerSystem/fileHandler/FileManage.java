/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem.fileHandler;

import com.StudentManagerSystem.*;
import com.StudentManagerSystem.Btree.BPlusTree;

import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.LinkedList;

public class FileManage {

    private static LinkedList <FiledData> fieldData = new LinkedList<>();
    private static int index=0;

    //standard sizes
    private static int String_10bit = 17;
    private static int String_20bit = 27;
    private static int String_30bit = 37;
    private static int INTEGER = 81;

    private static int nameSize = String_30bit;
    private static int lastNameSize = String_30bit;
    private static int IDSize = INTEGER;
    private static int uniIDSize = INTEGER;
    private static int birthdateSize = String_10bit;
    private static int phoneNumberSize = String_20bit;
    private static int passwordSize = String_30bit;


    private static int id_size = INTEGER;
    private static int capacity_size = INTEGER;
    private static int unitVal_size = INTEGER;
    private static int title_size = String_30bit;
    private static int professorName_size = String_20bit;
    private static int examDate_size = String_10bit;
    private static int classTiming_Size = 33;

    private static int studentEnrolmentData_Size = INTEGER;
    private static int subjectEnrolmentData_Size = INTEGER;


    private static int student_lineSize = nameSize + lastNameSize + IDSize + uniIDSize + birthdateSize + phoneNumberSize+ passwordSize;
    private static int subject_lineSize = id_size + capacity_size + unitVal_size + title_size + professorName_size + examDate_size + classTiming_Size;
    private static int enrollment_lineSize = studentEnrolmentData_Size + subjectEnrolmentData_Size;

    //file paths
    private static String studentFile_filePath = "./src/com/StudentManagerSystem/fileHandler/data/studentFile.dump";
    private static String subjectFile_filePath = "./src/com/StudentManagerSystem/fileHandler/data/subjectFile.dump";
    private static String enrolmentFile_filePath = "./src/com/StudentManagerSystem/fileHandler/data/subjectFile.dump";

    private static String btree_StudentUniID_filePath = "./src/com/StudentManagerSystem/fileHandler/data/Btree_UniID.dump";
    private static String btree_StudentName_filePath = "./src/com/StudentManagerSystem/fileHandler/data/Btree_Name.dump";
    private static String btree_StudentLastName_filePath = "./src/com/StudentManagerSystem/fileHandler/data/Btree_Lastname.dump";
    private static String btree_StudentID_filePath = "./src/com/StudentManagerSystem/fileHandler/data/Btree_ID.dump";
    private static String btree_SubjectID_filePath = "./src/com/StudentManagerSystem/fileHandler/data/Btree_SubjectID.dump";
    private static String btree_SubjectTitle_filePath = "./src/com/StudentManagerSystem/fileHandler/data/Btree_SubjectTitle.dump";
    private static String class_UniIDManage_filePath = "./src/com/StudentManagerSystem/fileHandler/data/UniIDManage.dump";
    private static String class_IndexManage_filePath = "./src/com/StudentManagerSystem/fileHandler/data/IndexManage.dump";

    private static String name_id = "name";
    private static String lastName_id = "lastName";
    private static String id_id = "id";
    private static String uniId_id = "uniId";
    private static String birthDate_id = "birthDate";
    private static String phoneNum_id = "phoneNum";
    private static String password_id = "password";


    private static String subjectId_id = "id";
    private static String capacity_id = "capacity";
    private static String unitVal_id = "unitVal";
    private static String title_id  = "title";
    private static String professorName_id = "professorName";
    private static String examDate_id = "examDate";
    private static String classTiming_id = "classTiming";

    private static String subjectEnrolment_id = "subjectEnrolment";
    private static String studentEnrolment_id = "studentEnrolment";


    static class FiledData {
        int size;
        String id;
        Object data;

        FiledData(Object data, String id, int size) {
            this.size = size;
            this.id = id;
            this.data = data;
        }
    }

    private static String toWords(String s){
        StringBuilder tmp = new StringBuilder(s);
        int i =0;
        while(i < tmp.length()) {
            if (tmp.charAt(i) == ' ' && tmp.charAt(i+1) == ' '){
                tmp.delete(i,i+2);
            }else if(i == 0 && tmp.charAt(i) == ' ') {
                tmp.delete(i,i+1);
            }
            else {
                i++;
            }
        }
        return tmp.toString();
    }
    private static byte[] concatenate(int size) throws IOException {
        // Function to merge two arrays of
        // same type
        LinkedList<byte[]> bytes = new LinkedList<>();

        for (FiledData aFieldData : fieldData) {
            bytes.add(FileIO.objectToByte(aFieldData.data));
        }

        byte[] combined = new byte[size];
        for (int i=0; i< fieldData.size(); i++) {
            System.arraycopy(bytes.get(i), 0, combined, getPosition(fieldData.get(i).id), bytes.get(i).length);
        }
        return combined;
    }
    private static LinkedList<FiledData> setStudentDataLinkedList(Student student){
        LinkedList <FiledData> data = new LinkedList<>();
        if (student == null){
            data.add( getString_FiledData("", nameSize, name_id));
            data.add( getString_FiledData("", lastNameSize, lastName_id));
            data.add( getString_FiledData("", birthdateSize, birthDate_id));
            data.add( getString_FiledData("", phoneNumberSize, phoneNum_id));
            data.add( getInteger_FiledData(0,id_id));
            data.add( getInteger_FiledData(0,uniId_id));
            data.add( getString_FiledData("", passwordSize, password_id));

        }else{
            index = student.getIndex_PersonalInfo();
            data.add( getString_FiledData(student.getName(), nameSize, name_id));
            data.add( getString_FiledData(student.getLastname(), lastNameSize, lastName_id));
            data.add( getString_FiledData(student.getBirthDate(), birthdateSize, birthDate_id));
            data.add( getString_FiledData(student.getPhoneNum(), phoneNumberSize, phoneNum_id));
            data.add( getInteger_FiledData(student.getId(),id_id));
            data.add( getInteger_FiledData(student.getUniID(),uniId_id));
            data.add( getString_FiledData("", passwordSize, password_id));
        }
        fieldData = data;
        return data;
    }
    private static LinkedList<FiledData> setSubjectDataLinkedList(Subject subject){
        LinkedList <FiledData> data = new LinkedList<>();
        if (subject == null){
            data.add( getString_FiledData("",title_size, title_id));
            data.add( getString_FiledData("",professorName_size, professorName_id));
            data.add( getString_FiledData("",examDate_size, examDate_id));
            data.add( getInteger_FiledData(0,subjectId_id));
            data.add( getInteger_FiledData(0,capacity_id));
            data.add( getInteger_FiledData(0,unitVal_id));
            data.add( new FiledData("", classTiming_id, classTiming_Size));
        }else{
            index = subject.getIndex();
            data.add( getString_FiledData(subject.getTitle(),title_size, title_id));
            data.add( getString_FiledData(subject.getProfessorName(),professorName_size, professorName_id));
            data.add( getString_FiledData(DateUtil.format(subject.getExamDate()),examDate_size, examDate_id));
            data.add( getInteger_FiledData(subject.getID(),subjectId_id));
            data.add( getInteger_FiledData(subject.getCapacity(),capacity_id));
            data.add( getInteger_FiledData(subject.getUnitVal(),unitVal_id));
            data.add( new FiledData(subject.getClassTiming().toString(), classTiming_id, classTiming_Size));
        }
        fieldData = data;
        return data;
    }
    private static LinkedList<FiledData> setEnrolmentDataLinkedList(Enrollment enrollment){
        LinkedList <FiledData> data = new LinkedList<>();
        if (enrollment == null){
            data.add( getInteger_FiledData(0, studentEnrolment_id));
            data.add( getInteger_FiledData(0, subjectEnrolment_id));
        }else{
            index = enrollment.getEnrollmentIndex();
            data.add( getInteger_FiledData(enrollment.getStudentIndex(), studentEnrolment_id));
            data.add( getInteger_FiledData(enrollment.getSubjectIndex(), subjectEnrolment_id));
        }
        fieldData = data;
        return data;
    }
    private static FiledData getString_FiledData (String data, int size, String id){
        return new FiledData(String.format("%" + (size-7) +"s",data) , id, size);
    }
    private static FiledData getInteger_FiledData (int data, String id){
        return new FiledData(data ,id, INTEGER);
    }
    private static int getPosition(String id){
        int start=0;
        for (FiledData aFieldData : fieldData) {
            if (aFieldData.id.equals(id)) {
                break;
            }
            start += aFieldData.size;
        }
        return start;
    }
    private static FiledData getDataWithId(String id, LinkedList<FiledData> search){
        for (FiledData aFieldData : search) {
            if (aFieldData.id.equals(id)) {
                return aFieldData;
            }
        }
        return null;
    }

    private static Object readData(String id, byte[] bytes)
            throws IOException, ClassNotFoundException {
        byte[] tmp = new byte[getDataWithId(id, fieldData).size];
        System.arraycopy(bytes, getPosition(id), tmp,0, getDataWithId(id, fieldData).size);
        Object o;

        try{ o = FileIO.bytesToObject(tmp); }
        catch (StreamCorruptedException e){ o = null; }
        return o;
    }
    private static void writeData(String filePath, String id, Object data, int index)
            throws IOException {
        byte[] tmp;
        tmp = FileIO.objectToByte(data);
        FileIO.writeToFile(filePath, tmp, index * getPosition(id));
    }


    public static void createStudent(Student student)
            throws IOException {
        int index = student.getIndex_PersonalInfo();
        setStudentDataLinkedList(student);

        byte[] bytes = concatenate(student_lineSize);
        FileIO.writeIndexToFile(studentFile_filePath, bytes, index, student_lineSize);
    }
    public static Student readStudent(int index)
            throws IOException, ClassNotFoundException {
        byte[] bytes = FileIO.readIndexFromFile(studentFile_filePath, index, student_lineSize);
        setStudentDataLinkedList(null);
        Student s = new Student();

        s.setIndex_PersonalInfo(index);
        s.setName(  toWords((String) readData(name_id,bytes))  );
        s.setLastname(  toWords((String) readData(lastName_id,bytes))  );
        s.setUniID((Integer) readData(uniId_id,bytes));
        s.setId((Integer) readData(id_id,bytes));
        s.setBirthDate(toWords((String) readData(birthDate_id,bytes)));
        s.setPhoneNum(toWords((String) readData(phoneNum_id,bytes)));
        s.setPassword(  toWords((String) readData(password_id,bytes))  );

        return s;
    }
    public static void updateStudent(Student studentBefore, Student studentAfter)
            throws IOException {
         LinkedList <FiledData> before = setStudentDataLinkedList(studentBefore);
         LinkedList <FiledData> after = setStudentDataLinkedList(studentAfter);

         for (int i=0; i < before.size(); i++){
             if (before.get(i).data instanceof String){
                 if (!((String) before.get(i).data).equals((String) (after.get(i).data))){
                     writeData(studentFile_filePath, after.get(i).id, after.get(i).data, studentBefore.getIndex_PersonalInfo());
                 }
             }else{
                 if (before.get(i).data != (after.get(i).data)){
                     writeData(studentFile_filePath, after.get(i).id, after.get(i).data, studentBefore.getIndex_PersonalInfo());
                 }
             }
         }
    }
    public static void deleteStudent(Student student)
            throws IOException {
        byte[] bytes = new byte[student_lineSize];
        FileIO.writeIndexToFile(studentFile_filePath, bytes, student.getIndex_PersonalInfo(), student_lineSize);
    }



    public static void createSubject(Subject subject)
            throws IOException {
        int index = subject.getIndex();
        setSubjectDataLinkedList(subject);
        byte[] bytes = concatenate(subject_lineSize);
        FileIO.writeIndexToFile(subjectFile_filePath, bytes, index, subject_lineSize);
    }
    public static Subject readSubject(int index)
            throws IOException, ClassNotFoundException {
        byte[] bytes = FileIO.readIndexFromFile(subjectFile_filePath, index, subject_lineSize);
        setSubjectDataLinkedList(null);
        Subject s = new Subject();

        s.setIndex(index);
        s.setUnitVal( (Integer)readData(unitVal_id,bytes));
        s.setTitle( toWords((String)readData(title_id,bytes)) );
        s.setProfessorName( toWords((String) readData(professorName_id,bytes)) );
        s.setExamDate( DateUtil.parse(toWords((String)readData(examDate_id,bytes))));
        s.setId( (Integer)readData(subjectId_id,bytes));
        s.setCapacity( (Integer)readData(capacity_id,bytes));
        s.setClassTiming( Subject.ClassTiming.ToclassTiming((String)readData(classTiming_id,bytes)) );
        return s;
    }
    public static void updateSubject(Subject subjectBefore, Subject subjectAfter)
            throws IOException {

        LinkedList <FiledData> before = setSubjectDataLinkedList(subjectBefore);
        LinkedList <FiledData> after = setSubjectDataLinkedList(subjectAfter);

        for (int i=0; i < before.size(); i++){
            if (before.get(i).data instanceof String){
                if (!((String) before.get(i).data).equals((String) (after.get(i).data))){
                    writeData(subjectFile_filePath, after.get(i).id, after.get(i).data, subjectBefore.getIndex());
                }
            }else{
                if (before.get(i).data != (after.get(i).data)){
                    writeData(subjectFile_filePath, after.get(i).id, after.get(i).data, subjectBefore.getIndex());
                }
            }
        }
    }
    public static void deleteSubject(Subject subject)
            throws IOException {

        byte[] bytes = new byte[subject_lineSize];
        FileIO.writeIndexToFile(subjectFile_filePath, bytes, subject.getIndex(), subject_lineSize);
    }


    public static void createEnrollment(Enrollment enrollment) throws IOException {
        int index = enrollment.getEnrollmentIndex();
        setEnrolmentDataLinkedList(enrollment);

        byte[] bytes = concatenate(enrollment_lineSize);
        FileIO.writeIndexToFile(enrolmentFile_filePath, bytes, index, enrollment_lineSize);
    }
    public static Enrollment readEnrollment(int input)
            throws IOException, ClassNotFoundException {

        byte[] bytes = FileIO.readIndexFromFile(enrolmentFile_filePath, input, enrollment_lineSize);
        setEnrolmentDataLinkedList(null);

        Enrollment enrollment = new Enrollment();
        enrollment.setSubjectIndex( (Integer)readData(subjectEnrolment_id,bytes) );
        enrollment.setStudentIndex( (Integer)readData(studentEnrolment_id,bytes) );
        return enrollment;
    }
    public static void updateEnrollment(Enrollment enrollment1, Enrollment enrollment2) {
        //TODO
    }
    public static void deleteEnrollment(Enrollment enrollment) throws IOException {
        byte[] bytes = new byte[enrollment_lineSize];
        FileIO.writeIndexToFile(enrolmentFile_filePath, bytes, index, enrollment_lineSize);
    }
///////////////////////////////////////////////////////////////////////


    private static String emptyString(int size) {
        return String.format("%" + (size - 7) + "s", "");
    }
    private static Integer emptyInteger() {
        return 0;
    }


    //load and save the btree's in file
    public static BPlusTree loadBtree_StudentName()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentName_filePath);
    }
    public static BPlusTree loadBtree_StudentLastName()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentLastName_filePath);
    }
    public static BPlusTree loadBtree_StudentID()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentID_filePath);
    }
    public static BPlusTree loadBtree_StudentUniID()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_StudentUniID_filePath);
    }
    public static BPlusTree loadBtree_SubjectID()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_SubjectID_filePath);
    }
    public static BPlusTree loadBtree_SubjectTitle()
            throws IOException, ClassNotFoundException {
        return (BPlusTree) FileIO.readAnObjectFromFile(btree_SubjectTitle_filePath);
    }



    public static void saveBtree_StudentName(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentName_filePath, o);
    }
    public static void saveBtree_StudentLastName(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentLastName_filePath, o);
    }
    public static void saveBtree_StudentID(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentID_filePath, o);
    }
    public static void saveBtree_StudentUniID(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_StudentUniID_filePath, o);
    }
    public static void saveBtree_SubjectID(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_SubjectID_filePath, o);
    }
    public static void saveBtree_SubjectTitle(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(btree_SubjectTitle_filePath, o);
    }


    public static UniIDManage loadUniIDManage()
            throws IOException, ClassNotFoundException {
        return (UniIDManage) FileIO.readAnObjectFromFile(class_UniIDManage_filePath);
    }
    public static IndexManage loadIndexManage()
            throws IOException, ClassNotFoundException {
        return (IndexManage) FileIO.readAnObjectFromFile(class_IndexManage_filePath);
    }
    public static void saveUniIDManage(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(class_UniIDManage_filePath, o);
    }
    public static void saveIndexManage(Object o)
            throws IOException {
        FileIO.writeAnObjectToFile(class_IndexManage_filePath, o);
    }
}
