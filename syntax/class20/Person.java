package class20;

public class Person {
    char gender;
    String name;
    int age;
    String address;
    char maritalStatus;
    String SSN;
    String phone;
    double height;
    double weight;
    int kids;
    String education;
    double salary;
    Person(String name, int age,String phone, double salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.weight=60;
        this.height=6;
        System.out.println("First constructor, 4 fields are mandatory");
    }
    Person(String name, int age,String phone, double salary, char maritalStatus,int kids){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.maritalStatus=maritalStatus;
        this.kids=kids;
        System.out.println("First constructor, 6 fields are mandatory");
    }
    Person(String name, int age,String phone, double salary, char maritalStatus,int kids,String education){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.salary=salary;
        this.maritalStatus=maritalStatus;
        this.kids=kids;
        this.education=education;
        System.out.println("First constructor, 7 fields are mandatory");
    }
    Person(String name, int age,String phone, double salary, char maritalStatus,int kids,String education,double weight, double height){
        this(name, age, phone, salary, maritalStatus, kids, education);
        this.weight=weight;
        this.height=height;
        System.out.println("First constructor, 9 fields are mandatory");
    }

    public static void main(String[] args) {
        Person person1=new Person("Ash", 27,"5046380022",0,'N',1);
    }

}
