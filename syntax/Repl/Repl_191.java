package Repl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Repl_191 {
    public static void main(String[] args) {
        LinkedList<Integer> integers=new LinkedList<>();

        for(int i=50;i<101; i++){
            integers.add(i);

            }
        Iterator<Integer> iterator = integers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%3!=0){
                iterator.remove();
            }
        }
        System.out.println(integers);
    }
}
class Repl_192{
    public static void main(String[] args) {
        LinkedList<Integer>integers=new LinkedList<>();
        Integer num1=0;
        Integer count=10;
        Integer num2=1;

        for(int i=0;i<count;i++){
            integers.add(num1);
            Integer sum=num1+num2;
            num1=num2;
            num2=sum;
        }
        System.out.println(integers);
    }
}
class Repl_193{
    public static void main(String[] args) {
        ArrayList<Boolean>booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);

        Iterator<Boolean> iterator = booleans.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class Repl_194{
    public static void main(String[] args) {
        LinkedList<Integer> integers=new LinkedList<>();
        for (int i=2; i<101; i++){
           if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
               integers.add(i);
           }
           else if(i==2|| i==3||i==5||i==7){
               integers.add(i);
           }

    }System.out.println(integers);
}}
class Repl_195{
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        Integer sum=0;
        for (int i=0;i< list.size();i++){

            sum+=list.get(i);
        }
        System.out.println(sum);

    }
}
class Repl_196{
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(countries);

    }
}