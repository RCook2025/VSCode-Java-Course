import java.util.ArrayList;
import java.util.Scanner;

public class Lesson18PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        

        final int MAXSIZE = 100;
        ArrayList <Double> testScores = new ArrayList<Double>();

        double smallest = 100;
        int currentSize = 0;
        boolean doLoop = true;
        while (doLoop) {
            // prompt user.
            System.out.print("Enter a test score or 'q' to quit: ");
            // check for q or number
            if (input.hasNext("q") || input.hasNext("Q")) {
                doLoop = false;
            } else if (input.hasNext()) {
                // check if there's space in array
                if (testScores.size() < MAXSIZE) {
                    testScores.add(input.nextDouble());
                    if (smallest > testScores.size()) {
                        smallest = testScores.size();
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
        double total = 0;
        int count = 0;
        for (int i = 0; i < testScores.size(); i++) {
            System.out.printf("%10.02f%n", testScores.get(i));
            total = total + testScores.get(i);
            count++;
        }
        System.out.println("Average: " + total/count);


    }
}
