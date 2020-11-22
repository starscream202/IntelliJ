package class29;

public abstract class Car {
    double carPrice;
    String color;

    Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    abstract double calculateSalesPrice();
}
