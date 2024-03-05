import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson19PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("scores.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("scoresFormatted.txt");
        PrintWriter out = new PrintWriter(outputFile);
        double total = 0;
        int count = 0;
        while (in.hasNext()) {
            double score = in.nextDouble();
            total = total + score;
            count++;
            out.printf("Quiz %03d: %6.2f%n", count, score);
        }
        out.println("----------------");
        out.printf("Average: %7.02f%n", total/count);
        in.close();
        out.close();
    }
}
