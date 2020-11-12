package class22;

public class MethodOverloading {
    //method overloading is useful because u can use methods with same name executes different functionalities

    void print(){
        System.out.println("no arguements");
    }
    void print(int a, int b){
        System.out.println(a+b);
    }
    void print(double a, double b){
        System.out.println(a*b);

    }
    int calculateSquare(int a){
        return a*a;
    }

    public static void main(String[] args) {
        MethodOverloading MOL=new MethodOverloading();
        MOL.print();
        MOL.print(7,9);
        MOL.print(9.0,8.9);
        MOL.calculateSquare(9);
        System.out.println(MOL.calculateSquare(5));
    }

}
