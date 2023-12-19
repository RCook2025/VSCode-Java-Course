import java.util.Scanner;

public class ClassworkL11 {
    public static int max(int a, int b ) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int x = 10;
        //int y = 5;
        //int val = max(x, y);
        //System.out.println(val);
    

        System.out.println("Enter two numbers: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double val = average(x, y);
        System.out.println(val);
    }

    public static double average(double a, double b) {
        double val = (a + b)/2.0;
        return val;
    }
}