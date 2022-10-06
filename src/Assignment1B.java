import java.util.Scanner;
public class Assignment1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data Inputs

        System.out.println("Input Average Lab Grade");
        float LabGrade = scanner.nextFloat();

        System.out.println("Enter Average Assignment Grade");
        float AssignmentGrade = scanner.nextFloat();

        System.out.println("Enter Average Midterm Grade");
        float MidtermGrade = scanner.nextFloat();

        System.out.println("Enter Final Exam Grade");
        float FinalGrade = scanner.nextFloat();

        LabGrade = LabGrade * .1f;
        AssignmentGrade = AssignmentGrade * .2f;
        MidtermGrade = MidtermGrade * .3f;
        FinalGrade = FinalGrade * .4f;

        float TotalGrade = LabGrade + AssignmentGrade + MidtermGrade + FinalGrade;

        System.out.println("Your Wighted Lab Grade is " +LabGrade);
        System.out.println("Your Weighted Assignment Grade is " +AssignmentGrade);
        System.out.println("Your Weighted Midterm Grade is " +MidtermGrade);
        System.out.println("You Weighted Final Grade is " +FinalGrade);

        System.out.println("Adding up.....");

        System.out.println("Your final grade in CSE 1321L is " +TotalGrade);


    }
}
