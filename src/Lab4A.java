import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score of your exam: ");

        float Grade = scanner.nextFloat();

        if (Grade > 97 && Grade <= 100)  {
            System.out.println("Letter grade is: A+");}
        else if (Grade >= 95) {
            System.out.println("Letter grade is: A");}
        else if (Grade >= 92) {
            System.out.println("Letter grade is: A-");}
        else if (Grade >= 89) {
            System.out.println("Letter grade is: B+");}
        else if (Grade >= 86) {
            System.out.println("Letter grade is: B");}
        else if (Grade >= 83 ) {
            System.out.println("Letter grade is: B-");}
        else if (Grade >= 80 ) {
            System.out.println("Letter grade is: C+");}
        else if (Grade >= 77 ) {
            System.out.println("Letter grade is: C");}
        else if (Grade >= 74 ) {
            System.out.println("Letter grade is: C-");}
        else if (Grade >= 71 ) {
            System.out.println("Letter grade is: D+");}
        else if (Grade >= 68 ) {
            System.out.println("Letter grade is: D");}
        else if (Grade >= 65 ) {
            System.out.println("Letter grade is: D-");}
        else {
            System.out.println("Letter grade is: F");}
        }


        }


