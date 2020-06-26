
package com.mycompany.question1;

public class CashPayment extends Payment
{
    public CashPayment(double payment)
    {
        super(payment);
    }
    public void PaymentDetails()
    {
        super.PaymentDetials();
        System.out.println(" in Cash!");       
    }    
}
