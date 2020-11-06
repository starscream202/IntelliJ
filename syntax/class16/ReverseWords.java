package class16;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {
        /*String sentence="What did u use the most?";
        String[] strArray=sentence.split(" ");
        System.out.println(Arrays.toString(strArray));
        //the string array is just splitting the words up not reversing them. the string biulder is reversing them
        for (int  i=0; i< strArray.length; i++){
            StringBuilder builder=new StringBuilder(strArray[i]);
            System.out.println(builder);
            strArray[i]=builder.reverse().toString();
            System.out.println(strArray[i]);
        }
        System.out.println(Arrays.toString(strArray));*/

        String sentence="What did u use the most?";
        String[] strArray=sentence.split(" ");


        //the string array is just splitting the words up not reversing them. the string biulder is reversing them
        for (int  i=0; i< strArray.length; i++){
            StringBuilder builder=new StringBuilder(strArray[i]);
            System.out.println(builder);
            strArray[i]=builder.reverse().toString();
            System.out.println(strArray[i]);
        }
        System.out.println(Arrays.toString(strArray));
    }
}
