package class14;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please create username");
        String username= scan.nextLine();
        System.out.println("Please create password");
        String password= scan.nextLine();
        System.out.println("Re-enter password");
        String password2= scan.nextLine();
        if (username.isEmpty()){
            System.out.println("Username can not be empty");
        }
        else if(password.isEmpty()){
            System.out.println("Password can not be empty");
        }
        else if(password.length()<8){
            System.out.println("password is too short");
        }
        else if(password.contains(username)){
            System.out.println("password can not contain username");
        }
        else if(!(password2.equals(password))){
            System.out.println("Passwords don't match");
        }else{
            System.out.println("Username and Password created");
        }
    }
}
