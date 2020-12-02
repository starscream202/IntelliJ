package class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        for (int i=2;i<51;i+=2){
           integerArrayList.add(i);
        }
        System.out.println(integerArrayList);
        Iterator<Integer>integerIterator=integerArrayList.iterator();
        while(integerIterator.hasNext()){
            if(integerIterator.next()%5==0){
                integerIterator.remove();
            }
        }
        System.out.println(integerArrayList);
    }


}
