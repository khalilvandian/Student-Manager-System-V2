/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.StudentManagerSystem;

import java.io.Serializable;

public class UniIDManage implements Serializable {


    private int[] studentCount = new int[10];
    private int subjectCount = 100;

    public UniIDManage() {
        java.util.Arrays.fill(this.studentCount, 100);
    }


    Integer createNewID(int entranceYear, int major) {

        String tmp;
        studentCount[major]++;
        tmp = String.valueOf(entranceYear) + String.valueOf(major) + String.valueOf(studentCount[major]);
        return Integer.parseInt(tmp);
    }

    Integer createSubjectID() {

        return subjectCount++;
    }
}
