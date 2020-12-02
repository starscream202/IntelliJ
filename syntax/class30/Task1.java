package class30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Mike");
        names.add("Burju");
        names.add("Asghar");
        names.add("Mom");
        names.add("Ash");
        names.add(2,"Asif");
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names);
        System.out.println(names.contains("Mujtuba"));
        System.out.println("__________________________");
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Michael");
        names2.add("Burju");
        names2.add("Asu");
        names2.add("Mommy");
        names2.add("Ali");
        System.out.println(names);
        System.out.println(names2);
        System.out.println("__________________________");
        System.out.println("ADD all method");
        names.addAll(names2);
        System.out.println(names);
        System.out.println("__________________________");
        System.out.println("Sort method");
        Collections.sort(names);
        System.out.println(names);
        System.out.println("__________________________");
        System.out.println("Remove method");
        names.remove("Burju");
        System.out.println(names);
        System.out.println("__________________________");
        System.out.println("Remove All method");
        names.removeAll(names2);
        System.out.println(names);
        System.out.println(names2);
        System.out.println("__________________________");
        System.out.println("Retain All method");
        names.retainAll(names2);
        System.out.println(names2);
        System.out.println(names);
        System.out.println("__________________________");
        System.out.println("For Each");
        for (String  s :names2) {
            System.out.println(s);

        }
        System.out.println("__________________________");
        System.out.println("Iterator");
        Iterator<String> iterator= names2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
