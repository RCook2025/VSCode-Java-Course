import java.util.Arrays;
import java.util.Scanner;

public class TargetValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MAXSIZE = 20;
        int[] values = new int[MAXSIZE];

        int currentSize = 0;
        boolean doLoop = true;
        while (doLoop) {
            // prompt user.
            System.out.print("Enter an integar or 'q' to quit: ");
            // check for q or number
            if (input.hasNext("q") || input.hasNext("Q")) {
                doLoop = false;
                input.next();
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
        Arrays.sort(values, 0, currentSize);
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (i < currentSize) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int targetValue = 0;
        int amount = 0;
        int index = -1;

        System.out.print("Do you want to look for a specific value? Type true or false: ");
        String yesNo = input.next();
        if (yesNo.toLowerCase().equals("true")) {
            while (true) {
                System.out.print("Enter the target value: ");
                if (input.hasNextInt()) {
                    targetValue = input.nextInt();
                    break;
                } else {
                    System.out.println("Whats the matter input a number!!!!!");
                }
            }

            for (int i = 0; i < currentSize; i++) {
                if (values[i] == targetValue) {
                    amount++;
                }
            }
            System.out.println("The target value shows up " + amount + " times.");
        }
    }
}
