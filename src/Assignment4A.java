import java.util.Scanner;
public class Assignment4A {
    public static void main(String[] args) {
        int counter = 0;
        String input = "";
        Scanner scanner = new Scanner(System.in);
        int italy = 0, costaRica = 0, paxBisonica = 0, ghana = 0;
        String mostPopular = "";
        int max = 0;
        System.out.println("[CCSE Study Abroad Survey]");

        while (!input.equals("Quit")) {
            ++counter;
            System.out.println("Student #" + counter + ": Which country should we go to for our next study abroad program?\nItaly\nCosta Rica\nPax Bisonica\nGhana\n (Type Quit to end survey)");
            input = scanner.nextLine();

            switch (input) {
                case "Italy" -> {
                    italy++;
                    if (italy > max) {
                        max = italy;
                        mostPopular = "Italy.";
                    }
                    System.out.println("Thank you!");

                }
                case "Ghana" -> {
                    ghana++;
                    if (ghana > max) {
                        max = ghana;
                        mostPopular = "Ghana.";
                    }
                    System.out.println("Thank you!");

                }
                case "Costa Rica" -> {
                    costaRica++;
                    if (costaRica > max) {
                        max = costaRica;
                        mostPopular = "Costa Rica.";
                    }
                    System.out.println("Thank you!");

                }
                case "Pax Bisonica" -> {
                    paxBisonica++;
                    if (paxBisonica > max) {
                        max = paxBisonica;
                        mostPopular = "Pax Bisonica.";
                    }
                    System.out.println("Thank you!");
                }
            }
            System.out.println();
        }
        System.out.println("[Results]\nItaly: " + italy + "\nCosta Rica: " + costaRica + "\nPax Bisonica: " + paxBisonica + "\nGhana: " + ghana);
        System.out.println("Next year's study abroad program will take place in " + mostPopular);
    }
}
