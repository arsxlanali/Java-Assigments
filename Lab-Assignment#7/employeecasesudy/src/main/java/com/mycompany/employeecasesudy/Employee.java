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
public abstract class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date bithDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.bithDate = new Date(day, month, year);
    }
    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public Date getDate()
    {
        return bithDate;
    }
    @Override
    public String toString()
    {
            return String.format("%s %s\n%s: %s\n%s%s\n", getFirstName(), getLastName(), "Social Security Number ", getSocialSecurityNumber(), "Birth Date: ",bithDate.toString() );
     }

    
    public abstract double earnings();
}
