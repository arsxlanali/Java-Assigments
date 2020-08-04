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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary,  int day, int month, int year)
    {
        super(firstName,  lastName,  socialSecurityNumber,  grossSales, commissionRate,   day,  month,  year);
        
         if (baseSalary <0.0)
            throw new IllegalArgumentException("Base Salary must be Greater than 0");
              
         this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary)
    {
         if (baseSalary <0.0)
            throw new IllegalArgumentException("Gross Sales must be Greater than 0");
         
         this.baseSalary = baseSalary;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    @Override
    public double earnings()
    {
        return getBaseSalary() * super.earnings();
    }
    
     @Override
    public String toString()
    {
        return String.format("Base-Salaried %s%s: $%,.2f%n", super.toString(), "Base Salary ", getBaseSalary());
    }
}
