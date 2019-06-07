/**
	Write a Java program called Addit that takes two integer
	command-line arguments and adds them together to
	display the integer sum.
*/
public class Addit {
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java Addit <integer> <integer>");
			return;
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum = num1 + num2;
		System.out.printf("The sum of %d and %d is %d\n", num1, num2, sum);

	}

}