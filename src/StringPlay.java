public class StringPlay {

    // Exercise 6.4
    public static boolean isAbecedarian(String s) {
        s = s.strip(); // removes leading and trailing spaces
        int i = 0;

        while (i < s.length() - 1) {
            if (s.charAt(i) < s.charAt(i + 1)) {
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args) {

        // Simple string operations
        String s ="Hello World";
        char ch = s.charAt(0);
        char last = s.charAt(s.length() - 1);

        // Test the isAbecedarian function
        System.out.printf("isAbcedarian(\",biopsy\"): %b\n",
                           isAbecedarian("     biopsy     "));

        System.out.printf("isAbcedarian(\"apple\"): %b\n",
                isAbecedarian("apple"));

        // convert a character to an integer by "casting" it to an int.
        System.out.println((int) 'z');

    }

}
