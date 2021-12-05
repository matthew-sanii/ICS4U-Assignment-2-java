/*
* The reverse program.
*
* @author Matthew Sanii
* @version 1.0
* @since 2021-29-11
*
*/

import java.util.Scanner;

/**
* This is the reverse program.
*/

final class Blowup {

    /**
    * The number of times the first value is copied
    */
    private static final int copyTimes = 0;

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

    public static String blowup(String str, int amount) {
        final String result;
        final int times;
        if (str.isEmpty()) {
            result = "";
        }
        else {
            for (int copy = 0; copy != amount; copy++) {
                result += str(0);
            }
            try {
                times = Integer.valueOf(str(0));
            }
            catch (NumberFormatException errorCode) {
                times = 0;
            }
            result = blowup(str.substring(1), times);
        }
        return result;
    }

    public static void main(final String[] args) {
        final Scanner userInput = new Scanner(System.in);
        System.out.print("input the string you want to 'blowup': ");
        final String input = userInput.nextLine();
        final String answer = blowup(input, copyTimes);
        System.out.println("The blownup string is: " + answer);
}
}
