/*
 * designed by  "Amir Hosein Shekari"
 */

package com.StudentManagerSystem.ui.data;

import com.StudentManagerSystem.Student;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class StudentData {
    Student student;
    StringProperty name;
    StringProperty LastName;
    StringProperty Id;
    StringProperty uniId;

    public StudentData(Student student) {
        this.student = student;
        this.name = new SimpleStringProperty(student.getName());
        LastName = new SimpleStringProperty(student.getLastname());
        this.Id = new SimpleStringProperty(""+student.getId());
        this.uniId = new SimpleStringProperty(""+student.getUniID());
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getLastName() {
        return LastName.get();
    }

    public StringProperty lastNameProperty() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName.set(lastName);
    }

    public String getId() {
        return Id.get();
    }

    public StringProperty idProperty() {
        return Id;
    }

    public void setId(String id) {
        this.Id.set(id);
    }

    public String getUniId() {
        return uniId.get();
    }

    public StringProperty uniIdProperty() {
        return uniId;
    }

    public void setUniId(String uniId) {
        this.uniId.set(uniId);
    }
}
