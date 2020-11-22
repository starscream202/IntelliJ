package class29;

public abstract class Marks {
    int math;
    int science;
    int java;
    Marks(int math, int science, int java){
        this.math=math;
        this.science=science;
        this.java=java;
    }

    abstract int getAverage();
}
