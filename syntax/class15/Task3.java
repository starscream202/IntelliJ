package class15;

public class Task3 {
    public static void main(String[] args) {
        String Sentence="I love Java Programming";
        System.out.println(Sentence.replace(" ","|"));
        String a="as harf *&*(1234";
        System.out.println(a.replaceAll("^[a-z]",""));
        String b=a.replaceAll("^[a-z]"," ");
        //System.out.println(b.length());
    }
}
