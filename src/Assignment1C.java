import java.util.Scanner;
public class Assignment1C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");


        char ch = scanner.next().charAt(0);

        System.out.println("The next letters after "+ch+" are "+ (char)(ch+1) +" ,"+(char)(ch+2)+" ,"+ (char)(ch+3)+"!");





    }
}
