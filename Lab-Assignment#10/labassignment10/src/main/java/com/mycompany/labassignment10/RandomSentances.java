package com.mycompany.labassignment10;

import java.util.*;

/**
 *
 * @author Arsla
 */
public class RandomSentances {

    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Sentance: ");
        String str = input.nextLine();
        String[] tokens = str.split(" ");
 
        for (String token : tokens)
        {
            if(token.charAt(0) == 'b' || token.charAt(0) == 'B')
                System.out.println(token);
        }
    }
    
}
