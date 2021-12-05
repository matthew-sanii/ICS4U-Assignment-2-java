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

    public static String blowup(String str; Int amount) {
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

        }
}

