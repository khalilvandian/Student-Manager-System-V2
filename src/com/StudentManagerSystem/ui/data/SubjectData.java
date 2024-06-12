/*
 * designed by  "Amir Hosein Shekari"
 */

package com.StudentManagerSystem.ui.data;

import com.StudentManagerSystem.Subject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SubjectData {
    Subject subject;
    StringProperty title;
    StringProperty groupNumber;

    public SubjectData(Subject subject) {
        this.subject = subject;
        this.title = new SimpleStringProperty(subject.getTitle());
        this.groupNumber = new SimpleStringProperty(""+subject.getCode());
    }

    public String getTitle() {
        return title.get();
    }

    public StringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getGroupNumber() {
        return groupNumber.get();
    }

    public StringProperty groupNumberProperty() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber.set(groupNumber);
    }

    public Subject getSubject() {
        return subject;
    }
}
