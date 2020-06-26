
package question2;

public class Car extends FuelVehical{
    private final int nbSeat;
    public Car(int nbSeat,int nbKms,int baseFee)
    {
        super(nbKms,baseFee);
        this.nbSeat = nbSeat;
    }

    /**
     *
     * @return
     */
    @Override
    public double getCost()
    {
        return super.getMileageFees()+ super.getCost()*baseFee;
    }
}
