package class29;

public class Square implements Shape{
    double a;
    Square(double a){
        this.a=a;
    }
    @Override
    public void CalculateArea() {
        System.out.println(a*a);
    }

    @Override
    public void CalculatePerimeter() {
        System.out.println(a+a+a+a);
    }
}
