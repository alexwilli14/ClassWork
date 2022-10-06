import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Width: ");
        int Width = scanner.nextInt();

        System.out.println("Enter a Height: ");
        int Height = scanner.nextInt();

        System.out.println("The Area is " +Width*Height);

        System.out.println("The Perimeter is " + 2*(Width + Height));

    }
}