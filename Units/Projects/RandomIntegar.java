import java.util.Arrays;

public class RandomIntegar {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            double r = numbers.length * Math.random();
            int v = (int) r;
            v = v + 1;
            numbers[i] = v;
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));

        // printing every element at an even index
        System.out.println("Elements at Even Indexs");
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Elements that are of even value");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i]);
                if (i < numbers.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();

        System.out.println("All Elements in reverse");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print(numbers[0] + ", ");
        System.out.println(numbers[9]);
    }
}