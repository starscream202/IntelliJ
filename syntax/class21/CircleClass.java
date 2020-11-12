package class21;

public class CircleClass extends ShapeClass{
    double pi;
    double area;


    CircleClass(double radius) {
        super(radius);
        this.pi=3.14;
        this.area=pi*radius*radius;
    }
    void calculateArea(){
        double area=pi*radius*radius;
        System.out.println(area);
    }



    public static void main(String[] args) {
        CircleClass task2=new CircleClass(.5);
        task2.calculateArea();
    }
}
