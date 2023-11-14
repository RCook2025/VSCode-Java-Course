import java.util.Scanner;

public class CalAvgL11 {
    public static double average(double a, double b) {
        double val = (a + b)/2.0;
        return val;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in double form: ");
        double x = input.nextDouble();
        System.out.print("Enter a number in double form: ");
        double y = input.nextDouble();
        double avg = average(x, y);
        System.out.printf("x = %.2f, y = %.2f, avg = %.2f%n", x, y, avg);
    }
}
