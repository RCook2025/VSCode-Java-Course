import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson22HWPartB {
    public static void main(String[] args) {
        try {
            File inputFile = new File("/Users/reaghancook-moore/Downloads/birthyears.txt");
            Scanner in = new Scanner(inputFile);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter("[,\\n\\t]+");
                String name = lineScanner.next();
                String word = lineScanner.next();
                int year;
                try {
                    year = Integer.parseInt(word);
                    System.out.println(name + " was born in " + year + ".");
                } catch (NumberFormatException e) {
                    System.out.println("I dont know what year " + name + " was born in.");
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("You stink, file not found");
            System.err.println(e.getMessage());
            System.err.println("Goodbye!");
            return;
        }

    }
}
