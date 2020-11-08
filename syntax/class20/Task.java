package class20;

public class Task {
    String name;
    String address;
    Task(String name, String address){
        this.name=name;
        this.address=address;

    }
    void displayinfo(){
        System.out.println("Name is "+name);
        System.out.println(("Address is "+address));
    }

    public static void main(String[] args) {
        Task task1=new Task("mohammed","12345 I-10 service rd.");
        System.out.println(task1.name);
        System.out.println(task1.address);
        task1.displayinfo();
    }
}
