package class22;

public class Area {
    double CalculateArea(double l, double w){
        return l*w;

    }
    double CalculateArea(double a){
        return a*a;
    }
    double CalculateArea(double h, double l, double w){
        return h*l*w;
    }

    public static void main(String[] args) {
        Area task1=new Area();
        System.out.println(task1.CalculateArea(4));
        System.out.println(task1.CalculateArea(4,4,5));
        System.out.println(task1.CalculateArea(5,6));
    }

}
