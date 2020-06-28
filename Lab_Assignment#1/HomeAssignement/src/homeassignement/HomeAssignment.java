package homeassignement;

public class HomeAssignment {
    public static void main(String[] args) {
        BankAccount[] account = new BankAccount[5];
        BankAccount.setBonus(20);
        account[0] = new BankAccount("Usama","usam@cuilahore.pk",3788,5000);
        account[1] = new BankAccount("noman","noma@cuilahore.edu.pk",8787,1000);
        account[2] = new BankAccount("aqib","aqib@cuilhaore.edu.pk",48397,48000);
        account[3] = new BankAccount("Ali","Ali@cuilahroe.edu.pk",85578,8000);
        account[4] = new BankAccount("naim","naiam@cuilahore.edu.pk",9289,9000);
        account[1].accountInfo();
    }
    
}