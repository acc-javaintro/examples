// command-line arguments
// System.console().readLine()
// Scanner
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		double stuff = in.nextDouble();
		System.out.println("Your number + 3 is : " + (number + 3));
		System.out.println(stuff);
	}
	
}