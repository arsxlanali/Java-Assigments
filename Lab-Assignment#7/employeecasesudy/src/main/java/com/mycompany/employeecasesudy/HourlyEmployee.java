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
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours,  int day, int month, int year )
    {
        super(firstName,lastName,socialSecurityNumber,  day,  month,  year);
        if (wage <0.0)
            throw new IllegalArgumentException("wage must be Greater than 0");
      
        
        if (hours <0.0 || hours > 168.0)
            throw new IllegalArgumentException("Please enter the hours between 0 to 168");
         
        this.hours = hours;
        this.wage = wage;  
    }
    
    public void setHours(double hours)
    {
         if (hours <0.0 || hours > 168.0)
            throw new IllegalArgumentException("Please enter the hours between 0 to 168");
         
        this.hours = hours;
    }
    
    public void setWage(double wage)
    {
         if (wage <0.0)
            throw new IllegalArgumentException("wage must be Greater than 0");
         
         this.wage = wage;  
    }
    
    
    public double getHours()
    {
        return hours;
    }
    
    public double getWage()
    {
        return wage;
    }
       
    
    @Override
    public double earnings()
    {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40 ) * getWage() *1.5;
    }

     @Override
    public String toString()
    {
        return String.format("Hourly Employee %s%s: $%,.2f%n", super.toString(), "Hourly Wage ", getWage(), "Hours Worked ", getHours());
    }
    
}
