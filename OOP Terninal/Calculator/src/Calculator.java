
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arsla
 */
public class Calculator {

    /**
     * @param value
     */
    public static double performOperation(double value, String str) throws UnknownOperatorException
    {
        System.out.println("Calculator is on.");

        char operator = str.charAt(0);
        if(!operator=="+" && !operator=="-" && !operator=="*" && !operator=="/" &&  !operator=="R" && !operator=="r")
            throw new UnknownOperatorException(operator);
        if(operator.equals("R") || operator.equals("r"))
              return value;
        double number = Double.parseDouble(str.substring(1, str.length()));
        System.out.print("result " + operator + " " + number + " = ");
        switch (operator) {
            case "+":
                return value += number;
            case "-":
                return value -= number;
            case "*":
                return value *= number;
            default:
                return value /= number;
        }
    }
 

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator is on.");
        char choice = 'y';
        do
        {
            double result = 0.0;
            System.out.println("result = " + result);
            String operator = new String();
            while(!operator.equals("R") && !operator.equals("r"))
            {
                
            }
        }while(choice == 'y'|| choice == 'Y');
    }
        
        
        
    }
    
}
