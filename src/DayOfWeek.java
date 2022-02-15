import java.util.Scanner;

public class DayOfWeek {

    /**
     * @param m - month
     * @param d - day
     * @param y - year
     * @return - day of week
     */

    // day of week function
    public static int dayofweek(int m, int d, int y){
        int y0 =  y - (14 - m)/12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31*m0 / 12) % 7;
    }

    /*
     * read a valid month number from the user.
     */
    public static int getValidMonth(Scanner s) {

        while (true) {
            System.out.print("Enter month (1 - 12): ");
            if (s.hasNextInt()) {
                int m = s.nextInt();
                if (1 <= m && m <= 12) {
                    return m;
                } else {
                    System.err.printf("Error: you entered \"%d\"\n", m);
                }
            } else {
                String str = s.next();
                System.err.printf("Error: you entered \"%s\"\n", str);
            }
        }  // while
    }

    public static void main (String [] args){
        // get input:
        Scanner s = new Scanner(System.in);
        int m = getValidMonth(s);

        System.out.print("Enter a day: ");
        int d = s.nextInt();

        System.out.print("Enter a year: ");
        int y = s.nextInt();

        System.out.print("The day of the week is " + dayofweek(m, d, y));

    }
}
