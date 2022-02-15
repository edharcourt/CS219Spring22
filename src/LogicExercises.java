public class LogicExercises {
    /*
        You are driving a little too fast, and a police officer stops you.
        Fill in function below to compute the result, encoded as an int
        value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is
        60 or less, the result is 0. If speed is between 61 and 80 inclusive,
        the result is 1. If speed is 81 or more, the result is 2.
        Unless it is your birthday -- on that day, your speed can be
        5 higher in all cases.

        caughtSpeeding(60, false) → 0
        caughtSpeeding(65, false) → 1
        caughtSpeeding(65, true)  → 0
    */

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int delta = 0;
        if (isBirthday) {
            delta = 5;
        }

        if (speed <= 60 + delta) {
            return 0;
        }
        else if (speed <= 80 + delta) {
            return 1;
        }
        else {
            return 2;
        }
    }

    /*
     * Return true if d1, d2, d3 are in either ascending or descending order.
     */
    public static boolean ordered(int d1, int d2, int d3) {
        return (d1 < d2 && d2 < d3) || (d1 > d2 && d2 > d3);
    }

    public static void main(String [] args) {
        System.out.printf("caughtSpeeding(60, false): %d\n",
                caughtSpeeding(60, false));
        System.out.printf("caughtSpeeding(65, false): %d\n",
                caughtSpeeding(65, false));
        System.out.printf("caughtSpeeding(81, false): %d\n",
                caughtSpeeding(81, false));
        System.out.printf("ordered(1, 2, 3) %b\n", ordered(1, 2, 3));
        System.out.printf("ordered(3, 2, 1) %b\n", ordered(3, 2, 1));
        System.out.printf("ordered(9, 1, 7) %b\n", ordered(9, 1, 7));
    }
}
