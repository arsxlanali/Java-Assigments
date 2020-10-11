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
public class SavingsAccounts extends Account
{
    private float monthlyInterestRate;

    public SavingsAccounts() 
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
             if (Pattern.matches("[1][1-9]+", title))
             {
                 this.accountNumber = Integer.parseInt(title);
                 break;
             }
             else
                 System.out.println("First digit should be 1");

         }while(true);
         System.out.println("Enter the Monthly Interest Rate: ");
         do
         {
             this.monthlyInterestRate = input.nextFloat();
             if (this.monthlyInterestRate > 0.0)
                 break;
             else
                 System.out.println("Hourly Rate must be greater than zero");
         }while (true);
     }
     
     public void setInterestRate()
     {
         Scanner input  = new Scanner(System.in);
         System.out.println("Enter the Interest Rate: ");
         this.monthlyInterestRate = input.nextFloat();
     }
     
     public void calculateInterestRate()
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the Number of Years: ");
         int noYears = input.nextInt();
         this.balance = this.balance * this.monthlyInterestRate * noYears;
         System.out.print("Interst Rate :"+this.balance );
     }
     
    @Override
     public int totalAccounts()
     {
         return SavingsAccounts.count;
     }
     
     public void checkBalance()
     {
         System.out.println(this.balance);
     }
}
