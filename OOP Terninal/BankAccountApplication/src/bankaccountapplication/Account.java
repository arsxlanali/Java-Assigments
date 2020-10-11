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
public class Account {
    protected String CNIC;
    protected long accountNumber;
    protected String accountTitle;
    protected double balance;
    protected static int count=0;

    public Account() 
    {
        count++;
    }
    
    public void addAccount()
    {
        Scanner input = new Scanner(System.in);
        Scanner inputst = new Scanner(System.in);
        
        System.out.print("\nInput the Account Title: ");                     
        do
        {
            this.accountTitle = inputst.nextLine(); 
            if (Pattern.matches("[A-Z][a-z]+",accountTitle)) 
            { 
                System.out.println("Yes, string contains letters only");
                break;
            }
            else
            {
                System.out.println("Nope, Other characters detected");    
            }
        }while(true);
        
        System.out.print("\nInput the CINC: ");
        do
        {                   
            this.CNIC = inputst.nextLine();
            try 
            {
                Double num = Double.parseDouble(CNIC);
                break;
             } 
            catch (NumberFormatException e) 
            {
                System.out.println(CNIC + " only contain numbers");
            }
        } while (true);
        
        System.out.print("\nInput the Balance: ");
        
        do
        {
        this.balance = input.nextDouble();
        if (balance> 0 )
            break;
        else
            System.out.print("Balance should be greater than zero:");
         }while(true);
    }
    
    public void withdraw()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the Amount to withdraw: ");
        double withdraw = input.nextDouble();
        withdraw = this.balance - withdraw;
        if (withdraw<0)
            throw new IllegalArgumentException("Transaction cannot be completed!");
        else
            this.balance = withdraw;
        System.out.print("\nTotal Balance:"+this.balance );
    }
    
    public void depoistAccount()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the Amount to Deposit: ");
        double deposit = input.nextDouble();
        this.balance = this.balance - deposit;
        System.out.print("\nTotal Balance:"+this.balance );
    }
    
    public int totalAccounts()
    {
        return count;
    }
}
