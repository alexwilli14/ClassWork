import java.util.Scanner;
public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[Backspace Animation]\nPlease enter your sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("How many letters do you want to backspace?");
        int backspaces = scanner.nextInt();
        System.out.print(sentence);

        for(int i = 1; i <= backspaces; i++) {
            System.out.print("\b");
        }
    }
}