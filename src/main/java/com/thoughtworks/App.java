package com.thoughtworks;

import java.util.*;

public class App {

  public static void main(String[] args) {
    Student stu1 = new Student("张三","001","2019.02.11");
    Student stu2 = new Student("李四","002","2019.02.10");
    Student stu3 = new Student("王五","001","2019.02.09");
    ArrayList<Student> studentArrayList = new ArrayList<>();
    studentArrayList.add(stu1);
    studentArrayList.add(stu2);
    studentArrayList.add(stu3);
    Teacher teacher = new Teacher("张龙",studentArrayList);
    ArrayList<Student> similarStudentList = teacher.findSame();
    teacher.printStudentList(similarStudentList);
  }
}
