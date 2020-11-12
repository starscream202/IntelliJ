package class21;

public class userDetails extends userClass {

    String address;
    userDetails(String name, String mobileNumber,String address){
        super(name,mobileNumber);
        this.address=address;
    }
    void printInfo(){

        System.out.println("Name is "+super.getName()+" Phone Number is "+super.getMobileNumber()+" address is "+address);
    }

    public static void main(String[] args) {
        userDetails task1=new userDetails("Ash","5047889988","New Orleans");
        task1.printInfo();


    }


}
