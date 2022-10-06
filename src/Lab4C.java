import java.awt.*;
import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        float number = scanner.nextFloat();

        System.out.println("What would you like to do to this number: ");
        System.out.println("0- Get the additive inverse of the number");
        System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program");

        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("The additive inverse of " +number+ " is " +-1*number );
                break;
            case 1:
                System.out.println("The reciprocal of "+number+ " is " +1/number);
                break;
            case 2:
                System.out.println("The Square of "+number+ " is "+ number*number);
                break;
            case 3:
                System.out.println("The Cube of "+number+ " is " +number*number*number);
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
                break;
            default:
                System.out.println("Invalid input, please try again!");
        }





    }
}
