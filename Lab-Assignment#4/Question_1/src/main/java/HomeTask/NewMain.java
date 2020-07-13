/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeTask;

/**
 *
 * @author Arsla
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Shape a1 = new Shape();
        //System.out.println(a1.toString());
        Shape a2 = new Shape("brown", true);
        System.out.println(a2.toString());
        Rectangle a = new Rectangle();
        System.out.println(a.toString());
        //Rectangle b = new Rectangle(3.0, 4.0);
        //System.out.println(b.toString());
        //Rectangle c = new Rectangle(5.0, 5.0, "black", true);
        //System.out.println(c.toString());
        Square ob1 = new Square();
        System.out.println(ob1.toString());
        /*Square ob2 = new Square(4.0);
        System.out.println(ob2.toString());
        Square ob3 = new Square(4.0, "brown", true);
        System.out.println(ob3.toString());*/
    }

}
