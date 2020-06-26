
package question2;

public class TestMain {

    public static void main(String[] args) 
    {
        Car ob1 = new Car(20,1500,2000);
        Truck ob2 = new Truck(200,120,100);
        Bicycle ob3 = new Bicycle(13,50);
        RentedVehical array[] = new RentedVehical[]{ob1,ob2,ob3};
        System.out.println("Car Rent:\t"+array[0].getCost());
        System.out.println("Truck Rent:\t"+array[1].getCost());
        System.out.println("Bicycle Rent:\t"+array[2].getCost());
    }
    
}
