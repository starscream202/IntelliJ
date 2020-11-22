package class29;

 class  Circle implements Shape{
     final double pi=3.14;

     double radius;

     Circle(double radius){
         this.radius=radius;

     }
     @Override
     public void CalculateArea() {
         System.out.println(pi*radius*radius);
     }

     @Override
     public void CalculatePerimeter() {
         System.out.println(2*pi*radius);

     }
 }
