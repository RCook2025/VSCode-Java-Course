import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson21HWPartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("/Users/reaghancook-moore/Downloads/sales_by_cat.txt");
        Scanner in = new Scanner(inputFile);

        // process file line by line
        // loop while there is still a next line in the file
        while (in.hasNextLine()) {
            String line = in.nextLine();

            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\\n\\s\\t]+");

            // get name
            String cat = lineScanner.next().trim();

            String name = lineScanner.next().trim();
            double money = 0;
            // get gdp. remember to drop the commas.
            if (lineScanner.hasNextDouble()) {
                money = (lineScanner.nextDouble());
            }
            
            
            // get rank
            //nextWord = lineScanner.next().trim();
            // int rank = Integer.valueOf(nextWord);

            // display results
            System.out.printf(" %16s | %16s | %20.2f%n", cat, name, money);
        }

        in.close();
    }
}