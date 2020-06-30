
package com.mycompany.excercise_0;

public class Undergrad extends Student{
    private int year;
    public Undergrad(int id, String name, double gpa) 
    {
        super(id, name, gpa);
    }
    public void setYear(int year) 
    {
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nYear: "+year;
    }
}
