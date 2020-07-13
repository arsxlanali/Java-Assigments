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
public class Rectangle extends Shape
{
    protected double width;
    protected double length;
    public Rectangle()
    {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double lenght)
    {
        super();
        this.width = width;
        this.length = lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = lenght;
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
    
    public double getArea()
    {
        return length*width;
    }
    public double getPerimeter()
    {
        return 2*length+2*width;
    }
    public String toString()
    {
        return String.format("A Rectangle with width=<<"+ width +">> and length= <<"+ length +">>, which is a subclass of <<"+super.toString()+" >>");
    } 
}
