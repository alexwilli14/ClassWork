import java.util.Scanner;

public class Assignment1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Input Width in Pixels");
        float Width = scanner.nextFloat();

        System.out.println("Input Height in Pixels");
        float Height = scanner.nextFloat();

        System.out.println("Input Resolution in PPI (Pixles Per Inch)");
        int ppi = scanner.nextInt();

        Width = Width/ppi;
        Height = Height/ppi;

        System.out.printf(" At "+ppi+ " PPI, the image is "+Width+ " wide by " +Height+ " high ");







    }
}