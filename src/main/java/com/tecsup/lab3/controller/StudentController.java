package com.tecsup.lab3.controller;

import com.tecsup.lab3.model.Student;
import com.tecsup.lab3.view.StudentReport;

public class StudentController {

    public static void main(String[] args) {
        Student s = new Student("001", "Rene");
        StudentReport.print(s);
    }
}