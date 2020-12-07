package Repl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Repl_188 {
   public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }

}
class Repl_189{
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("hi");
        strings.add("yo");
        strings.add("sup");
        strings.add("yolo");
        strings.add("boop");
        strings.remove(0);
        strings.remove("sup");
        strings.remove("boop");
        System.out.print(strings.get(0)+" "+strings.get(1));

    }
}
class Repl_190{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Integer num1=scan.nextInt();
        Integer num2= scan.nextInt();
        Integer num3=scan.nextInt();
        Integer num4= scan.nextInt();
        Integer num5= scan.nextInt();
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(num1);
        integers.add(num2);
        integers.add(num3);
        integers.add(num4);
        integers.add(num5);
        //System.out.println(integers);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}

