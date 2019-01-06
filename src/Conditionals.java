
public class Conditionals {
    private static final int SUN = 0;
    private static final int MON = 1;
    private static final int TUE = 2;
    private static final int WED = 3;
    private static final int THU = 4;
    private static final int FRI = 5;
    private static final int SAT = 6;

    public static final int NO_MATCH = 0;
    public static final int THREE_MATCH = 20;
    public static final int TWO_MATCH = 10;

    public static void main(String args[]) {

        Person peter = new Person();
        peter.setCity("London");
        peter.setName("Peter");
        caughtSpeeding(60, false);
        caughtSpeeding2(70,true);
        caughtSpeeding3(80,false);
        System.out.println(weekMethod(6, true));
        System.out.println(lotteryTicket(1, 2, 2));
        System.out.println(blackJack(21, 19));
        evenlySpaced(5, 6, 7);
        isOdd(3);
        isMultipleOfThree(9);
        isOddAndIsMultipleOfThree2(14);
        fizzMultipleofThree(99);
        londonMethod(peter);
        printName(peter);
        cigarParty(5, false);
    }

    public static boolean isOdd(int n) {
        if (n % 2 == 0) {
            return false;
        }
        return true;

    }


    public static boolean isMultipleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isOddAndIsMultipleOfThree2(int n) {
        if (n % 2 == 1 && n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void fizzMultipleofThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    public static boolean londonMethod(Person person1) {
        if (person1.getCity().equals("London")) {
            return true;
        } else {
            return false;
        }
    }

    public static void printName(Person person1) {
        if (person1.getName().length() > 5) {
            System.out.println(person1.getName());
        } else {
            System.out.println("Name is too short.");
        }
    }

    public static boolean cigarParty(int cigars, boolean weekend) {
        if (weekend) {
            return cigars >= 40;
        }

        return cigars >= 40 && cigars <= 60;
    }


    public static int caughtSpeeding(int speed, boolean birthday) {
        int val = 0;

        if (birthday) {
            if (speed <= 65) {
                return 0;
            }
            if (speed <= 85) {
                return 1;
            }

            return 2;

        } else {
            if (speed <= 60) {
                return 0;
            }
            if (speed <= 80) {
                return 1;
            }

            return 2;
        }

    }

    public static int caughtSpeeding2(int speed, boolean birthday) {
        int lowTicketLimit;
        int highTicketLimit;

        if (birthday) {
            lowTicketLimit = 65;
            highTicketLimit = 85;
        } else {
            lowTicketLimit = 60;
            highTicketLimit = 80;
        }

        if (speed <= lowTicketLimit) {
            return 0;
        }
        if (speed <= highTicketLimit) {
            return 1;
        }

        return 2;
    }

    private static final int GET_NO_TICKET = 0;
    private static final int GET_LOW_TICKET = 1;
    private static final int GET_HIGH_TICKET = 2;

    public static int caughtSpeeding3(int speed, boolean birthday) {
        int lowTicketLimit = 60;
        int highTicketLimit = 80;
        int birthdayLenience = 5;

        if (birthday) {
            lowTicketLimit = lowTicketLimit + birthdayLenience;
            highTicketLimit = highTicketLimit + birthdayLenience;
        }

        if (speed <= lowTicketLimit) {
            return GET_NO_TICKET;
        }
        if (speed <= highTicketLimit) {
            return GET_LOW_TICKET;
        }

        return GET_HIGH_TICKET;
    }


    public static String weekMethod(int week, boolean vacation) {
        String weekAlarm = "7:00";
        String weekendAlarm = "10:00";

        if (vacation) {
            weekAlarm = "10:00";
            weekendAlarm = "off";

        }
        if (week > 0 && week < 6) {
            return weekAlarm;
        }

        return weekendAlarm;
    }


    public static int lotteryTicket(int a, int b, int c) {

        if (a == b && b == c) {
            return THREE_MATCH;
        }
        if (a == b || a == c || b == c) {
            return TWO_MATCH;
        }

        return NO_MATCH;

    }


    public static int blackJack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (21 - a < 21 - b) {
            return a;
        } else return b;
    }


    public static boolean evenlySpaced(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);
        if ((ab == bc && ac == ab + bc) ||
                (ab == ac && bc == ab + ac) ||
                (bc == ac && ab == ac + bc)) {
            return true;
        }

        return false;
    }
}

