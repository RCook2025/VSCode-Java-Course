import java.util.Scanner;

public class HomeworkL7d {
    public static void main(String[] args) {
        //Declare new scanner
        Scanner input = new Scanner(System.in);

        //Declare all variables needed
        double gradeDeciValue;

        //Ask the user for the input of the grade
        System.out.print("What is the grade in decimal form?: ");
        gradeDeciValue = input.nextDouble();

        //create loop to make sure a valid number is entered
        while (gradeDeciValue < 0 || gradeDeciValue > 4.0) {
            System.out.print("Im sorry you need to enter a valid number between 0.0 and 4.0: ");
            gradeDeciValue = input.nextDouble();
        }

        //determine the letter grade
        if (gradeDeciValue >= 3.85) {
            System.out.println("A+");
        } else if (gradeDeciValue >= 3.5) {
            System.out.println("A-");
        } else if (gradeDeciValue >= 3.15) {
            System.out.println("B+");
        } else if (gradeDeciValue >= 2.85) {
            System.out.println("B");
        } else if (gradeDeciValue >= 2.5) {
            System.out.println("B-");
        } else if (gradeDeciValue >= 2.15) {
            System.out.println("C+");
        } else if (gradeDeciValue >= 1.85) {
            System.out.println("C");
        } else if (gradeDeciValue >= 1.5) {
            System.out.println("C-");
        } else if (gradeDeciValue >= 1.15) {
            System.out.println("D+");
        } else if (gradeDeciValue >= 0.5) {
            System.out.println("D");
        } else if (gradeDeciValue >= 0.0) {
            System.out.println("F");
        }

        
    }
}
