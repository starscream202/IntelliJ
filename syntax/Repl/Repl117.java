package Repl;

public class Repl117 {
    String spaceOut(String str) {

        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            newString = newString + str.charAt(i) + " ";
        }

        return newString;
    }

    public static void main(String[] args) {
        Repl117 obj = new Repl117();
        System.out.println(obj.spaceOut("hello"));
        System.out.println(obj.spaceOut("technology"));
    }
}

