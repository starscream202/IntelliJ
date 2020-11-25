package Repl;

public class Animal {
    String Animal;

    Animal(String animal){
        this.Animal=Animal;
    }
    void eat(){
        System.out.println(Animal+" eats");
    }
    void sleep(){
        System.out.println(Animal+" sleeps");
    }
}
    class Cat extends Animal{
        Cat(String Animal){
            super(Animal);
            this.Animal=Animal;
        }
        void sleep(){
            System.out.println(Animal+" sleeps a lot");
        }

    }
    class kitten1 extends Cat{
        kitten1(String Animal){
            super(Animal);
            this.Animal=Animal;
        }
        void eat(){
            System.out.println(Animal+" eats milk");
        }
    }
    class kitten2 extends Cat{
        kitten2(String Animal){
            super(Animal);
            this.Animal=Animal;
        }
        void eat(){
            System.out.println(Animal+" eats snacks");
        }
    }
    class kitten3 extends Cat{
        kitten3(String Animal){
            super(Animal);
            this.Animal=Animal;
        }
        void eat(){
            System.out.println(Animal+" eats everything");
        }
    }
class AnimalTester{
    public static void main(String[] args) {
        Animal[] animal={new Cat("Cat"),new kitten1("kitten1"),new kitten2("kitten2"),new kitten2("kitten2")};
        for(Animal animals:animal){
            animals.eat();
            animals.sleep();
        }
    }
}
