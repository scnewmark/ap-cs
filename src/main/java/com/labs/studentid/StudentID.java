package com.labs.studentid;

public class StudentID {
    String studentFirstName;
    String studentLastName;
    int studentID;

    public StudentID() {
        studentFirstName = "First";
        studentLastName = "Last";
        studentID = 0;
    }

    public StudentID(String first, String last, int id) {
        studentFirstName = first;
        studentLastName = last;
        studentID = id;
    }

    public String getStudentFirstName() {
        return this.studentFirstName;
    }

    public String getStudentLastName() {
        return this.studentLastName;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public String setStudentFirstName(String name) {
        this.studentFirstName = name;
        return this.studentFirstName;
    }

    public String setStudentLastName(String name) {
        this.studentLastName = name;
        return this.studentLastName;
    }

    public int setStudentID(int id) {
        this.studentID = id;
        return this.studentID;
    }

    public String getPassword() {
        return this.studentLastName.substring(0, 1) + this.studentID + this.studentLastName.substring(this.studentLastName.length() -1, this.studentLastName.length());
    }

    public String toString() {
        return "Name = " + this.studentFirstName + " " + this.studentLastName + " Student ID = " + this.studentID;
    }
}
