package class21;

public class userClass {
    private String name;
    String mobileNumber;
    userClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
    void printInfo(){
        System.out.println("Name is "+name+" Phone Number is "+mobileNumber);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getName() {
        return name;
    }
}
