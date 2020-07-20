/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arsla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Shape[] shape = new Shape[6];
    shape[0] = new Rectangle();
    shape[1] = new Rectangle(3.0, 4.0);
    shape[2] = new Rectangle(5.0, 5.0, "black", true);
    shape[3] = new Square();
    shape[4] = new Square(6.0);
    shape[5] = new Square(4.0, "brown", true);
    for (Shape shape1 : shape)
    {
        System.out.println(shape1.toString());
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimater());
    }
    }
    
}
