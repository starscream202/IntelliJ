package class29;

public class Truck extends Car{
    double weight;

    Truck(double carPrice, String carColor, double weight) {
        super(carPrice, carColor);
        this.weight = weight;
    }
    @Override
    double calculateSalesPrice() {
        if (weight>2000){
            return carPrice-carPrice*0.1;
        }else{
            return carPrice-carPrice*0.2;
        }
    }
}
