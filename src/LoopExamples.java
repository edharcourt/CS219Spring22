public class LoopExamples {

    // count the number of 7s in x
    public static int count7s(int x) {
        int count = 0;

        if (x < 0) {
            x = -x;
        }
        while (x > 0){
            if (x % 10 == 7) {
                count++;
            }
            x = x / 10;
        }

        return count;
    }

    /*
     * Compute the checksum of an integer
     */
    public static int checksum(int n) {
        int sum = 0;

        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum % 10;
    }

    /*
     * Draw a triangle of asterisks. n is the number of rows
     * and the last row should have n asterisks.
     */
    public static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            // print i asterisks
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        System.out.printf("Number of 7s in 97127787 is %d\n", count7s(97127787));
        System.out.printf("Number of 7s in 91839282 is %d\n", count7s(91839282));
        System.out.printf("Number of 7s in -97127787 is %d\n", count7s(-97127787));
        System.out.printf("Number of 7s in 7777777 is %d\n", count7s(7777777));
        System.out.printf("checksum(4293) is %d\n", checksum(4293));
        triangle(10);
    }

}
