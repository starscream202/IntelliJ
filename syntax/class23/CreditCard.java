package class23;

public class CreditCard {
    double balance;
    double interest;
    CreditCard(double balance, double interest){
        this.balance=balance;
        this.interest=interest;
    }

    void printInterest(){
        System.out.println("The interest amount is "+balance*interest);
    }
    static class Visa extends CreditCard{

        Visa(double balance, double interest) {
            super(balance, interest);
        }
    }
    static class AX extends CreditCard{
        AX(double balance, double interest) {
            super(balance, interest);
        }

        void printInterest(){
            System.out.println("The interest amount  for AX is "+balance*interest);
        }
    }

    public static void main(String[] args) {
        CreditCard task= new CreditCard(1000,.1);
        Visa task1= new Visa(2000,.1);
        AX task2= new AX(3000,.2);
        task.printInterest();
        task1.printInterest();
        task2.printInterest();
    }
}
