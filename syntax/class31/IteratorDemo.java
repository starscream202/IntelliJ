package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList=new ArrayList<>();
        doubleArrayList.add(4.58);
        doubleArrayList.add(7.9);
        doubleArrayList.add(5.6);

        Iterator<Double> iterator=doubleArrayList.iterator();
        while (iterator.hasNext()){
            if(iterator.next()<5){
                iterator.remove();
            }
        }
        System.out.println(doubleArrayList);

    }
}
