package class16;

public class Task1 {
    public static void main(String[] args) {
        VoidMethods.taska(10,11);
        VoidMethods.taskb(26);
        VoidMethods.taskc("WOW wow");
        Task2 task2=new Task2();
        task2.printNumberEvenorOdd(999);
        //so if we dont use public and static we just need to create object in our main method?
        Task3 task3=new Task3();
        task3.isStringPalindrone("Syntax");
        task3.isStringPalindrone("never odd or even");
        task3.isStringPalindrone(("racecar"));
    }
}
