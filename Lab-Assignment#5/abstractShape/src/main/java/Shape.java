/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Arsla
 */
abstract public class Shape 
{
    protected String color;
    protected boolean filled;
    public Shape()
    {
        this.color = "green";
        this.filled = false;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("A << "+(filled?"filled":"Not filled")+" >> Shape with << "+color+" >> color");
    }
    public abstract double getArea();
    
    public abstract double getPerimater();

}