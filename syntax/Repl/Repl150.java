package Repl;

public class Repl150 extends CarObjects{


    Repl150(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }
    public static double value(double price,double quantity){
        return price*quantity;
    }


    public static void main (String[]args){
        Repl150 obj=new Repl150("Toyota 2019",25000,1000);
        Repl150 obj2=new Repl150("BMW 2019",65298,10);
        double stockValue=obj.value(25000,1000);
        double stockValue2=obj2.value(65298,10);
        System.out.println(obj.model+" "+"Stock Value "+stockValue);
        System.out.println(obj2.model+" "+"Stock Value "+stockValue2);
    }
}
