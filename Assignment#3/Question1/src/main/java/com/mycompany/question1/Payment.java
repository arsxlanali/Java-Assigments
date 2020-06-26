
package com.mycompany.question1;

public class Payment 
{
    private double payment;
    public Payment(double payment) 
    {
        this.payment = payment;
    }   
    public void setPayment(double payment) 
    {
        this.payment = payment;
    }
    public double getPayment() 
    {
        return payment;
    }
    public void PaymentDetials()
    {
        System.out.print("You hava Payed "+payment);
    }    
}
