
public class Variables {

    public static void main(String args[]) {
        int roomNum = 113;
        double eNum = 2.71828;
        String subject = "computer Science";

        System.out.println("This is room # " + roomNum);
        System.out.println("e is close to " + eNum);
        System.out.println("I am learning a bit about " + subject);

        isOdd(3);
        printHelloWorld("Hello World");
        greatestCommonFactor(16,8);
    }

    public static boolean isOdd(int x) {

        if (x % 2 != 0) {
            System.out.println(true);
            return true;
        }
        return false;
    }

    public static String printHelloWorld(String x) {
        String y = x;
        System.out.println(y);

        return y;
    }

    public static int greatestCommonFactor(int x, int y) {
        while (x != 0 && y != 0) {
            int z = y;
            y = x % y;
            x = z;
        }
        System.out.println(x+y);
        return x + y;
    }
}

