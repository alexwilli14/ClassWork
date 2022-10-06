import java.util.Scanner; 

public class Assignment3C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String augmentedSupport = "";
        String bluetooth = "";
        float version;

        System.out.println("[App Checklist]");
        System.out.print("What mobile device do you have? ");
        String device = scanner.next();

        // Only accepts capital "A" with no space at the end
        if (device.equals("Android"))
        {
            System.out.print("What version do you have? ");
            version = scanner.nextFloat();

            if (version < 11)
            {
                System.out.print("Does your device support Augmented Reality? ");
                augmentedSupport = scanner.next();
            }
            // Only accepts capital "Y" with no space at the end
            if (version >= 11 || augmentedSupport.equals("Yes"))
            {
                System.out.println("Congratulations, you can run the app!");
            }
            else
            {
                System.out.println("I'm sorry, our app does not support your device.");
            }
        }

        // Only accepts capital "A" with no space at the end
        else if (device.equals("Apple"))
        {
            System.out.print("What version do you have? ");
             version = scanner.nextFloat();
            if (version < 12)
            {
                System.out.print("Does your device support Bluetooth connections? ");
                bluetooth = scanner.next();
            }
            // Only accepts capital "Y" with no space at the end
            if (bluetooth.equals("Yes") || version >= 12)
            {
                System.out.println("Congratulations, you can run the app");
            }
            else
            {
                System.out.println("I'm sorry, our app does not support your device.");
            }
        }
        else {
            System.out.println("I'm sorry, our app does not support your device.");
        }

    }
}

