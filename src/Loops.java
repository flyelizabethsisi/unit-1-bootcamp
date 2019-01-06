
public class Loops {

    public static void main(String args[]) {
        oneToTen();
        oneToTen2();
        oneToN(15);
        twoToN(20);
        sumOneToTen();
        sumOneToN(3);
        sumOneToTenThousand();
        printMethod(3, "Hello, Pursuit");
        printMethod(-1, "hi");
        printMethod2(5, "chair");
        fibonacciTen();
        fibonacciTenSum();
        fibonacciNSum(8);
    }

    public static void oneToTen() {
        int count = 1;
        while (count > 10) {
            count = count + 1;
            System.out.println(count);
        }
    }

    public static void oneToTen2() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void oneToN(int n) {

        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void twoToN(int n) {
        if (n % 2 == 0) {
            for (int i = 1; i < n; i++) {
                System.out.println(i);

            }

        }

    }

    public static int sumOneToTen() {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = i + i;
        }
        System.out.println(sum);

        return sum;

    }


    public static int sumOneToN(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = i + i;
        }
        System.out.println(sum);

        return sum;

    }

    public static int sumOneToTenThousand() {

        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum = i + i;
        }
        System.out.println(sum);

        return sum;

    }

    public static void printMethod(int n, String s) {
        if (n < 0) {
            System.out.println("Put positive number");
        } else {
            for (int i = 0; i < n; i++)
                System.out.println(s);
        }

    }

    public static void printMethod2(int n, String s) {
        String newString = s;
        if (n < 0) {
            System.out.println("Put positive number");
        } else {
            for (int i = 0; i < n; i++) {
                newString = newString + newString;
            }
            System.out.println(newString);
        }

    }

    public static void fibonacciTen() {
        int number = 8;
        int first = 0;
        int second = 1;
        System.out.println(first + "\n" + second);

        for (int i = 1; i <= number; i++) {
            int sum = first + second;
            first = second;
            second = sum;

            System.out.println(sum);
        }
    }

    public static void fibonacciTenSum() {
        int number = 8;
        int first = 0;
        int second = 1;
        int total = 8;

        for (int i = 1; i <= number; i++) {
            int sum = first + second;
            first = second;
            second = sum;
            total = sum + total;
        }
        System.out.println(total);
    }

    public static void fibonacciNSum(int n) {
        int number = n;
        int first = 0;
        int second = 1;
        int total = n;

        for (int i = 1; i <= number; i++) {
            int sum = first + second;
            first = second;
            second = sum;
            total = sum + total;
        }
        System.out.println(total);

    }
}

//        ## Exercises++
//
//        #### 1. `sumNumbers`
//
//        Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//
//        ```
//sumNumbers("abc123xyz") → 123
//sumNumbers("aa11b33") → 44
//sumNumbers("7 11") → 18
//```
//
//        #### 2. Is Not
//
//        Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)
//
//        ```
//notReplace("is test") → "is not test"
//notReplace("is-is") → "is not-is not"
//notReplace("This is right") → "This is not right"
//```
//
//        #### 3. Between Words
//
//        Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
//
//        ```
//wordEnds("abcXY123XYijk", "XY") → "c13i"
//wordEnds("XY123XY", "XY") → "13"
//wordEnds("XY1XY", "XY") → "11"
//```
//
//        #### 4. Number Puzzle
//
//        Use nested for loops to generate a list of all the pairs of positive two digit numbers whose sum is 60, and whose difference is 14.
//
//        #### 5. Digits
//
//        Use nested for loops to generate a list of all the positive two digit numbers. Display the numbers, and the sums of their digits.
//
//        ```
//10, 1+0 = 1
//11, 1+1 = 2
//12, 1+2 = 3
//13, 1+3 = 4
//14, 1+4 = 5
//15, 1+5 = 6
//16, 1+6 = 7
//17, 1+7 = 8
//18, 1+8 = 9
//19, 1+9 = 10
//20, 2+0 = 2
//21, 2+1 = 3
//22, 2+2 = 4
//
//// (etc.)
//
//97, 9+7 = 16
//98, 9+8 = 17
//99, 9+9 = 18
