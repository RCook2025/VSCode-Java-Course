import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer or type 'q' to quit: ");
            if (input.hasNext("q") || input.hasNext("Q")) {
                input.next(); //remove q from scanner
                break;
            } else {
                int num = input.nextInt();
                numbers.add(num);
            }
        }
        System.out.println("Original numbers:");
        System.out.println(numbers);

        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
               total = total + numbers.get(i); 
            } else {
                total = total - numbers.get(i);
            }
        }
        System.out.println(total);
    }
}