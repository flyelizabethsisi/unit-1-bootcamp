import java.lang.Math;
import java.util.Random;


public class Methods {

    public static void main(String args[]) {
        calculateSquare(3);
        calculateSquareRoot(16);
        toLowerCase("Hello, World!");
        isMultiple(5, 100);
        prettyInteger(4);
        random(1, 150);
    }

    public static int calculateSquare(int n) {
        int result = 0;
        result = n * n;
        System.out.println(result);
        return result;
    }

    public static double calculateSquareRoot(int n) {
        double result = 0;
        result = Math.sqrt(n);
        System.out.println(result);
        return result;
    }

    public static String toLowerCase(String greeting) {

        System.out.println(greeting.toLowerCase());

        return greeting.toLowerCase();
    }


    public static boolean isMultiple(int x, int y) {
        if (y % x == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public static void prettyInteger(int x) {
        String y = "*";
        for (int i = 0; i < x; i++) {
            System.out.print(y);
            System.out.print(x);
            for (int a = 0; a < x; a++) {
                System.out.print(y);
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(y);
        }
    }

    public static int random(int x, int y) {
        int max = y;
        int min = x;
        System.out.println(" ");
        Random rand = new Random();
        int value = rand.nextInt((max - min) + 1);
        System.out.println(value);
        return value;

    }

}