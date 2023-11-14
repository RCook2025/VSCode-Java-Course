public class HomeworkL11a {
    public static void main(String[] args) {
        double len = 2;
        double result = cubeVolume(len);
        System.out.println(result);
        len = 10;
        result = cubeVolume(len);
        System.out.println(result);

        double result2 = mystery(3, 2);
        System.out.println(result2);

}

public static double cubeVolume(double sideLength) {   
   double volume = sideLength * sideLength * sideLength;
   return volume;
    }

public static double mystery(double x, double y) {
   double result = (x + y) / (y - x);
   return result;
}

}
