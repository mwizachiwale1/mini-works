// @description: This program takes a digit and splits it into its individual component digits.
// @author: Mwiza Chiwale
// @last modified: 28/05/2022 at 08:00

import java.util.Scanner;

class DigitSeparator {
	public static void main(String[] argv){
		Scanner input = new Scanner(System.in);

		int digit, // digit to be separated
		    digitCount, // number of digits in the digit
		    individualDigit, // Each individual digit within the digit
		    baseValue; // tracks the base which the program is on e.g base 10 base 100 etc

		System.out.print("Enter digit to be seprated: "); // prompt
		digit = input.nextInt();
		System.out.print("Enter the number of digits: "); // prompt
		digitCount = input.nextInt();

		while (digitCount > 0) {
			baseValue = 1;
			for(int i = 1; i <= digitCount - 1; i++){
				baseValue *= 10;
			} // end for
			
			individualDigit = digit / baseValue;
			digitCount -= 1;
			digit = digit % baseValue;
			
			System.out.print(individualDigit + " "); // Print out the individual digit
			
		} // end while

	} // end main

} //end DigitSeparator