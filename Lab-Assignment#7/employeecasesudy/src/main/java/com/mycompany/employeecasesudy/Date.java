/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeecasesudy;

/**
 *
 * @author Arsla
 */
public class Date {
    public int day;
    public int month;
    public int year;

    public Date(int day, int month, int year) {
        if (day <= 0 || day>31)
            throw new IllegalArgumentException("Day must be >1  and < 31");
        this.day = day;
         if (month <= 0 || month>12)
            throw new IllegalArgumentException("Month must be >1  and < 13");
        this.month = month;
         if (year <= 1970 || year>2010)
            throw new IllegalArgumentException("Year must be >1970 and < 2010");
        this.year = year;
    }

    public void setDay(int day) {
        if (day <= 0 || day>31)
            throw new IllegalArgumentException("Day must be >1  and < 31");        
        this.day = day;
    }

    public void setMonth(int month) {
         if (month <= 0 || month>12)
            throw new IllegalArgumentException("Month must be >1  and < 13");        
        this.month = month;
    }

    public void setYear(int year)
    {
         if (year <= 1970 || year>2010)
            throw new IllegalArgumentException("Year must be >1970 and < 2010");            
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%02d",getDay(),getMonth(),getYear());
    }
   
}
