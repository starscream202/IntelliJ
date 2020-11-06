package class17;

public class Task {
    boolean isPrime(int number){
        boolean isPrime=true;
        if (number<=1){
            return false;
        }
        for (int i=2; i<number/2;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
