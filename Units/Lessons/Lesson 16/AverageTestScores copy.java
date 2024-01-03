import java.util.Arrays;
import java.util.Scanner;

public class AverageTestScores {
    public static double average(double[] scores) {
        double ave = 0;
        double total = 0;
        // another version for the line of code below: for (double element: scores)
        for (int i = 0; i < scores.length; i++) {
            total = total + scores[i];
        }
        ave = total / scores.length;
        return ave;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        

        final int MAXSIZE = 100;
        double[] scores = new double[MAXSIZE];

        double smallest = 100;
        int currentSize = 0;
        boolean doLoop = true;
        while (doLoop) {
            // prompt user.
            System.out.print("Enter a test score or 'q' to quit: ");
            // check for q or number
            if (input.hasNext("q") || input.hasNext("Q")) {
                doLoop = false;
            } else if (input.hasNextDouble()) {
                // check if there's space in array
                if (currentSize < scores.length) {
                    scores[currentSize] = input.nextDouble();
                    if (smallest > scores[currentSize]) {
                        smallest = scores[currentSize];
                    }
                    currentSize++;
                } else {
                    // no space left
                    System.out.println("There is no more space in the array.");
                    doLoop = false;
                }
            } else {
                // the user provided an invaild input
                System.out.println("Invaild input! Please only enter in a double value or 'q' to quit.");

                // skip over the next value which is not a double
                input.next();
            }
        }


        System.out.println("The average of the scores is: " + average(Arrays.copyOf(scores, currentSize)));


    }
}
