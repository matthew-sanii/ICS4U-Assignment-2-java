/*
* The Blowup program, that turns a string into a new string
* Using the int placements to make the next string character
* appear multiple times.
*
* @author Matthew Sanii
* @version 1.0
* @since 2021-12-05
*
*/

import java.util.Scanner;

/**
* This is the blowup program.
*/

final class Blowup {

    /**
    * The number of times the first value is copied.
    */
    private static final int COPYTIMES = 0;

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Blowup() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Expands and alters the string given based on int placements.
    *
    * @param str the user's string input.
    * @param amount the number of times a specific character will appear.
    * @return the blownup string.
    */
    public static String blowup(String str, int amount) {
        String result = "";
        String results = "";
        int copies = amount;
        int multiplied;
        if (str.isEmpty()) {
            result = "";
        }
        else {
            final char spot = str.charAt(0);
            while (copies != 0) {
                results += spot;
                copies -= 1;
            }
            try {
                multiplied = Character.getNumericValue(spot);
            }
            catch (NumberFormatException errorCode) {
                multiplied = 0;
            }
            result = results + blowup(str.substring(1), multiplied);
        }
        return result;
    }

    /**
    * The starting main() function.
    *
    * @param args Name of file containing a string of numbers
    */
    public static void main(final String[] args) {
        final Scanner userInput = new Scanner(System.in);
        System.out.print("input the string you want to 'blowup': ");
        final String input = userInput.nextLine();
        if ("".equals(input)) {
            System.out.println("Error, requires input.");
            System.exit(0);
        }
        final String answer = blowup(input, COPYTIMES);
        System.out.println("The blownup string is: " + answer);
    }
}
