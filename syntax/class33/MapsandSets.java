package class33;

import java.util.*;

public class MapsandSets {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"PRESIDENT");
        map.put(2,"Vice President");
        map.put(3,"PRESIDENT");
        System.out.println(map);
        System.out.println(map.clone());

        Map<String,Integer>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("JAck",1);
        linkedHashMap.put("Burju",2);

        //System.out.println(map.entrySet());
        map.entrySet().iterator();
        Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator=entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer,String> element= iterator.next();
            System.out.println(element.getKey());
            System.out.println(element.getValue());


        }


        }

    }








