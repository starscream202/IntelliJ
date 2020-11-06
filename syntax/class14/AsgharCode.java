package class14;

import java.util.Scanner;

public class AsgharCode {
    public static void main(String[] args) {
        String username;
        String password;
        String confirmedPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter username");
        username = scanner.nextLine();
        System.out.println("Please Enter password");
        password = scanner.nextLine();
        System.out.println("Confirm password");
        confirmedPassword = scanner.next();
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("username and password can't be empty");
        } else {
            if (password.length() < 8) {
                System.out.println("Password is too short");
            } else {
                if (password.contains(username)) {
                    System.out.println("Password cannot contain username");
                } else {
                    if (!password.equals(confirmedPassword)) {
                        System.out.println("Passwords do not match");
                    } else {
                        System.out.println("Your username and password has been created");
                    }
                }
            }
        }
    }
}

