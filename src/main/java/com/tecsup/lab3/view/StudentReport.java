package com.tecsup.lab3.view;

import com.tecsup.lab3.model.Student;

public class StudentReport {

    public static void print(Student s) {
        System.out.println("Student: " + s.getId() + " - " + s.getName());
    }
}
