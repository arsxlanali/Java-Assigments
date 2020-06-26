
package question2;

public class FuelVehical extends RentedVehical
{
    private final int nbKms; //Number of kilometer travelled
    public FuelVehical(int nbKms ,int baseFee)
    {
        super(baseFee);
        this.nbKms = nbKms;
    }
    public double getMileageFees()
    {
        if (nbKms<100)
            return nbKms*0.2;
        else if (nbKms>100 || nbKms<400)
             return nbKms*0.3;
        else if (nbKms>400)
            return nbKms*0.3+(400-nbKms)*0.5;
        else
            return 0;
    }
}
