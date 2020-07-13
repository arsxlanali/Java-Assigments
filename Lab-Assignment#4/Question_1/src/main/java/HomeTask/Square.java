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
public class Square extends Rectangle
{
    public Square()
    {
        super();
    }
    public Square(double side)
    {
        super(side, side);
    }
    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    
    public String toString()
    {
        return String.format("A Square with side="+getWidth()+", which is a subclass of "+super.toString());
    }
}
