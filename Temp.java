/**
	Write a Java program called Temp that accepts two command-line
	arguments. The first is a temperature in real-number form. The
	second is a scale, either F for Fahrenheit or C for Celsius.
	The program's output should display the user's temperature converted
	from the specified scale to the other. Here are two runs of my program
	as an example:

	java Temp 98.6 F
 
	98.6 F is 37.0 C
 
	C:\Users\javauser\Desktop> java Temp 37.0 c
	
	37.0 C is 98.6 F
*/
public class Temp {
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java Temp <number> <F|C>");
			return;
		}
		final double temp = Double.parseDouble(args[0]);
		final char scale = args[1].toUpperCase().charAt(0);
		
		final String format = "%.1f %c is %.1f %c", output;
		if (scale == 'F') { // display output in Celsius
			double cels = (temp - 32.0) * (5.0 / 9.0);
			output = String.format(format, temp, scale, cels, 'C');
		}
		else if (scale == 'C') { // display output in Fahrenheit
			double fahr = 1.8 * temp + 32.0;
			output = String.format(format, temp, scale, fahr, 'F');
		}			
		else 
			output = "Scale can be F or C only. You typed " + args[1];
		
		System.out.println(output);		

	}
	
}
