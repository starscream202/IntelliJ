package class33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class   MapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> item=new HashMap<>();
        item.put("Beignet",3.75);
        item.put("Frozen",5.74);
        item.put("Small au lait",3.24);
        item.put("Medium au lait",3.75);
        item.put("Large au lait",4.74);

        Set<String> itemName= item.keySet();
        Iterator<String> iterator=itemName.iterator();

        while (iterator.hasNext()){
            String key= iterator.next();
            System.out.println(key);
            System.out.println(item.get(key));
        }
        HashMap<String,Double> itemlist=new HashMap<>();
        itemlist.put("Large hot chocolate",4.74);
        itemlist.put("Med hot chocolate",3.75);
        itemlist.put("Small hot chocolate",3.24);

        itemlist.putAll(item);
        Set<String>set=itemlist.keySet();
        Double sum=0.0;
        for (String s :set) {
          /*  if(s.equals("Frozen")){
                itemlist.remove(s);
            }*/
            if(itemlist.get(s)!=null){
                sum+=itemlist.get(s);
            }

        }
        System.out.println("Total spending: "+sum);
        System.out.println(itemlist);
    }
}
