/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapplication;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Arsla
 */
public class CurrentAccount extends Account
{
    private float serviceFeeRate;
    
    public CurrentAccount()
    {
        super();
    }
    
    @Override
    public void addAccount()
    {
         Scanner input = new Scanner(System.in);
         Scanner inputst = new Scanner(System.in);         
        
        System.out.println("Enter the Account Numbeer: ");
         do
         {
              String title= inputst.nextLine();
             if (Pattern.matches("[2][1-9]+", title))
             {
                 this.accountNumber = Integer.parseInt(title);
                 break;
             }
             else
                 System.out.println("First digit should be 1");

         }while(true);
         
         System.out.println("Enter the Account Numbeer: ");
         this.serviceFeeRate = input.nextFloat();
         if (this.serviceFeeRate <0.0)
             throw new IllegalArgumentException("Service Fee Cannot be less than Zero:");
    }
    
    public void setServiceFee()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Service Fee: ");
        this.serviceFeeRate = input.nextFloat();       
    }
    
    public void checkBalance()
    {
        System.out.println("Total Balance: "+ this.balance);
    }

    @Override
     public int totalAccounts()
     {
         return SavingsAccounts.count;
     } 
     
}
