package Util;

import java.util.Scanner;

/*
 Create a class named Util.Weather and fill in the two functions below.
 */
public class Weather {

    /**
     *
     * @param t - current temperature in F
     * @param v - current wind velocity in MPH
     * @return Windchill
     */
    public static double windchill(double t, double v) {
        return 35.74 + .6215*t + (.4275*t - 35.75) * Math.pow(v, .16);
    }

    public static double f2c(double f) {
        return 5/9.0*(f-32);
    }

    public static void main(String [] args) {
        /*
         * Test the f2c function by prompting user for input
         * calling the function, and printing the result rounded
         * to one decimal place.
         */
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter a temp in F: ");
        double temperature = kbd.nextDouble();
        double c = f2c(temperature);
        System.out.printf("%.1f in F is %.1f in C", temperature, c);

        // Read a wind velocity
        System.out.print("Enter wind velocity: ");
        double veloc = kbd.nextDouble();
        System.out.printf("Windchill is %.2f\n",
                windchill(temperature, veloc));
    }
}
