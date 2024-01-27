import java.util.ArrayList;
import java.util.Scanner;

public class Lesson18PartA {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        
        double smallest = 100;
        boolean doLoop = true;
        while (doLoop) {
            // prompt user.
            System.out.print("Enter a name or '1' to quit: ");
            // check for q or number
            if (in.hasNext("1")) {
                doLoop = false;
                in.next();
            } else if (in.hasNext()) {
                // check if there's space in array
                if (names.size() < smallest) {
                    names.add(in.next());

                } else {
                    // no space left
                    System.out.println("There is no more space in the array.");
                    doLoop = false;
                }
            } else {
                // the user provided an invaild input
                System.out.println("Invaild input! Please only enter in a double value or 'q' to quit.");

                // skip over the next value which is not a double
                in.next();
            }
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
