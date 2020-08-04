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
public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate,  int day, int month, int year)
    {
        super(firstName,lastName,socialSecurityNumber,   day, month,  year);

         if (grossSales <0.0)
            throw new IllegalArgumentException("Gross Sales must be Greater than 0");
      
        
        if (commissionRate <0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("Commission Rate must be >0.0  and < 1.0");
         
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;  
    }
    
    public void setGrossSalse(double grossSales)
    {
         if (grossSales <0.0)
            throw new IllegalArgumentException("Gross Sales must be Greater than 0");
         
         this.grossSales = grossSales;
    }
    
    public double getGrossSales()
    {
            return grossSales;
     }
    
    public void setCommissionRate(double commissionRate)
    {
         if (commissionRate <0.0 || commissionRate > 1.0)
            throw new IllegalArgumentException("Commission Rate must be >0.0  and < 1.0");
         
         this.commissionRate = commissionRate; 
    }
    
    public double getCommissionRate()
    {
        return commissionRate;
    }
    
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }
    
     @Override
    public String toString()
    {
        return String.format("Commission Employee %s%s: $%,.2f%n", super.toString(), "Gross Sales ", getGrossSales(), "Commissionn Rate ", getCommissionRate());
    }
}
