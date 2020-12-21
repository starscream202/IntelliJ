package Repl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Repl204 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> hmap=new LinkedHashMap<>();
        hmap.put("Street","Patrick ST");
        hmap.put("Suite","265");
        hmap.put("City","Vienna");
        hmap.put("Zip","22180");
        hmap.put("Country","United State");

        Set<Map.Entry<String, String>> entries = hmap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,String>mentry= iterator.next();
            System.out.println(mentry.getValue());
        }



    }
}
