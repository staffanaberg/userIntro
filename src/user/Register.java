package user;

import java.util.Scanner;

public class Register {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome, please enter userName and password to register");

        String userName = scan.nextLine();
        String password = scan.nextLine();


        User myUser = new User(userName, password);

        System.out.println("Please enter a new password");

        String newPassword = scan.nextLine();

      //  myUser.setPassword(newPassword);

        //String actual = myUser.getPassword();

       // System.out.println("Your password is now set to: " +actual);


    }

}
