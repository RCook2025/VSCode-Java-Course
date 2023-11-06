import java.util.Scanner;

public class DebuggingHomeworkL10 {
    public static void main(String[] args) {
    // cookies are $0.99 apiece.
    final double COST_OF_COOKIE = 0.99;

    // prompt user for the number of cookies they are buying.
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of cookies: ");
    //changed int num = in.next; to int num = in.nextInt();    
    int num = in.nextInt();

    // calculate the cost before discount.
    double cost = num * COST_OF_COOKIE;

    // Use conditional statements to determine what discount is.
    //changed double discount; to double discount = 0.0;
    //flipped num > 6 and num > 24 statements
    double discount = 0.0;
    if (num > 24) {
        discount = 0.15;
    } else if (num > 12) {
        discount = 0.05;
    } else if (num > 6) {
        discount = 0.025;
    }

    // calculate and display values to user.
    cost = cost * (1 - discount);
    //added %n to $%.2f
    System.out.printf("For %d cookies, your total cost is $%.2f%n", num, cost);
    }
}
