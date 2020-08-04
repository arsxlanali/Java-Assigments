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
public class SalariedEmployed extends Employee {
    private double weeklySalary;
    
    public SalariedEmployed(String firstName, String lastName, String socialSecurityNumber, double weeklySalary,  int day, int month, int year)
    {
        super(firstName,lastName,socialSecurityNumber ,day, month , year);
        if (weeklySalary <0.0)
            throw new IllegalArgumentException("Weekly Salary must be Greater than 0");
         
        this.weeklySalary = weeklySalary;   
    }
    
    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary <0.0)
            throw new IllegalArgumentException("Weekly Salary must be Greater than 0");
    
        this.weeklySalary = weeklySalary; 
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
    
    public double earnings()
    {
        return getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return String.format("Salaried Employee %s%s: $%,.2f%n", super.toString(), "Weekly Salary ", getWeeklySalary());
    }
    
}
