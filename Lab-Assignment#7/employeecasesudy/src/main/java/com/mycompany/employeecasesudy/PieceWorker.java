/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeecasesudy;

/**
 *
 * @author Arsla
 */
public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces,  int day, int month, int year)
    {
        super(firstName,lastName,socialSecurityNumber, day, month, year);

         if (pieces <0)
            throw new IllegalArgumentException("No of Pieces must be Greater than 0");
      
        
        if (wage < 0.0)
            throw new IllegalArgumentException("Wage per peices must be greater than 0");
         
        this.wage = wage;
        this.pieces = pieces;  
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Wage per peices must be greater than 0");        
        
        this.wage = wage;
    }

    public void setPieces(int pieces) {
         if (pieces <0)
            throw new IllegalArgumentException("No of Pieces must be Greater than 0");        
        
         this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public int getPieces() {
        return pieces;
    }
    @Override
    public double earnings()
    {
        return  getWage() * getPieces();
    }
     @Override
    public String toString()
    {
        return String.format("Piece Worker %s%s: $%,.2f\n%s%d%n", super.toString(), "Wage Per Piece ", getWage() , "No of Pieces ", getPieces());    
    }
}
