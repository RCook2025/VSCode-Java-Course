import java.util.Scanner;

public class HomeworkL7b { 
        enum DayOfWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, Error}
        enum Person {Child, Adult, Senior}
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            //Declare Variables
            int age;
            double discount = 0.0;
            int dayVal;
            DayOfWeek today = DayOfWeek.Error;
            Person ageRange = Person.Adult;
            double subTotal;
            double total;
            boolean D = false;

            //Ask user for input of day of week and age and cost of the meal
            System.out.print("Enter the day of the week (0 = Sun, 1 = Mon, ..., 6 = Sat): ");
            dayVal = input.nextInt();
            System.out.print("Enter the age of the customer: ");
            age = input.nextInt();
            System.out.print("Enter the price of the meal: ");
            subTotal = input.nextInt();


            //Determine what day of the week it is using code
            if (dayVal == 0) {
                today = DayOfWeek.Sunday;
            } else if (dayVal == 1) {
                today = DayOfWeek.Monday;
            } else if (dayVal == 2) {
                today = DayOfWeek.Tuesday;
            } else if (dayVal == 3) {
                today = DayOfWeek.Wednesday;
            } else if (dayVal == 4) {
                today = DayOfWeek.Thursday;
            } else if (dayVal == 5) {
                today = DayOfWeek.Friday;
            } else if (dayVal == 6) {
                today = DayOfWeek.Saturday;
            }
            
            //display the day and a start barrier
            System.out.println();
            System.out.println("Today is " + today);

            //Determine age range of customer using code
            if (age < 13) {
                ageRange = Person.Child;
            } else if (age >= 50) {
                ageRange = Person.Senior;
            } else {
                ageRange = Person.Adult;
            }
            System.out.println("-------------");
            System.out.println("The customer is a " + ageRange);

            //Calculate the discount of the 
            if(today == DayOfWeek.Monday) {
                if(ageRange == Person.Child) {
                    discount = 0.075;
                } else {
                    if (ageRange == Person.Senior) {
                        discount = 0.15;
                    } else {
                        if (ageRange == Person.Adult) {
                        discount = 0.05;
                        }
                    }
                }
            }

            if(today == DayOfWeek.Tuesday || today == DayOfWeek.Wednesday || today == DayOfWeek.Thursday || today == DayOfWeek.Friday || today == DayOfWeek.Saturday || today == DayOfWeek.Sunday){
                if(ageRange == Person.Child) {
                    discount = 0.05;
                } else {
                    if (ageRange == Person.Senior) {
                        discount = 0.075;
                    } else {
                        if (ageRange == Person.Adult) {
                        discount = 0.0;
                        }
                    }
                }
            }
                //Calculate the total price of the meal including the discount
                total = subTotal * (1 - discount);

                //Display the total price and end barrier
                System.out.println("-------------");
                System.out.printf("The total price of the meal including any available discounts for today is: $%4.2f%n", total);
                System.out.println();
        
        }
    }
}