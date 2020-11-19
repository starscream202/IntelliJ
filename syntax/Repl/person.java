package Repl;

 class Person {
    String name;
    String lastName;
    int age;

    Person(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;

    }
    public static void main (String[] args){
        Person emp=new Employee("Joe","Smith",35,35000);
        Person Student=new Student("Adam", "Smith",15,10);
        Person Senior=new Senior("Frank","Smith",15,"Tour");
    }

}
 class Employee extends Person{
     int salary;

    Employee(String name, String lastName, int age,int salary) {
        super(name, lastName, age);
        this.salary=salary;
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }



}
class Student extends Employee{

    Student(String name, String lastName, int age, int salary) {
        super(name, lastName, age, salary);
    }
}
class Senior extends Person{
    String activity;
    Senior(String name, String lastName, int age,String activity) {
        super(name, lastName, age);
        this.activity=activity;
        System.out.println(name+" "+lastName+" "+age+" "+activity);
    }
}

