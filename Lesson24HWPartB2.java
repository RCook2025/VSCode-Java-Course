import java.util.Scanner;

class Counter {
    private int count;

    /*
     * Create method to return the value of the counter to the user
     */
    public int getCount() {
        return count;
    }

    /*
     * Declare method to increase the count on the device
     */
    public void count() {
        if (count < 9999) {
            count = count + 1;
        } else {
            count = 0;
        }
    }

    /*
     * Declare method to reset counter
     */
    public void reset() {
        count = 0;
    }
}

public class Lesson24HWPartB2 {
    public static void main(String[] args) {
        Counter pieCounter = new Counter();
        Counter cakeCounter = new Counter();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'c' for cake, 'p' for pie, 'q' to quit: ");
            String word = in.next();
            if (word.toLowerCase().equals("c")) {
                cakeCounter.count();
            } else if (word.toLowerCase().equals("p")) {
                pieCounter.count();
            } else {
                break;
            }
        }
        System.out.printf("No. of cakes: %03d%n", cakeCounter.getCount());
        System.out.printf("No. of pies: %03d%n", pieCounter.getCount());

        in.close();
    }
}
