import java.util.Scanner;

public class Lab7C {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a value for the size: ");
        int n  = scanner.nextInt();

        System.out.println("This is the requested "+ n +"x"+ n + " right-triangle:");

        for(int i = 1; i <= n; i++)
        {
            for(int j = 2; j >= 0; j--)
            {
                System.out.print(" ");
                for (int l = 0; j <= 0; j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }



    }
}
