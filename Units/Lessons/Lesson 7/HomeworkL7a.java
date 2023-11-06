import java.util.Scanner;

public class HomeworkL7a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare Variables
        int age;
        double discount = 0.0;
        enum DayOfWeekLD {Wednesday, Thursday, Friday, Saturday, Sunday}
        enum DayOfWeekHD {Monday}
        int dayVal;
        double subTotal;
        double total;

        //Ask user for input of day of week and age and cost of the meal
        System.out.print("Enter the day of the week (0 = Sun, 1 = Mon, ..., 6 = Sat): ");
        dayVal = input.nextInt();
        System.out.print("Enter the age of the customer: ");
        age = input.nextInt();
        System.out.print("Enter the price of the meal: ");
        subTotal = input.nextInt();

        
        //Calculate the discount of the 
        if(dayVal == 1) {
            if(age < 13){
                discount = 0.075;
            } else {
                if (age >= 50){
                    discount = 0.15;
                } else {
                    discount = 0.05;
                }
            }
        }

        if(dayVal >= 3){
            if(age < 13) {
                discount = 0.05;
            } else {
                if (age >= 50){
                    discount = 0.075;
                } else {
                    discount = 0.0;
                }
            }
        }

        if(dayVal == 0){
            if(age < 13) {
                discount = 0.05;
            } else {
                if (age >= 50){
                    discount = 0.075;
                } else {
                    discount = 0.0;
                }
            }
        }
        
            //Calculate the total price of the meal including the discount
            total = subTotal * (1 - discount);

            //Display the total price
            System.out.printf("The total price of the meal including any available discounts for today is: $%4.2f%n", total);
    }
}