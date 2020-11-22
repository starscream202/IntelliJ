package class28;

public class ChildClass implements MyInterface,MyInterface2{
    @Override
    public void printInfo() {
        System.out.println("Printing Info");
    }

    @Override
    public void printNotes() {
        System.out.println("You can use multiple inheritance with interfaces");

    }
}
