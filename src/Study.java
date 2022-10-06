import java.util.Scanner;
public class Study {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a value for the size: ");
        int n = scanner.nextInt();

        for (int i = 0; i >= n; i++) {
            for (int j = 0; j >= n; j++){
                System.out.println("*");
            }

        }


    }
}
