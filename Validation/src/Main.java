/*
Author: Dimitris Apostolakis
Description: Reading a valid integer input from the user.
*/

import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner input = new Scanner( System.in );

        int a = Validation.validateIntInput( input, "Give an integer number: " );
        System.out.println("Input was valid! The number is: " + a);
    }
}
