public class Lesson26PartA {
    public static double getMathRandom() {
        double y = Math.random() * 100;
        return y;
    }

    public static double getMathPI() {
        double z = Math.PI;
        return z;
    }
    
    public static void main(String[] args) {
        System.out.println("Math.Random: " + getMathRandom());
        System.out.println("Math.PI: " + getMathPI());
    }
}
