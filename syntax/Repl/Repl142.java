package Repl;

public class Repl142 {
    public static String alphabetical(String str) {
        char previous = str.charAt(0);
        char current;
        String newString = "" + previous;
        for (int i = 1; i < str.length(); i++) {
            current = str.charAt(i);
            if (current > previous) {
                newString += str.charAt(i);
            }
            previous = current;
        }
        return newString;
    }
    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));


    }}

