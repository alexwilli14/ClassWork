import java.util.Scanner;

public class Assignment4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum, action;
        boolean isRunning = true;

        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        userNum = scanner.nextInt();

        while (isRunning) {

            if (userNum == 0)
            {
                System.out.println("What would you like to do to this number:\n-1- Re-enter the number \n0- Get the additive inverse of the number\n2- Square the number \n3- Cube the number\n4- Exit the program");
            }

            else
            {
                System.out.println("What would you like to do to this number:\n-1- Re-enter the number \n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number \n3- Cube the number\n4- Exit the program");
            }

            action = scanner.nextInt();

            while (action < -1 || action > 4)
            {
                System.out.print("Enter a valid number between -1 and 4: ");
                action = scanner.nextInt();
            }

            switch (action)
            {
                case 0:
                    float addInverse = userNum * -1f;
                    System.out.println("The additive inverse of "+userNum+" is "+addInverse);
                    System.out.println();
                    break;
                case 1:
                    float recip = 1 / (float)userNum;
                    System.out.println("The reciprocal of "+userNum+" is "+recip);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("The square of "+userNum+" is "+userNum * userNum);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("The cube of "+userNum+" is "+userNum * userNum * userNum);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thank you, goodbye!");
                    isRunning = false;
                case -1:
                    System.out.print("Please input a number: ");
                    userNum = scanner.nextInt();
                    System.out.println();
                    break;
            }
        }
    }
}

