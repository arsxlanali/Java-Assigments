
package com.mycompany.question1;

public class MainMethod {

    public static void main(String[] args) 
    {
        CashPayment ob1 = new CashPayment(2000);
        CashPayment ob2 = new CashPayment(4000);
        CreditCardPayment cp1 = new CreditCardPayment("Paypal","12/20/2021",304278,2500);
        CreditCardPayment cp2 = new CreditCardPayment("Visa","06/01/2021",592857,1100);
        ob1.PaymentDetails();
        ob2.PaymentDetails();
        cp1.PaymentDetails();
        cp2.PaymentDetails();
    }    
}
