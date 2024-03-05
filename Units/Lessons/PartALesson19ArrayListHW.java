import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PartALesson19ArrayListHW {
    public static void main(String[] args) throws FileNotFoundException {
        //create a file object for the name "temps.txt"
        File inputFile = new File("temps.txt");

        //open the file for reading
        Scanner in = new Scanner(inputFile);

        ArrayList<Integer> temps = new ArrayList<Integer>();
        //loop through and "comsume" the contents of the file.
        while (in.hasNext()) {
            int score = in.nextInt();
            temps.add(score);
        }

        int lowest = 0;
        for (int i = 0; i < temps.size(); i++) {
            if (i == 0) {
                lowest = temps.get(i);
            } else {
                if (temps.get(i) < lowest) {
                    lowest = temps.get(i);
                }
            }
            
        }
        in.close();

        System.out.println(lowest);
        System.out.println("-----------");


        for (int i = 0; i < temps.size(); i++) {
            if (temps.get(i) == lowest) {
                System.out.println (temps.get(i) + "   <=== Lowest");
            } else {
                System.out.println(temps.get(i));
            }
        }
    }
}