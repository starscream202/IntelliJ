package class23;

public class Degree {
    void printRequisite(){
        System.out.println("Must have high school diploma");
    }
     static class Bachelors extends Degree{

    }
     static class Masters extends Degree{
        void printRequisite(){
            System.out.println("Must have Bachelors degree");
        }
    }

    public static void main(String[] args) {
        Degree task1= new Degree();
        task1.printRequisite();
        Masters overide= new Masters();
        overide.printRequisite();
        Bachelors task2= new Bachelors();
        task2.printRequisite();
    }

}
