package class15;

public class HWTask {
    public static void main(String[] args) {
       //reversing strings
        String str="Anna";
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
