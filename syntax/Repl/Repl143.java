package Repl;

public class Repl143 {
    private static String maxLength(String[] array){
        int max=0;
        String longest="";
        for (String s:array){
            if (s.length()>max){
                longest=s;
                max=longest.length();
            }
        }return longest;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi?","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}
