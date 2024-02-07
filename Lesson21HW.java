import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson21HW {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("/Users/reaghancook-moore/Downloads/Top5Unemployment.txt");
        Scanner in = new Scanner(inputFile);

        // process file line by line
        // loop while there is still a next line in the file
        while (in.hasNextLine()) {
            String line = in.nextLine();

            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter("[,\\n]+");

            // get name
            String name = lineScanner.next().trim();

            // get gdp. remember to drop the commas.
            String nextWord = lineScanner.next().trim();
            nextWord = nextWord.replaceAll(",", "");
            double gdp = Double.valueOf(nextWord);
            
            // get rank
            nextWord = lineScanner.next().trim();
            int rank = Integer.valueOf(nextWord);

            // get region as String
            String region = lineScanner.next().trim();

            // display results
            System.out.printf("Ranked #%3d: %-16s | %,6.2f%% | %-20s%n", rank, name, gdp, region);
        }

        in.close();
    }
}