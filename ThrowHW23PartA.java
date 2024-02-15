import java.util.Scanner;

public class ThrowHW23PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            double score = getQuizScore(in);
            System.out.println("Score = " + score + "%");
        } catch (Exception e) {
            System.err.println("An error occured!");
            System.out.println(e.getMessage());
        }
    }

    public static double getQuizScore(Scanner in) {
        System.out.print("Enter your quiz score: ");
        double score = in.nextInt();
        if (score < 0 || score >=100.01) {
            // throw new IllegalArgumentException("The Score must be between 0 and 100"); Is the same thing as what is below what is the difference in the code?
            throw new IllegalArgumentException("Age must be greater than zero");
        } else {
            return score;
        }
    }
}
