
package com.mycompany.excercise_0;

public class TestStudent {

    public static void main(String[] args) 
    {
        Undergrad ob1 = new Undergrad(1234,"M Hassan",2.9f);
        Gruaduate ob2 = new Gruaduate(6789,"Ahamad Khan",3.2f);
        ob1.setYear(2001);
        ob2.setThesisTitle("Computer Vision");
        System.out.println(ob1);
        System.out.println(ob2);
    }
    
}
