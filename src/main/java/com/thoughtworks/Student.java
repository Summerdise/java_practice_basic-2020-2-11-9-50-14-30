package com.thoughtworks;

import java.text.*;
import java.util.Date;

public class Student {
    private String name;
    private String idNum;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student() {
    }

    public Student(String name, String idNum, String dateStr) {
        this.name = name;
        this.idNum = idNum;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = null ;
        try {
            date = simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String dateStr = simpleDateFormat.format(date);
        Date nowDate = new Date();
        int studyYear = nowDate.getYear()- date.getYear();
        return String.format("我叫%s，我的学号是%s，%s入学，学龄%d年",name,idNum,dateStr,studyYear);
    }

//    public void printStudent(){
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        String dateStr = simpleDateFormat.format(date);
//        Date nowDate = new Date();
//        int studyYear = nowDate.getYear()- date.getYear();
//        return String.format("我叫%s，我的学号是%s，%s入学，学龄%d年",name,idNum,dateStr,studyYear));
//    }
}
