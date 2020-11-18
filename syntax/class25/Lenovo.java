package class25;

public class Lenovo extends Computer {
    Lenovo(String brand, int storage, String processor) {
        super(brand, storage, processor);
    }

    @Override
    void browse() {
        super.browse();
        System.out.println("Browsing using FireFox ");
    }

    public static void main(String[] args) {
        Lenovo obj[]=new Lenovo[2];
        obj[0]=new Lenovo("Lenovo",256,"i7");
        obj[1]=new Lenovo("Lenovo2",256,"i7");
        for (int i=0; i< obj.length;i++){
            obj[i].powerOn();
            obj[i].browse();
            obj[i].powerDown();
        }

    }
}
