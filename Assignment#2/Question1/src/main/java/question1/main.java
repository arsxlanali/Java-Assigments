
package question1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        for (int i=0 ; i<5 ; i++)
        {
            System.out.printf("Enter the value of %d postion: ",i);
            array[i] = input.nextInt();
        }
        IntArray s1 = new IntArray(array);
        s1.showData();
        s1.delData(2);
        s1.showData();
    }
    
}
