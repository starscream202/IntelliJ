package class18;

    import java.util.Scanner;
    public class Main {
      int sum;
        int sumEvenToX(int x){
            for (int i=0; i<=x; i+=2){
              int sum1=sum+i;
                sum=sum1;
            }
            return sum;
        }

        public static void main (String[] args){
           /* Scanner scan =new Scanner(System.in);
            Main obj=new Main();
            int x=scan.nextInt();
            int y=scan.nextInt();
            int a=obj.sumEvenToX(x);
            a=obj.sumEvenToX(y);
            System.out.println(a);*/
            String subject="I love Java and I want to learn more";
            String [] splittedSub = subject.split(" ");
            System.out.println(splittedSub.length);
            for (int i = 0; i< splittedSub.length; i++) {System.out.println(splittedSub[i]);}

        }
    }


