import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Block4ReadArrayListHW {
    public static void main(String[] args) throws FileNotFoundException {
        //create a file object for the name "temps.txt"
        File inputFile = new File("temps.txt");

        //open the file for reading
        Scanner in = new Scanner(inputFile);

        ArrayList<Integer> tempsArray = new ArrayList<Integer>();
        //loop through and "comsume" the contents of the file.
        while (in.hasNext()) {
            double score = in.nextDouble();
            tempsArray.add((int) score);
        }

        int lowest = 0;
        for (int i = 0; i < tempsArray.size(); i++) {
            if (lowest < tempsArray.get(i)) {
                lowest = tempsArray.get(i);
            } else {
                lowest = lowest;
            }
            
        }
        in.close();

        System.out.println(lowest);
        System.out.println("-----------");


        for (int i = 0; i < tempsArray.size(); i++) {
            if (tempsArray.get(i) == lowest) {
                System.out.println (tempsArray.get(i) + "   <=== Lowest");
            } else {
                System.out.println(tempsArray.get(i));
            }
        }
    }
}