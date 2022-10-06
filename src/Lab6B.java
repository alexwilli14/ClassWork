
import java.util.Random;
import java.util.Scanner;

public class Lab6B {
    public static void main (String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        float randInt;
        int counter = 0;

        System.out.print("Enter a number between 1 and 1000: ");
        float number = scanner.nextFloat();

        while (number >= 1 && number <= 1000) {
            randInt = r.nextFloat(1001);
            randInt = Math.round(randInt);
            ++counter;
            System.out.println("My guess was "+randInt);
            if (randInt == number) {
                System.out.println();
                System.out.println("I guessed the number was "+number+" and it only took me "+counter+ " guesses");
                break;
            }
        }
    }
}
