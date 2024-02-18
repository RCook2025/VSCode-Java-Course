import java.util.Scanner;

public class Lesson24HWPartA {
    public static void main(String[] args) {
        // Declare and initialize a scanner object to use the get input from the user
        Scanner in = new Scanner(System.in);


        // Ask user for input using the scanner
        // Ask user for their name
        System.out.print("Enter your name: ");
        String name = in.nextLine();


        // Ask user for input using the scanner
        // Ask user for their age
        System.out.print("Enter your age: ");
        int age = in.nextInt();


        // Print out the name and age of the user
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");
    }
}
