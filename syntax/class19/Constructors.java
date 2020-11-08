package class19;

public class Constructors {
    String name;
    int age;
    double salary;
    private Constructors(String name){
        this.name=name;// i can only create objects of my class from same class
    }
    Constructors(int age){
        this.age=age;
    }
    public Constructors(double salary){
        this.salary=salary;
    }

    public static void main(String[] args) {
        Constructors task3=new Constructors("ash");
        System.out.println(task3.age);
        System.out.println(task3.name);
        System.out.println(task3.salary);
    }

}
