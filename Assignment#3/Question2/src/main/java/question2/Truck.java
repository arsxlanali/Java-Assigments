
package question2;

public class Truck extends FuelVehical{
    private  int capacity;
    public Truck(int capacity, int nbKms, int baseFee)
    {
        super(nbKms,baseFee);
        this.capacity = capacity;
    }
    @Override
    public double getCost()
    {
        return super.getMileageFees()+super.baseFee*capacity;
    }
}
