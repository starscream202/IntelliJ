package Repl;

public class Repl124 {
    int num1;
    double num2;
    char item;
    Repl124(int num1,double num2, char item){
        this.num1=num1;
        this.num2=num2;
        this.item=item;
    }
    void print(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(item);
    }

    public static void main(String[] args) {
        Repl124 task=new Repl124(10,10.23,'a');
        task.print();
        Repl124 task2=new Repl124(100,100.23,'s');
        task2.print();
    }
}
