package homeassignement;

public class BankAccount {
    String accountTitle;
    String address;
    int accountNo;
    int balance;
    static int bonus;
    int totalbalance;
    public BankAccount(String title, String add, int acNo, int ball)
    {
        accountTitle = title;
        address=add;
        accountNo=acNo;
        balance=ball;
    }
    static void setBonus(int a)
    {
        bonus = a;
    }
    public void credit(int b)
    {
        balance +=b;
    }
    public void debit(int c)
    {
        balance-=c;
    }
    public void AcInfo()
    {
        totalbalance=balance+(balance*bonus)/100;
        System.out.println("Account Title : "+accountTitle);
        System.out.println("Account Number : "+accountNo);
        System.out.println("Address : "+address);
        System.out.println("Bonus:"+bonus);
        System.out.println("Balance : "+balance+"\n");
        System.out.println("Total Balance:"+totalbalance);
    }

    void accountInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
