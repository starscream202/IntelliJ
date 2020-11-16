package Repl;

public class Main {
	int sum;
	int sumEvenToX(int x){
	    for (int i=0; i<=x; i+=2){
	    sum=sum+i;
	      
	    }
	   return sum;
	  }

	    public static void main (String[] args){
	      Main obj=new Main();
	      int a=obj.sumEvenToX(8);
	      System.out.println(a);
	    }
	}




