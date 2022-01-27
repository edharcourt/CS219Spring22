import java.util.Scanner;

public class Investment {

    /**
     *
     * @param c - initial investment
     * @param r - interest rate
     * @param t - years
     * @param n - compund per year
     * @return final value of investment
     */
     static double investment(int c, double r, int t, int n) {
        return c * Math.pow(1 + r/n, t*n);
    }

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Initial investment: ");
        int c = s.nextInt();
        System.out.print("interest rate: ");
        double r = s.nextDouble();
        System.out.print("year: ");
        int t = s.nextInt();
        System.out.print("compound: ");
        int n = s.nextInt();
        System.out.printf("Final value is %.2f\n",
                          investment(c,r,t,n));
    }
}
