/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excercise_0;

public class Student{
    private String name;
    private int id;
    private double gpa;
    public Student(int id, String name, double gpa) 
    {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public Student(int id, double gpa)
    {
        this(id, "", gpa);
    }
    public String getName()
    {
        return name;
    }
    public int getId() 
    {
        return id;
    }
    public double getGPA()
    {
        return gpa;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public String toString()
    {
        return "Student:\nID: "+id+"\nName: "+name+"\nGPA: "+Math.floor(gpa * 100) / 100;
    }
}