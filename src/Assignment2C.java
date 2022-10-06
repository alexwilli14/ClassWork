import java.util.Scanner;
public class  Assignment2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("General Bison welcomes you to Pax Bisonica!");

        System.out.println("How many US Dollars do you have? ");
        float Dollars = scanner.nextFloat();

        float Pound = Dollars*.85f;

        float Bison = Pound/5f;

        System.out.println(+Dollars+ " Dollar(s) is " +Pound+ " British Pound(s),\n" +
                "which is worth " +Bison+ " Bison Dollar(s)!");



    }


}

