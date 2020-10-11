/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountapplication;

import java.util.Scanner;

/**
 *
 * @author Arsla
 */
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Account[] array = new Account[5];
        array[0] = new SavingsAccounts();
        array[1] = new SavingsAccounts();
        array[2] = new SavingsAccounts();
        array[3] = new SavingsAccounts();        
        array[4] = new SavingsAccounts();
        Account[] array2 = new Account[5];
        array2[0] = new CurrentAccount();
        array2[1] = new CurrentAccount();
        array2[2] = new CurrentAccount();
        array2[3] = new CurrentAccount();
        array2[4] = new CurrentAccount();
        
        Scanner input = new Scanner(System.in);
        int choice=0;
  
       do
        {
            System.out.println("1- Add Savings Account");
            System.out.println("2- Add Current Account");
            System.out.println("3- Deposit Money");
            System.out.println("4- Withdraw Money");
            System.out.println("5- Check Balance");
            System.out.println("6- Exit");
            choice = input.nextInt();
            if (choice ==1)
            {
                for (Account saving: array)
                {
                    saving.addAccount();
                    System.out.println("6- Exit");
                }
            }
            else if (choice == 2)
            {
                for ( int i=5 ; i<10 ; i++)
                {
                    array[i].addAccount();
                }
            }
            else if (choice == 3)
            {
                for (Account account : array)
                    account.depoistAccount();
            }
            else if (choice ==4)
            {
                for (Account account : array)
                    account.withdraw();
            }
            else if (choice ==5)
            {
                    break;
            }
        }while( true);
    }
    
}
