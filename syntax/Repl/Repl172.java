package Repl;

public class Repl172 {
    final void print(String a){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(a);
        System.out.println(stringBuilder.reverse());
    }

    public static void main(String[] args) {
        Repl172 obj=new Repl172();
        obj.print("mohammed");
    }
}
