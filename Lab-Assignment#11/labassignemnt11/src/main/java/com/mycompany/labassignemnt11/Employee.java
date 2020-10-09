/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labassignemnt11;

import java.io.Serializable;

/**
 *
 * @author Arsla
 */
    public class Employee implements Serializable
    {
        public String name;
        public int empID;
        public float hourlyIncome;

        public Employee(String name, int empID, float hourlyIncome) 
        {
            this.name = name;
            this.empID = empID;
            this.hourlyIncome = hourlyIncome;
        }

        public Employee() 
        {
        
        }

        @Override
        public String toString() 
        {
            return "Employee: "  + name + " (ID: " + empID + " ), Income=" + hourlyIncome + '}';
        }
    }