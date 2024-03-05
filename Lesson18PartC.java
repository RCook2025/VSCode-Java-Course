import java.util.ArrayList;
import java.util.Scanner;

public class Lesson18PartC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAXSIZE = 100;
        ArrayList<Double> temps = new ArrayList<Double>();

        double smallest = 100;
        int currentSize = 0;
        boolean doLoop = true;
        double lowest = 0;
        while (doLoop) {
            // prompt user.
            System.out.print("Enter a temperature value or 'q' to quit: ");
            // check for q or number
            if (input.hasNext("q") || input.hasNext("Q")) {
                doLoop = false;
            } else if (input.hasNext()) {
                // check if there's space in array
                if (temps.size() < MAXSIZE) {
                    temps.add(input.nextDouble());
                    if (smallest > temps.size()) {
                        smallest = temps.size();
                    }
                    currentSize++;
                    for (int i = 0; i < temps.size(); i++) {
                        if (i == 0) {
                            lowest = temps.get(i);
                        } else {
                            if (temps.get(i) < lowest) {
                                lowest = temps.get(i);
                            }
                        }

                    }
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
        for (int i = 0; i < temps.size(); i++) {
            if (temps.get(i) == lowest) {
                System.out.println(temps.get(i) + "   <=== Lowest");
            } else {
                System.out.println(temps.get(i));
            }
        }
    }
}
