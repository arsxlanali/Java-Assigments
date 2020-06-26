
package question2;

public class RentedVehical
{
    protected int baseFee;
    public RentedVehical(int baseFee) 
    {
        this.baseFee = baseFee;
    }
    public double getCost()
    {
        return baseFee;
    }   
}
