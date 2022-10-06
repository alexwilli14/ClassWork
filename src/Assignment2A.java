import java.util.Scanner;

public class  Assignment2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people are in your group? ");
        Integer pplinGroup = scanner.nextInt();

        System.out.println("How many groups do you want: ");
        Integer groupAmount = scanner.nextInt();



        Integer evenSplit= pplinGroup%groupAmount;

        System.out.println("If we divide "+pplinGroup+" people in "+groupAmount+" groups evenly, "+evenSplit+" person/people will be left without a group");




    }
}