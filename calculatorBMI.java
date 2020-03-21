/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymasscalculator;
import java.util.Scanner;
/**
 *
 * @author Arsla
 */
public class calculatorBMI {
    public static void main(String[] arg){
        int BMI=0,weightInkilogram=0,heightInMeters=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Weith in Kilogram:");
        weightInkilogram = input.nextInt();
        System.out.print("\nEnter the Height in Meters:");
        heightInMeters = input.nextInt();
        BMI =  weightInkilogram/(heightInMeters*heightInMeters);
        System.out.println("Your BMI is "+BMI);
        System.out.print("BMI Values\n"
                + "Underweight:\tless than 18.5\n"
                + "Normal:\t\tbetween 18.5 and 24.9\n"
                + "Overweight:\tbetween 25 and 29.9");
    }
    
}
