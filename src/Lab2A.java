import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter another name: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();
        System.out.println("Enter an Adverb: ");
        String adverb = scanner.nextLine();



        System.out.println("Once upon a time, there was a person named " +name1+ " who had a child named\n" +
               "" +name2+  ". This child would " +verb+" " +adverb+" while singing to strangers.");



    }
}
