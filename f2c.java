import java.util.Scanner;

public class f2c {

    public static void main (String [] args) {
        // c = 5/9*(f - 32)

        Scanner s = new Scanner(System.in);
        double c;

        System.out.println("Enter a temp in fahrenheit:");
        double f = s.nextDouble();
        c = 5/9.0*(f - 32);

        // formatted print uses format string
        System.out.printf("%.2f fahrenheit is \n", f);
        System.out.printf("%.2f celsius", c);
    }
}