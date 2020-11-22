package class29;

public class StudentA extends Marks{
    StudentA(int math, int science, int java) {
        super(math, science, java);
    }

    @Override
    int getAverage() {
        return (math+science+java)/3;
    }
}
