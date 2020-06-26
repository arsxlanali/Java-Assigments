
package question2;

public class Bicycle extends RentedVehical
{
    private int nbDays;
    public Bicycle(int nbDays, int baseFee)
    {
        super(baseFee);
        this.nbDays = nbDays;
    }
    @Override
    public double getCost()
    {
        return nbDays*super.baseFee;
    }
    
}
