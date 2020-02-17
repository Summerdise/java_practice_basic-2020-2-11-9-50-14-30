package com.thoughtworks;

import java.text.*;
import java.util.Date;

public class Student {
    private String name;
    private int idNum;
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNum() {
        return idNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student(String name, int idNum, String dateStr) {
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
}
