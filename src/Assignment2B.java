import java.util.Scanner;

public class  Assignment2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[Lerping!]");
        System.out.println("Enter the x coordinate for Keyframe #1: ");
        float StartingX = scanner.nextInt();

        System.out.println("Enter the x coordinate for Keyframe #2: ");
        float CurrentX = scanner.nextInt();

        System.out.println("How many frames have passed? ");
        float framesPassed = scanner.nextInt();

        float TotalDistance=CurrentX - StartingX;

        float Frames1=StartingX + (TotalDistance*framesPassed/30);
        float Frames2=StartingX + (TotalDistance*framesPassed/60);


        System.out.println("The character has to move " +TotalDistance+ " places in a second.");
        System.out.println("At 30 FPS, their current X position would be " +Frames1+ ".");
        System.out.println("At 60 FPS, their current X position would be " +Frames2+ ".");









    }

}