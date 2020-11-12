package class21;

public class MoneerClass extends ParentClass {
    void marry(){
        System.out.println("Marry Katrina Kaif");//prints from MoneerClass
        super.marry();//prints from superclass
    }

    public static void main(String[] args) {
        MoneerClass moneerClass=new MoneerClass();
        moneerClass.marry();
    }
}
