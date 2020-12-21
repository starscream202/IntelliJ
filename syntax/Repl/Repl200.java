package Repl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Repl200 {
    public static void main(String[] args) {
        TreeSet<String>tset=new TreeSet<String>();
        tset.add("India");
        tset.add("Austrailia");
        tset.add("South Africa");
        tset.add("India");
        tset.add("America");
        tset.add("America");

        System.out.println(tset);


    }
}
class Repl201{
    public static void main(String[] args) {
        LinkedHashSet<String>linkedHashSet=new LinkedHashSet<String>();
        linkedHashSet.add("null");
        linkedHashSet.add("Sohil ");
        linkedHashSet.add("Diego");
        linkedHashSet.add("Alijon");
        linkedHashSet.add("Asel");
        linkedHashSet.add("Sumair ");

        for (String names :linkedHashSet) {
            System.out.println(names);
        }


        Iterator<String>it= linkedHashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class Repl202{
    String name;
    String lastName;
    int id;

    Repl202(String name,String lastName,int id) {
        this.name=name;
        this.lastName=lastName;
        this.id=id;

    }
    public void print(){
        System.out.println("Student Details: "+name+lastName+"with id: "+id);
    }


    public static void main(String[] args) {
        Repl202 student1=new Repl202("Samir","Jawaid",101);
        Repl202 student2=new Repl202("Asel","Umurzakova",102);
        Repl202 student3=new Repl202("Diego","Juarez",103);
        Repl202 student4=new Repl202("Sohil","Aryan",104);
        Repl202 student5=new Repl202("Alijon","Nazarov",105);


        LinkedHashSet<Repl202>tset=new LinkedHashSet<Repl202>();
        tset.add(student1);
        tset.add(student2);
        tset.add(student3);
        tset.add(student4);
        tset.add(student5);

        Iterator<Repl202> iterator = tset.iterator();
        while(iterator.hasNext()){
            iterator.next().print();
        }
    }

}
