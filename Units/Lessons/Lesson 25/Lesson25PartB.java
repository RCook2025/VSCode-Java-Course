import java.util.Scanner;

class CashRegister {
    private double totalPrice;
    private int itemCount;

    /*
     * Constructor.
     */
    public CashRegister() {
        totalPrice = 0;
        itemCount = 0;
    }

    /*
     * Add the price of an item to the register's total.
     */
    public void addItem(double price) {
        totalPrice = totalPrice + price;
        itemCount++;
    }

    /*
     * Return the current total sales amount.
     */
    public double getTotal() {
        // put implementation here.
        return totalPrice;
    }

    /*
     * Return the total count of items in the current sale.
     */
    public int getCount() {
        // put implementation here.
        return itemCount;
    }

    /*
     * Clear the register (total and count) for a new sale.
     */
    public void clear() {
        // put implementation here.
        itemCount = 0;
        totalPrice = 0;
    }
}

public class Lesson25PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        int count = 0;
        CashRegister cr = new CashRegister();
        boolean trueFalse = true;
        while (trueFalse == true) {
            System.out.print("Enter a price to add an item, 't' to show total price and count of items, 'c' to reset total price and count of items, or 'q' to quit and see final total and item count: ");
            String word = in.next();
            double balance = 0.0;
            String wordCopy = word;

            // try to turn the word into a double if not possible
            try {
                balance = Double.parseDouble(word);
            } catch (NumberFormatException e) {
                balance = 0.0;
            }

            if (balance >= 0.01) {
                cr.addItem(balance);
            } else if (wordCopy.toLowerCase().equals("t")) {
                int x = 0;
                price = cr.getTotal();
                count = cr.getCount();
                // need help with the following
                // System.out.println();
                System.out.printf("Your total price is $%7.2f, and your total count is %03d%n", price, count);
            } else if (wordCopy.toLowerCase().equals("c")) {
                cr.clear();
                System.out.println("The count and total price has been reset.");
            } else if (wordCopy.toLowerCase().equals("q")) {
                System.out.printf("Your final total price is $%7.2f, and your final total count is %03d%n", price,
                        count);
                System.out.println("Would you like to use cash or card.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}

                System.out.println("Error has occured!");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}

                System.out.println("Error code 404: Error Not Found!");
                System.out.println("Gooooooooooodddddbbbbbyyyyyyeeeeeeee............");
                trueFalse = false;
            }
        }

        double subjectNumber = 0.0;
        subjectNumber = Math.random() * 100;
        subjectNumber = (int)subjectNumber;

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}

        System.out.println("Thank you subject " + subjectNumber);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}

        System.out.println("Your service for the union is graciously appreciated!");
    }
}