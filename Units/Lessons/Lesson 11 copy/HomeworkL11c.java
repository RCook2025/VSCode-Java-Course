import java.util.Scanner;

public class HomeworkL11c {
    public static double spherecalc(double x) {
        final double PI = 3.14;
        double volume = (1.3333333 * PI) * Math.pow(x, 3);
        return volume;

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the radius of a sphere: ");
        double radius = input.nextDouble();

        double volume = spherecalc(radius);
        System.out.printf("%5.2f%n", volume);
    }
}
