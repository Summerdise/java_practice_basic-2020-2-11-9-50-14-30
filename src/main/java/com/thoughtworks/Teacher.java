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
    public ArrayList<Student> findSame(){
        ArrayList<Student> sameStudent = new ArrayList<>();
        HashSet<String> hadIdNumber  = new HashSet<>();
        for(int i=0;i<studentList.size();i++){
            Student nowStu = studentList.get(i);
            if(!hadIdNumber.contains(nowStu.getIdNum())){
                hadIdNumber.add(nowStu.getIdNum());
            }else{
                sameStudent.add(nowStu);
            }
        }
        return sameStudent;
    }

    public void printStudentList(ArrayList<Student> studentList){
        for(int i=0;i<studentList.size();i++){
            studentList.get(i).toString();
        }
    }
}
