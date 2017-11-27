package session7assignments; //Package declaration

import java.util.Scanner; //imports Scanner file from java.util package

/**
 * This class converts an integer variable to String using an inbuilt function
 * of String class.
 */
public class ConvertIntToString {
	public static void main(String[] args) // This is the main method
	{
		Scanner readNumber = new Scanner(System.in); // Scanner object readNumber to take inputs
		System.out.println(
				"Enter the integer number to be converted to string");/* Prompts the user to enter an integer number */
		int number = readNumber.nextInt(); // Saves the input

		readNumber.close(); // Close Scanner object readNumber

		String convert_int_to_string = String.valueOf(number); // Converts integer value to String value
		System.out.println("The converted value of integer " + number + " to string is " + convert_int_to_string);
		System.out.println(); // Next line
		System.out.println("Confirmation of the above conversion using + operator"); /*
																						 * To confirm that above
																						 * conversion has taken place
																						 */
		System.out.println(number + 1 + " - because + is a binary operator here"); // number is an integer hence added
		System.out.println(convert_int_to_string + 1 + " - because + is string concatenation operator");
		/* convert_int_to_string is string so concatenated */
	} // main method closed
} // Class closed
