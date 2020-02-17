package com.thoughtworks;

import java.util.*;

public class Teacher {
    private String name;
    private ArrayList<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, ArrayList<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> findSame() {
        ArrayList<Student> sameStudent = new ArrayList<>();
        HashSet<Student> hadOnceIdSet = new HashSet<>();
        HashSet<Student> hadSecondIdSet = new HashSet<>();

        for (int i = 0; i < studentList.size(); i++) {
            Student nowStudent = studentList.get(i);
            if (hadOnceIdSet.contains(nowStudent)) {
                hadSecondIdSet.add(nowStudent);
                sameStudent.add(nowStudent);
            } else {
                hadOnceIdSet.add(nowStudent);
            }
        }
        for (Student key : hadOnceIdSet) {
            if (hadSecondIdSet.contains(key)) {
                sameStudent.add(key);
            }
        }
        return sameStudent;
    }

    public void printStudentList(ArrayList<Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).toString());
        }
    }
}
