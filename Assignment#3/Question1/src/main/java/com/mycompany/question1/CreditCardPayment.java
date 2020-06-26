
package com.mycompany.question1;

public class CreditCardPayment extends Payment{
    private String name;
    private String expirationDate;
    private int cardNumber;

    public CreditCardPayment(String name, String expirationDate, int cardNumber, double payment) 
    {
        super(payment);
        this.name = name;
        this.expirationDate = expirationDate;
        this.cardNumber = cardNumber;
    }
    public void PaymentDetails()
    {
        super.PaymentDetials();
        System.out.println("through Credit Card \nName: "+name);
        System.out.println("Number: "+cardNumber);
        System.out.println("Expiration Date: "+expirationDate);
    }
}
