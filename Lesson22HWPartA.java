import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson22HWPartA {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inKeyboard = new Scanner(System.in);
        boolean fileOpened = false;
        String name = "missing.txt";
        while (fileOpened == false) {
            try {
                // get file name
                System.out.print("Enter the name of the file: ");
                name = inKeyboard.next();
                if (name == "#") {
                    System.out.println("GoodBye");
                    fileOpened = true;
                } else {
                    File inputFile = new File(name);
                    Scanner in = new Scanner(inputFile);
                    while (in.hasNext()) {
                        String word = in.next();
                        System.out.println(word);
                    }
                    in.close();
                    fileOpened = true;
                }
            } catch (FileNotFoundException exception) {
                System.out.println("Error: unable to find the file named \"" + name + "\".");
            }
        }
    }
}