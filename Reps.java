/**
	Write a Java program called Reps that prints all of its
	command line arguments in reverse order, one per line.
	Example:
	
	C:\Users\javauser\Desktop> java Reps Java totally rules my world
	world
	my
	rules
	totally
	Java
*/

public class Reps {

	public static void main(String[] args) {
		for (int i = args.length - 1; i >= 0; i--) {
			System.out.println(args[i]);
		}
	}
	
}










