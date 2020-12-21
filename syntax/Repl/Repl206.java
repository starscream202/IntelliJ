package Repl;

import java.util.*;

public class Repl206 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String>lmap=new LinkedHashMap<>();
        lmap.put(1,"apple");
        lmap.put(2,"banana");
        lmap.put(3,"pear");
        lmap.put(4,"tomato");
        lmap.put(5,"mango");
        lmap.put(6,"kiwi");

        Set<Map.Entry<Integer, String>> entries = lmap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer,String>mentry= iterator.next();
            System.out.println("Key is "+mentry.getKey()+" item and values is "+mentry.getValue());

        }


    }
}
class Repl207{
    public static void main(String[] args) {
        HashMap<String,Integer>hmap=new HashMap<>();
        hmap.put("mango",10);
        hmap.put("apple",30);
        hmap.put("orange",20);
        hmap.put("mango",40);
        hmap.put("mango",40);

        Set<Map.Entry<String, Integer>> entrySet = hmap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer>mentry= iterator.next();
            System.out.println("Key = "+mentry.getKey()+" and value = "+mentry.getValue());
        }


    }

}
