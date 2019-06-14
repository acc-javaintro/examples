/**
	Write a Java program called Count that prompts the user for
	a whole number and then counts from 1 up to and including
	that number.
*/

public class Count {

	public static void main(String[] args) {
		final String prompt = "Enter a whole number: ";
		final String maxTxt = System.console().readLine(prompt);
		
		final int max = Integer.parseInt(maxTxt);
		for (int n = 1; n <= max; n++)
			System.out.printf("%d ", n);
		
		System.out.println();
	}
	
}