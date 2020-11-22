package class29;

public class StudentB extends Marks{
    int selenium;
    StudentB(int math, int science, int java,int selenium) {
        super(math, science, java);
        this.selenium=selenium;

    }

    @Override
    int getAverage() {
        return (math+selenium+science+java)/4;

    }
}
