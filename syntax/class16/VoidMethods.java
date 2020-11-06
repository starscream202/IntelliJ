package class16;

import java.util.Arrays;

public class VoidMethods {
    public static void print(){
        System.out.println("Hi Everyone!");
        //static
    }
    public static void print(String string){
        System.out.println(string);
        System.out.println("Excellent "+ string);
    }
    public static void taska(double num1,double num2){
        if(num1>num2){
            System.out.println(num1);
        }else if(num1<num2){
            System.out.println(num2);
        }else{
            System.out.println(num1+" is equal to "+num2);
        }

    }
    public static void taskb(int num1){
        if(num1%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void taskc(String sentence){
        String[] strArray=sentence.split(" ");
        for(int i=0; i<strArray.length;i++){
            StringBuilder builder=new StringBuilder(strArray[i]);
            System.out.println(builder);
            strArray[i]=builder.reverse().toString();
            System.out.println(strArray[i]);
            System.out.println(Arrays.toString(strArray));
        }
    }
}
