package class15;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String mom="Mary";

        String dad="Daniel";
        System.out.println("Are you having boy or girl?");
        String baby=scan.nextLine();
        if(baby.equals("boy")){
            System.out.println(dad.substring(0,3)+mom.substring(1,4));
        }else if(baby.equals("girl")){
            System.out.println(mom.substring(0,3)+dad.substring(3,6));
        }else{
            System.out.println("Error determining sex");
        }
    }
}
