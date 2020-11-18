package class25;

public class Apple extends Computer{
    Apple(String brand, int storage, String processor) {
        super(brand, storage, processor);
    }

    @Override
    void browse() {
        super.browse();
        System.out.println("Browsing on Safari");
    }
    public static void main (String[] args){
        Apple obj[]=new Apple[2];
        obj[0]=new Apple("Macbook",256,"i7");
        obj[1]=new Apple("Mac",56,"i6");
        for (int i=0; i< obj.length;i++){
            obj[i].browse();
        }
    }

}
