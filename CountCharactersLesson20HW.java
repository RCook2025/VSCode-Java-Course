import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class CountCharactersLesson20HW {
    public static void main(String[] args) throws FileNotFoundException {
       File inputFile = new File("poem.txt");
       Scanner in = new Scanner(inputFile);
       in.useDelimiter("");
       int count = 0;
       int digitCount = 0;
       int charCount = 0;
       while (in.hasNext()) {
           char c = in.next().charAt(0);
           System.out.println(c);
           count++;
            if (Character.isDigit(c)) {
                digitCount = digitCount + 1;
            }
            if (Character.isLetter(c)) {
                charCount++;
            }
       }
       System.out.printf("Count = %d%n", count);
       System.out.printf("Letter Count = %d%n", charCount);
       System.out.printf("Digit Count = %d%n", digitCount);

   }

}
