package Repl;

public class Repl154 extends Method1{
    public static void main(String[] args) {

        int[][] a= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(sum2D(a));

    }
}
class Method1{
    static int sum2D(int [][] a){
        int sum=0;
        for (int i=0; i< a.length; i++){
            for (int j=0; j< a[i].length; j++){
                sum=sum+a[i][j];
            }
        }return sum;
    }

}


