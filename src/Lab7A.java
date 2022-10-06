import java.util.Scanner;

public class Lab7A {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a value for the size: ");
        int n = scanner.nextInt();

        System.out.println("This is the requested "+ n +"x"+ n + " box: ");

        for (int i = 1; i <= n; i++ ) {
            System.out.print("*");
        }
        System.out.println();
        }
    }

