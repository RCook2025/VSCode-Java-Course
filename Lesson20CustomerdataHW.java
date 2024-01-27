import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson20CustomerdataHW {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("customerdata.txt");
        Scanner in = new Scanner(inputFile);
        in.useDelimiter("[,\\s\\t\\n]+");

        File outputFile = new File("customerDataNew.txt");
        PrintWriter out = new PrintWriter(outputFile);

        out.println("-----------------------------------------");
        out.println("   ID  |      Name     |     Balance     ");
        out.println("-----------------------------------------");
        while (in.hasNext()) {
            int id = in.nextInt();
            String name = in.next();
            double balance = in.nextDouble();
            out.printf("%06d | %13s | $ %,13.02f%n", id, name, balance);
        }
        in.close();
        out.close();
    }
}
