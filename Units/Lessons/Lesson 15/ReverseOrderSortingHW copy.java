import java.util.Arrays;
import java.util.Scanner;

public class ReverseOrderSortingHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAXSIZE = 10;
        int[] values = new int[MAXSIZE];

        int currentSize = 0;
        boolean doLoop = true;
        while (doLoop) {
            // prompt user.
            System.out.print("Enter a test score or 'q' to quit: ");
            // check for q or number
            if (input.hasNext("q") || input.hasNext("Q")) {
                doLoop = false;
            } else if (input.hasNextInt()) {
                // check if there's space in array
                if (currentSize < values.length) {
                    values[currentSize] = input.nextInt();
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
        System.out.print("*");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            System.out.print("*");
        }
        System.out.println();

        Arrays.sort(values);
        for (int i = currentSize; i > 0; i--) {
            System.out.print(values[i]);
            if (i > -1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}
