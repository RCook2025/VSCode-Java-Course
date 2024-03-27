import java.util.Scanner;

import org.derryfield.toys.magic8ball.*;

public class Project3U9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Magic8Ball magic = new Magic8Ball();
        boolean trueFalse = true;

        int maxLimit = 21;
        while (trueFalse == true) {
            System.out.print("What is your question? ");
            String question = in.nextLine();
            System.out.print("Would you like to shake (s)? Or have it remain a mystery (q)? ");
            String response = in.nextLine();

            if (response.toLowerCase().equals("s")) {
                magic.shake(maxLimit);
                magic.setAns();
            } else if (response.toLowerCase().equals("q")) {
                trueFalse = false;
                break;
            }

            System.out.print("Would you like to know the answer to your question (l)? If not (q). ");
            String look = in.nextLine();

            if (look.toLowerCase().equals("l")) {
                String answer = magic.getAns();
                System.out.println(question);
                System.out.println(answer);
                trueFalse = true;
            } else if (look.toLowerCase().equals("q")) {
                trueFalse = false;
            }
        }
    }
}