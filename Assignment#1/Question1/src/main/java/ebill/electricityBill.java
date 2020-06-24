
package ebill;

public class electricityBill {
   String name;
    int accountNo;
    String address;
    int pReading;
    int cReading;
    int bill;
   public electricityBill(String n,int acNo,String add,int pR,int cR)
    {
        name = n;
        accountNo=acNo;
        address = add;
        pReading = pR;
        cReading = cR;    
    } 
    public void callcualteBill()
    {
        int units = cReading - pReading;
            if (units<=100)
            {   
                bill = units*15; 
            }
            else if (units<=300)
            {
                bill=100*15+(units-100)*30;
                
            }
            else if (units<=500)
            {
                bill=100*30+(units-100)*45;
            }
            else if (units>500)
            {
                bill = units*60;
            }
            else
            {
                System.out.println("Error! You entered the Wrong Readings");
            }
           
    }
    public void acInfo()
    {
        System.out.println("Customer Name:"+name);
        System.out.println("Account Number:"+accountNo);
        System.out.println("Customer Address:"+address);
        System.out.println("Current Readings:"+cReading);
        System.out.println("Total Bill:"+bill);
        
    }
}
