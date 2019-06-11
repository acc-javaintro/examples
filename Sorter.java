/**
	Write a Java program called sorter that prompts the user for a number
	and then displays the following output:
		NEGATIVE! when the number is less than zero
		POSITIVE! when the number is greater than zero
		ZERO! when the number is equal to zero
*/

public class Sorter {
	
	public static void main(String[] args) {

		final String prompt = "Enter a number: ";
		final String input = System.console().readLine(prompt);
		final double theNumber = Double.parseDouble(input);

		if (theNumber < 0.0) System.out.println("NEGATIVE!");
		else if (theNumber > 0.0) System.out.println("POSITIVE!");
		else System.out.println("ZERO!");

	}

}
