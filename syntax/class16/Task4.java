package class16;

public class Task4 {
    static void sayHello(String country){
        switch(country){
            case "USA":
                System.out.println("Hello");
                break;
            case "China":
                System.out.println("Ni how");
                break;
            case "Turkey":
                System.out.println("Marhaba");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
}
