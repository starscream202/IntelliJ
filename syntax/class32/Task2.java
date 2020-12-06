package class32;

public class Task2 {
}
abstract class CreditCard{
    String cardName;
    double balance;
    CreditCard(String cardName, double balance){
        this.cardName=cardName;
        this.balance=balance;
    }
    abstract void colorOfCard();
    abstract void tyoeOfCard();
    public void welcome(){
        System.out.println("Welcome to "+cardName);
    }
}
class Visa extends CreditCard{

    Visa(String cardName, double balance) {
        super(cardName, balance);
    }

    @Override
    void colorOfCard() {

    }

    @Override
    void tyoeOfCard() {

    }
}
