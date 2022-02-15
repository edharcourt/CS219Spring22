import java.util.Random;

/*
 * Explore if-statements and case-statements from Chapter 5.
 */
public class Chap5Play {

    public static void main(String [] args) {

        // Simulate tossing a coin
        Random rng = new Random();
        rng.setSeed(0);

        int toss = rng.nextInt(2); // 0 or 1

        if (toss == 0) {
            System.out.println("Heads!");
        }
        else {
            System.out.println("Tails!");
        }

        // Roll a six sided die
        int d1 = rng.nextInt(6) + 1;

        if (d1 == 1) {
            System.out.println("one");
        }
        else if (d1 == 2) {
            System.out.println("two");
        }
        else if (d1 == 3) {
            System.out.println("three");
        }
        else if (d1 == 4) {
            System.out.println("four");
        }
        else if (d1 == 5) {
            System.out.println("five");
        }
        else {
            System.out.println("six");
        }

        System.out.println("=====================");
        d1 = 2;
        switch (d1) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            case 6 -> System.out.println("six");
        }  // switch

        d1 = rng.nextInt(6) + 1;
        int d2 = rng.nextInt(6) + 1;
        System.out.println("\uD83C\uDFB2 Snake Eyes ");

        if (d1 + d2 == 2) {
            System.out.println("\t\uD83C\uDFB2 Snake Eyes ");
        }

        if (d1 == 1 && d2 == 1) {
            System.out.println("\t\uD83C\uDFB2 Snake Eyes ");
        }

        if (d1 == 1) {
            if (d2 == 1) {
                System.out.println("\t\uD83C\uDFB2 Snake Eyes ");
            }
        }

        if (!(d1 != 1 || d2 != 1)) {
            System.out.println("Snake eyes");
        }

    }  // main
}
