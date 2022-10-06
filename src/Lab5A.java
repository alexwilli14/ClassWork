import java.util.Scanner;

public class Lab5A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have a driving permit (Y/N)? ");
        char permit = scanner.next().charAt(0);


        if (permit == 'Y' || permit == 'y' )
        {
            System.out.print("Do you have a commercial driving license (Y/N)? ");}

        else if (permit == 'N' || permit == 'n' ) {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");}

        char commercial = scanner.next().charAt(0);

        if (commercial == 'Y' || commercial == 'y') {
            System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");

        }
        if (commercial == 'N' || commercial == 'n') {
            System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
        }


    }
}
