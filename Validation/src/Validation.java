import java.util.Scanner;

public class Validation {

    //Validating an integer input without needing to clear the buffer.
    public static int validateIntInput( Scanner input, String text ) {
        System.out.print( text );
        int number;

        while ( true ) {
            try {
                number = Integer.parseInt( input.nextLine() );
                break;
            } catch ( NumberFormatException e ) {
                System.out.print( "Please provide an integer number: " );
            }
        }
        return number; //returning the final number.
    }

}
