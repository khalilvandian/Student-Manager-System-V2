package com.StudentManagerSystem.view;

import com.StudentManagerSystem.*;

import java.io.IOException;
import java.lang.invoke.WrongMethodTypeException;
import java.time.LocalDate;
import java.util.DuplicateFormatFlagsException;
import java.util.LinkedList;
import javax.swing.*;

/**
 * @author Amir
 */
public class Manager_View extends javax.swing.JFrame {

    private Student studentTemp = new Student();
    private Subject subjectTemp = new Subject();
    private LinkedList<Student> searchResult = new LinkedList<>();

    public Manager_View() {

        try { SystemManage.loadProgram(); } catch (IOException | ClassNotFoundException e) {
            try { SystemManage.saveProgram();}
            catch (IOException e1) { showErrorMassage("Problem in load the files, restart the program"); }
        }

        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        editInfo_btn = new javax.swing.JToggleButton();
        deleteStudent_btn = new javax.swing.JToggleButton();
        searchStudent_btn = new javax.swing.JToggleButton();
        jLabel32 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        uniId_searchField = new javax.swing.JTextField();
        name_searchField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        id_searchField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        lastName_searchField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        birthdateYearCB = new javax.swing.JComboBox<>();
        birthdateMonthCB = new javax.swing.JComboBox<>();
        birthdateDayCB = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchList = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        JtextId = new javax.swing.JTextField();
        nameFiled_signUp = new javax.swing.JTextField();
        lastNameFiled_signUp = new javax.swing.JTextField();
        signUp = new javax.swing.JToggleButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        birthdateYearCB_signUp = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        copyTextBut = new javax.swing.JToggleButton();
        idFiled_signUp = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        phoneNumberFiled_signUp = new javax.swing.JTextField();
        birthdateMonthCB_signUp = new javax.swing.JComboBox<>();
        birthdateDayCB_signUp = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        addEditeUniNumberField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addCourseToStudent_btn = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        deleteCourseStudent_btn = new javax.swing.JToggleButton();
        addEditeCourseIDField = new javax.swing.JTextField();
        addEditeCourseCodeField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CheckUniNumberField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        checkCourseStudent_btn = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CourseList = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        subjectTitle_Field = new javax.swing.JTextField();
        subjectCode_field = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        exameDate_field = new javax.swing.JTextField();
        addLesson_btn = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProfessorName_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Capacity_field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        subjectValue_field = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        subjectTitleEdit_feld = new javax.swing.JTextField();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        ExameDateEdit_feld = new javax.swing.JTextField();
        getSubject_btn = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        getCode_field = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        editLesson_btn = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        professorNameEdit_field = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        capacityEdit_field = new javax.swing.JTextField();
        unitValueEdit_field = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        deleteCource = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("name:");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Last Name:");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("ID:");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("نیم سال:");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Phone Number:");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Birthdate:");

        idField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        idField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        nameField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lastNameField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        phoneNumberField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        phoneNumberField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextField18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        editInfo_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        editInfo_btn.setText("Edit Information");
        editInfo_btn.setEnabled(false);
        editInfo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInfo_btnActionPerformed(evt);
            }
        });

        deleteStudent_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        deleteStudent_btn.setForeground(new java.awt.Color(255, 0, 0));
        deleteStudent_btn.setText("Delete Student");
        deleteStudent_btn.setEnabled(false);
        deleteStudent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudent_btnActionPerformed(evt);
            }
        });

        searchStudent_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        searchStudent_btn.setText("Search");
        searchStudent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchStudent_btnActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel32.setText("University ID:");

        uniId_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        uniId_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        name_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        name_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setText("ID:");

        id_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        id_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel41.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel41.setText("Lastname:");

        lastName_searchField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastName_searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel42.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel42.setText("Name:");

        birthdateYearCB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateYearCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1370", "1371", "1372", "1373", "1374", "1375", "1376", "1377", "1378", "1379", "1380", "1381", "1382", "1383", "1384", "1385", "1386", "1387", "1388", "1389", "1390", "1391", "1392", "1393", "1394", "1395", "1396", "1397", "1398", "1399", "1400" }));
        birthdateYearCB.setToolTipText("");

        birthdateMonthCB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateMonthCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        birthdateMonthCB.setToolTipText("");

        birthdateDayCB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateDayCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        birthdateDayCB.setToolTipText("");

        searchList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(searchList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(birthdateYearCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(birthdateMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(birthdateDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(1, 1, 1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteStudent_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editInfo_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(104, 104, 104))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addGap(22, 22, 22)))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(uniId_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_searchField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName_searchField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(searchStudent_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(uniId_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName_searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchStudent_btn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdateYearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdateMonthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthdateDayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(deleteStudent_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editInfo_btn)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Student Info", jPanel6);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student sign up", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Name:");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Last name:");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("شماره ی دانشجویی:");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("نیم سال:");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("رشته:");

        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Birtdate:");

        JtextId.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JtextId.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        JtextId.setEnabled(false);

        nameFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nameFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lastNameFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lastNameFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        signUp.setText("Sigh Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مهندسی کامپیوتر", "علوم کامپیوتر", "مهندسی برق" }));
        jComboBox1.setToolTipText("");

        birthdateYearCB_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateYearCB_signUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1370", "1371", "1372", "1373", "1374", "1375", "1376", "1377", "1378", "1379", "1380", "1381", "1382", "1383", "1384", "1385", "1386", "1387", "1388", "1389", "1390", "1391", "1392", "1393", "1394", "1395", "1396", "1397", "1398", "1399", "1400" }));
        birthdateYearCB_signUp.setToolTipText("");

        jComboBox3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "نیم سال اول", "نیم سال دوم" }));
        jComboBox3.setToolTipText("");

        copyTextBut.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        copyTextBut.setText("Copy");
        copyTextBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyTextButActionPerformed(evt);
            }
        });

        idFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        idFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel43.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("ID:");

        jLabel44.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Phone Number:");

        phoneNumberFiled_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        phoneNumberFiled_signUp.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        birthdateMonthCB_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateMonthCB_signUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        birthdateMonthCB_signUp.setToolTipText("");
        birthdateMonthCB_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdateMonthCB_signUpActionPerformed(evt);
            }
        });

        birthdateDayCB_signUp.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        birthdateDayCB_signUp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        birthdateDayCB_signUp.setToolTipText("");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(copyTextBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idFiled_signUp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameFiled_signUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(nameFiled_signUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(323, 323, 323)
                                .addComponent(jLabel37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(birthdateYearCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdateMonthCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdateDayCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(JtextId, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(phoneNumberFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(signUp)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdateYearCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(birthdateMonthCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdateDayCB_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberFiled_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(signUp))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(JtextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copyTextBut))
                .addContainerGap())
        );

        ((JLabel)jComboBox1.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);
        ((JLabel)jComboBox1.getRenderer()).setHorizontalAlignment(JLabel.RIGHT);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sign Up", jPanel8);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "حذف و اضافه ی اختصاصی", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        addEditeUniNumberField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Student Number:");

        addCourseToStudent_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addCourseToStudent_btn.setText("ADD");
        addCourseToStudent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCourseToStudent_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Course ID:");

        deleteCourseStudent_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        deleteCourseStudent_btn.setText("Delete");
        deleteCourseStudent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourseStudent_btnActionPerformed(evt);
            }
        });

        addEditeCourseIDField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        addEditeCourseCodeField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setText("Course code:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addEditeCourseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addEditeCourseCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(deleteCourseStudent_btn)
                        .addGap(18, 18, 18)
                        .addComponent(addCourseToStudent_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addEditeUniNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addEditeUniNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(addEditeCourseCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(addEditeCourseIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addCourseToStudent_btn)
                        .addComponent(deleteCourseStudent_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "حذف و اضافه ی اختصاصی", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        CheckUniNumberField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setText("Student Number:");

        checkCourseStudent_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        checkCourseStudent_btn.setText("Check");
        checkCourseStudent_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCourseStudent_btnActionPerformed(evt);
            }
        });

        CourseList.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(CourseList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(CheckUniNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(checkCourseStudent_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckUniNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkCourseStudent_btn)
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit subjects ", jPanel9);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "add lesson", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCheckBox3.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setEnabled(false);

        jCheckBox4.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setText("class scheduler:");

        subjectTitle_Field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        subjectCode_field.setEditable(false);
        subjectCode_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jComboBox4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));

        jComboBox5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));

        exameDate_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        addLesson_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addLesson_btn.setText("Add");
        addLesson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    addLesson_btnActionPerformed(evt);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Lesson name:");

        jComboBox9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));

        jComboBox10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setText("Test date:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setText("Lesson code:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Professor Name:");

        ProfessorName_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel9.setText("Cpacity:");

        Capacity_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setText("Value:");

        subjectValue_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(63, 63, 63)
                                .addComponent(exameDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subjectValue_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subjectTitle_Field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subjectCode_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ProfessorName_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Capacity_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox4))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox3)))
                            .addComponent(addLesson_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subjectTitle_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(ProfessorName_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(subjectCode_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exameDate_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(Capacity_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(addLesson_btn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(subjectValue_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "edite lesson", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jCheckBox5.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N

        jCheckBox6.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N

        subjectTitleEdit_feld.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jComboBox15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));

        jComboBox16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));

        ExameDateEdit_feld.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        getSubject_btn.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        getSubject_btn.setText("get info");
        getSubject_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSubject_btnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setText("Lesson name:");

        jComboBox17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "saturday", "sunday", "monday", "tuesday", "wendsday", " " }));

        jComboBox18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "every week", "even week", "odd week" }));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setText("Test date:");

        getCode_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel22.setText("Lesson code");

        editLesson_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        editLesson_btn.setText("Edit");
        editLesson_btn.setEnabled(false);
        editLesson_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLesson_btnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setText("Professor Name:");

        professorNameEdit_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel12.setText("Cpacity:");

        capacityEdit_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        unitValueEdit_field.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setText("Value:");

        deleteCource.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        deleteCource.setForeground(new java.awt.Color(204, 0, 0));
        deleteCource.setText("Delete");
        deleteCource.setEnabled(false);
        deleteCource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCourceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteCource)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editLesson_btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(subjectTitleEdit_feld, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(14, 14, 14)
                                .addComponent(professorNameEdit_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(ExameDateEdit_feld, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(capacityEdit_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel22))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)
                                .addGap(106, 106, 106)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(getCode_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unitValueEdit_field, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getSubject_btn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(subjectTitleEdit_feld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(professorNameEdit_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(ExameDateEdit_feld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(capacityEdit_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCheckBox5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jCheckBox6))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(getCode_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getSubject_btn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(unitValueEdit_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editLesson_btn)
                    .addComponent(deleteCource))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Semester Lessons", jPanel7);

        jMenu1.setText("File");

        jMenuItem1.setText("close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1273, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initialStudentSearchList(LinkedList<Student> s){
        DefaultListModel<String> list = new DefaultListModel<>();
        for (Student student : s) list.addElement(student.getName() +" "+ student.getLastname());
        searchList.setModel(list);
    }

    private void initialEnrolmentSearchList(LinkedList<Enrollment> e){
        DefaultListModel<String> list = new DefaultListModel<>();
//        for (Enrollment enrollment : e) list.addElement( " student \"" + enrollment.getStudentIndex() +"\": "+ enrollment.getSubjectID() + "/ " + enrollment.getSubjectCode());
        CourseList.setModel(list);
    }

    private void showErrorMassage(String ErrorMassage) {
        JOptionPane.showMessageDialog(this, ErrorMassage, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccessMassage(String SuccessMassage) {
        JOptionPane.showMessageDialog(this, SuccessMassage, "Successful", JOptionPane.INFORMATION_MESSAGE);
    }

    private void setFormInfo() {
        nameField.setText(studentTemp.getName());
        lastNameField.setText(studentTemp.getLastname());
        idField.setText("" + studentTemp.getId());
        setBirthdateInfo(birthdateDayCB, birthdateMonthCB, birthdateYearCB);
        phoneNumberField.setText(studentTemp.getPhoneNum());
    }

    private void cleanFormInfo() {
        nameField.setText("");
        lastNameField.setText("");
        idField.setText("");
        setBirthdateInfo(birthdateDayCB, birthdateMonthCB, birthdateYearCB);
        phoneNumberField.setText("");
        initialStudentSearchList(new LinkedList<>());
    }

    private void setBirthdateInfo(JComboBox birthdateDay, JComboBox birthdateMonth, JComboBox birthdateYear){
        birthdateDay.setSelectedItem(studentTemp.getBirthDate().substring(0,2));
        birthdateMonth.setSelectedItem(studentTemp.getBirthDate().substring(3,5));
        birthdateYear.setSelectedItem(studentTemp.getBirthDate().substring(6,10));
    }

    private boolean getFormInfo_signUp() {
        boolean state;
        state = setNameField(nameFiled_signUp);
        state = state && setLastNameField(lastNameFiled_signUp);
        state = state && setIDField(idFiled_signUp);
        state = state && setPhoneNumberField(phoneNumberFiled_signUp);
        getBirthdateInfo(birthdateDayCB_signUp,birthdateMonthCB_signUp, birthdateYearCB_signUp);
        return state;
    }

    private boolean getFormInfo_edit() {
        boolean state;
        state = setNameField(nameField);
        state = state && setLastNameField(lastNameField);
        state = state && setIDField(idField);
        state = state && setPhoneNumberField(phoneNumberField);
        getBirthdateInfo(birthdateDayCB, birthdateMonthCB, birthdateYearCB);
        return state;
    }

    private void getBirthdateInfo(JComboBox birthdateYear, JComboBox birthdateMonth, JComboBox birthdateDay){
        studentTemp.setBirthDate(
                (String) birthdateYear.getSelectedItem() + "/" +
                        (String) birthdateMonth.getSelectedItem() + "/" +
                        (String) birthdateDay.getSelectedItem()
        );
    }

    private boolean setNameField(JTextField nameFiled) {
        try {
            if (nameFiled.getText().length() <= 3) throw new WrongMethodTypeException();
            if (nameFiled.getText().equals("")) throw new InterruptedException();
            studentTemp.setName(nameFiled.getText().toLowerCase().replaceAll(" ", ""));
            return true;
        } catch (WrongMethodTypeException e) {
            showErrorMassage("Name can't have less than 3 character");
        } catch (InterruptedException e) {
            showErrorMassage("Name can't be empty");
        }
        return false;
    }

    private boolean setLastNameField(JTextField lastNameFiled) {
        try {
            if (lastNameFiled.getText().length() <= 3) throw new WrongMethodTypeException();
            if (lastNameFiled.getText().equals("")) throw new InterruptedException();
            studentTemp.setLastname(lastNameFiled.getText().toLowerCase().replaceAll(" ", ""));
            return true;
        } catch (WrongMethodTypeException e) {
            showErrorMassage("last name can't have less than 3 character");
        } catch (InterruptedException e) {
            showErrorMassage("Last name can't be empty");
        }
        return false;
    }

    private boolean setPhoneNumberField(JTextField phoneNumberFiled) {
        try {
            if ((phoneNumberFiled.getText().length() == 10 || phoneNumberFiled.getText().length() == 11)){
                Long.parseLong(phoneNumberFiled.getText().replaceAll(" ", ""));
                studentTemp.setPhoneNum(phoneNumberFiled.getText());
                return true;
            }else{
                throw new WrongMethodTypeException();
            }

        } catch (WrongMethodTypeException e) {
            showErrorMassage("Phone number is in wrong type");
        }
//        catch (NumberFormatException e){
//            showErrorMassage("Phone number hasn't characters");
//        }
        return false;
    }

    private boolean setIDField(JTextField idFiled) {
        try {
            if (idFiled.getText().length() != 10) throw new WrongMethodTypeException();
            else if (idFiled.getText().equals("")) throw new InterruptedException();
            else studentTemp.setId(Integer.parseInt(idFiled.getText().replaceAll(" ", "")));
            return true;
        } catch (NumberFormatException e) {
            showErrorMassage("Wrong input type in ID");
        } catch (WrongMethodTypeException e) {
            showErrorMassage("ID has 10 Digits");
        } catch (InterruptedException e) {
            showErrorMassage("ID can't be empty");
        }
        return false;
    }

    private void setCourseForm(Subject s ) {
        subjectTitleEdit_feld.setText(s.getTitle());
        ExameDateEdit_feld.setText(s.getExamDate().toString());
        unitValueEdit_field.setText(String.valueOf(s.getUnitVal()));
        professorNameEdit_field.setText(s.getProfessorName());
        capacityEdit_field.setText(String.valueOf(s.getCapacity()));
    }

    private Subject getEditField(){
        Subject s = new Subject();
        s.setTitle(subjectTitleEdit_feld.getText());
        s.setExamDate(DateUtil.parse(ExameDateEdit_feld.getText()));
        s.setUnitVal( Integer.parseInt(unitValueEdit_field.getText()));
        s.setProfessorName( professorNameEdit_field.getText());
        s.setCapacity( Integer.parseInt(capacityEdit_field.getText()));
        return s;
    }

    //***********************************************************

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            SystemManage.saveProgram();
        } catch (IOException e) {
            showErrorMassage("Problem in save the files");
        }
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void addLesson_btnActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {//GEN-FIRST:event_addLesson_btnActionPerformed
        //TODO not Complete
        Subject s = new Subject();
        try {
            s.setTitle(subjectTitle_Field.getText());
            s.setUnitVal(Integer.parseInt(subjectValue_field.getText()));
            //TODO fix
            s.setExamDate(LocalDate.now());
            s.setCapacity(Integer.parseInt(Capacity_field.getText()));
            s.setProfessorName(ProfessorName_field.getText());
            SystemManage.setSubjectTmp(s);
            s = SystemManage.addSubject();
            subjectCode_field.setText(String.valueOf(s.getID()));
            showSuccessMassage("done");
        } catch (IOException | DuplicateFormatFlagsException e) {
            showErrorMassage(""+e.getMessage());
        }
    }//GEN-LAST:event_addLesson_btnActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        try {
            if (getFormInfo_signUp()) {
                SystemManage.setStudentTmp(studentTemp);
                SystemManage.signupStudent();
                showSuccessMassage("sign up successful");
            }
        } catch (IOException e) {
            showErrorMassage("Some problem in reading file: " + e.getCause());
        } catch (DuplicateFormatFlagsException e){
            showErrorMassage("Some problem in reading file: " + e.getMessage());
        }
    }//GEN-LAST:event_signUpActionPerformed

    private void getSubject_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getSubject_btnActionPerformed
        try {
            int code = Integer.parseInt(getCode_field.getText());
            SubjectSearcher subjectSearcher = new SubjectSearcher();
            subjectSearcher.setId(code);
            subjectSearcher.setSearchById(true);

            deleteCource.setEnabled(true);
            editLesson_btn.setEnabled(true);

            LinkedList<Subject> result = SystemManage.searchSubject(subjectSearcher);
            setCourseForm(result.get(0));
            SystemManage.setSubjectTmp(result.get(0));
            subjectTemp = result.get(0);

        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            showErrorMassage(""+e.getMessage());
        }
    }//GEN-LAST:event_getSubject_btnActionPerformed

    private void editLesson_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLesson_btnActionPerformed
        try {
            Subject s = getEditField();
            s.setIndex(subjectTemp.getIndex());
            SystemManage.setUpdatedSubjectTmp(s);
            SystemManage.editSubject();

            showSuccessMassage("done");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_editLesson_btnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            SystemManage.saveProgram();
        } catch (IOException e) {
            showErrorMassage("error in save file");
        }
    }//GEN-LAST:event_formWindowClosing

    private void copyTextButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyTextButActionPerformed

    }//GEN-LAST:event_copyTextButActionPerformed

    private void birthdateMonthCB_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdateMonthCB_signUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdateMonthCB_signUpActionPerformed

    private void searchListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchListMouseClicked
        if (searchList.getSelectedIndex() != -1){
            studentTemp = searchResult.get( searchList.getSelectedIndex() );
            setFormInfo();
        }
    }//GEN-LAST:event_searchListMouseClicked

    private void searchStudent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchStudent_btnActionPerformed
        StudentSearcher searcher = new StudentSearcher();
        if (!name_searchField.getText().equals("")) {
            searcher.setName(name_searchField.getText());
            searcher.setSearchByName(true);
        }

        if (!lastName_searchField.getText().equals("")) {
            searcher.setLastname(lastName_searchField.getText());
            searcher.setSearchByLastname(true);
        }

        if (!uniId_searchField.getText().equals("")) {
            searcher.setUniID(Integer.parseInt(uniId_searchField.getText()));
            searcher.setSearchByUniID(true);
        }

        if (!id_searchField.getText().equals("")) {
            searcher.setId(Integer.parseInt(id_searchField.getText()));
            searcher.setSearchByID(true);
        }

        try {
            searchResult = SystemManage.searchStudent(searcher);
            studentTemp = searchResult.get(0);

            initialStudentSearchList(searchResult);

            SystemManage.setStudentTmp(studentTemp);
            setFormInfo();
            deleteStudent_btn.setEnabled(true);
            editInfo_btn.setEnabled(true);
        } catch (IOException | ClassNotFoundException | NullPointerException e) {
            showErrorMassage("not found: " + e.getCause());
            cleanFormInfo();
        }
    }//GEN-LAST:event_searchStudent_btnActionPerformed

    private void deleteStudent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudent_btnActionPerformed
        try {
            SystemManage.removeStudent();
            showSuccessMassage("Done");
        } catch (IOException e) {
            showErrorMassage("Error");
        }
    }//GEN-LAST:event_deleteStudent_btnActionPerformed

    private void editInfo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInfo_btnActionPerformed
        try {
            //            getFormInfo_edit();
            //            SystemManage.updateStudent();
            //            showSuccessMassage("Done");
            if(getFormInfo_edit()){
                SystemManage.setUpdatedStudentTmp(studentTemp);
                SystemManage.updateStudent();
                showSuccessMassage("Done");
            }
            else throw new IOException();
        } catch (IOException e) {
            showErrorMassage("Error");
        }  catch (DuplicateFormatFlagsException e){
            showErrorMassage("ID error");
        }

    }//GEN-LAST:event_editInfo_btnActionPerformed

    private void deleteCourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletCourceActionPerformed
        try {
            SystemManage.removeSubject();
            showSuccessMassage("done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_deletCourceActionPerformed

    private void addCourseToStudent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCourseToStudent_btnActionPerformed
        Enrollment enrollment = new Enrollment();
        try {
            enrollment.setStudentID( Integer.parseInt(addEditeUniNumberField.getText()) );
            enrollment.setSubjectID( Integer.parseInt(addEditeCourseIDField.getText()) );
//            enrollment.setSubjectCode( Integer.parseInt(addEditeCourseCodeField.getText()) );
            SystemManage.addEnrollment(enrollment);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addCourseToStudent_btnActionPerformed

    private void deleteCourseStudent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCourseStudent_btnActionPerformed
        Enrollment enrollment = new Enrollment();
//        try {
            enrollment.setStudentID( Integer.parseInt(addEditeUniNumberField.getText()) );
            enrollment.setSubjectID( Integer.parseInt(addEditeCourseIDField.getText()) );
//            enrollment.setSubjectCode( Integer.parseInt(addEditeCourseCodeField.getText()) );
            
            SystemManage.setEnrollmentTmp(enrollment);
//            SystemManage.removeEnrollment();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_deleteCourseStudent_btnActionPerformed

    private void checkCourseStudent_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCourseStudent_btnActionPerformed
        EnrollmentSearcher searcher = new EnrollmentSearcher();
        searcher.setSearchByStudent(true);
        searcher.setStudentID( Integer.parseInt(CheckUniNumberField.getText()) );
        try {
            LinkedList<Enrollment> searchResult = SystemManage.searchEnrollment(searcher);
            initialEnrolmentSearchList(searchResult);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkCourseStudent_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Capacity_field;
    private javax.swing.JTextField CheckUniNumberField;
    private javax.swing.JList<String> CourseList;
    private javax.swing.JTextField ExameDateEdit_feld;
    private javax.swing.JTextField JtextId;
    private javax.swing.JTextField ProfessorName_field;
    private javax.swing.JToggleButton addCourseToStudent_btn;
    private javax.swing.JTextField addEditeCourseCodeField;
    private javax.swing.JTextField addEditeCourseIDField;
    private javax.swing.JTextField addEditeUniNumberField;
    private javax.swing.JToggleButton addLesson_btn;
    private javax.swing.JComboBox<String> birthdateDayCB;
    private javax.swing.JComboBox<String> birthdateDayCB_signUp;
    private javax.swing.JComboBox<String> birthdateMonthCB;
    private javax.swing.JComboBox<String> birthdateMonthCB_signUp;
    private javax.swing.JComboBox<String> birthdateYearCB;
    private javax.swing.JComboBox<String> birthdateYearCB_signUp;
    private javax.swing.JTextField capacityEdit_field;
    private javax.swing.JToggleButton checkCourseStudent_btn;
    private javax.swing.JToggleButton copyTextBut;
    private javax.swing.JToggleButton deleteCource;
    private javax.swing.JToggleButton deleteCourseStudent_btn;
    private javax.swing.JToggleButton deleteStudent_btn;
    private javax.swing.JToggleButton editInfo_btn;
    private javax.swing.JToggleButton editLesson_btn;
    private javax.swing.JTextField exameDate_field;
    private javax.swing.JTextField getCode_field;
    private javax.swing.JToggleButton getSubject_btn;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idFiled_signUp;
    private javax.swing.JTextField id_searchField;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JTextField lastNameFiled_signUp;
    private javax.swing.JTextField lastName_searchField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameFiled_signUp;
    private javax.swing.JTextField name_searchField;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JTextField phoneNumberFiled_signUp;
    private javax.swing.JTextField professorNameEdit_field;
    private javax.swing.JList<String> searchList;
    private javax.swing.JToggleButton searchStudent_btn;
    private javax.swing.JToggleButton signUp;
    private javax.swing.JTextField subjectCode_field;
    private javax.swing.JTextField subjectTitleEdit_feld;
    private javax.swing.JTextField subjectTitle_Field;
    private javax.swing.JTextField subjectValue_field;
    private javax.swing.JTextField uniId_searchField;
    private javax.swing.JTextField unitValueEdit_field;
    // End of variables declaration//GEN-END:variables
}
