package class29;

public class Sedan extends Car{
    int length;



    Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length=length;
    }


    @Override
    double calculateSalesPrice() {
        if(length>20){
            return carPrice-carPrice*.05;
        }else{
            return carPrice-carPrice*.1;
        }
    }
}
