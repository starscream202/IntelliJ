package class32;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Insurance>insuranceArrayList=new ArrayList<>();
        insuranceArrayList.add(new Pet("Pet Insurance","Dog"));
        insuranceArrayList.add(new Car("Car Insurance","Mazda"));
        for (Insurance obj :insuranceArrayList) {
            obj.getQuote();
            obj.cancelInsurance();
            System.out.println("For Loop");
            System.out.println();
        }
        Iterator<Insurance>iterator=insuranceArrayList.iterator();
        while(iterator.hasNext()){
            Insurance insurance= iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
            System.out.println("Iterator");
            System.out.println();
        }

    }
}
abstract class Insurance {
    String insuranceName;

    Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();

    abstract void cancelInsurance();

}

class Pet extends Insurance{
    String petType;
    Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("Quote for Pets");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel Pet insurance");
    }
}
class Car extends Insurance{
    String carType;
    Car(String insuranceName,String carType) {
        super(insuranceName);
        this.carType=carType;
    }

    @Override
    void getQuote() {
        System.out.println("Quote for Car");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel Car insurance");
    }
}
