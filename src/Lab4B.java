import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the day: ");
        String day = scanner.nextLine();

        if (day.equals("Monday") || day.equals("monday") || day.equals("Wednesday") || day.equals("wednesday") )
            System.out.println("I Have class today!");
        else if (day.equals("Friday") || day.equals("friday")) {
            System.out.println(" It's Friday! Friday! Gotta get down on Friday! ");
        }
        else  {
            System.out.println("I should use this time to do my homework.");
        }

    }
}
