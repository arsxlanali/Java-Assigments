/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeecasesudy;
import java.util.*;
/**
 *
 * @author Arsla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month;
        GregorianCalendar date = new GregorianCalendar();      
        month = date.get(Calendar.MONTH);
        month = month+1;     
        Employee[] employee = new Employee[5];
        employee[0] = new SalariedEmployed("Ahsan","Ahmad", "344-343-621",200.0f, 2, 4, 1980);
        employee[1] = new HourlyEmployee("Imran", "Nazir", "444-343-621", 25.0, 148.0, 15, 3, 2000);
        employee[2] = new CommissionEmployee("Hassan", "Ali", "744-343-621", 3600.0, 0.3, 7, 7, 1996);
        employee[3] = new BasePlusCommissionEmployee("Abrar", "Ali", "944-343-621", 3000.0, 0.2, 4000, 12, 4, 2001);
        employee[4]= new PieceWorker("Ahmad", "Khan", "234-583-323", 5f, 67, 20, 6, 1987);
        for ( Employee employee1: employee)
        {
            System.out.print(employee1);
            System.out.println("Earnings: "+employee1.earnings());
            if (employee1 instanceof BasePlusCommissionEmployee ||  employee1.getDate().month == month)
           {
                 System.out.printf("Your Earnings after Bonus is %.2f\n",employee1.earnings()+100);
           }
            System.out.println();
        }
    }
    
}
