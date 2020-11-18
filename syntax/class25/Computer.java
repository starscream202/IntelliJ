package class25;

public class Computer {
    String brand;
    int storage;
    String processor;
    Computer(String brand, int storage, String processor){
        this.brand=brand;
        this.storage=storage;
        this.processor=processor;
        System.out.println(brand+" storage is "+storage+" processor is "+processor);
    }
    final void powerOn(){
        System.out.println("Turning on computer");
    }
    void browse(){
        System.out.println("Browsing Internet");
    }final void powerDown(){
        System.out.println("Powering Down");
    }





}
