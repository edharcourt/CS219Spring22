public class Euler1 {
    /*
     *    https://projecteuler.net/problem=1
     *    n should be non-negative
     */
    public static int sum3or5(int n) {
        int sum = 0;

        for (int i = 3; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String [] args) {
        System.out.printf("sum3or5(1000) = %d\n", sum3or5(1000));
    }
}
