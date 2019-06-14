/**
	Write a Java program called Sum that prints the sum of ALL
	its command-line arguments.
*/
public class Sum {
	public static void main(String[] args) {
		double total = 0.0;
		for (int i = 0; i < args.length; i++) {
			double parsed = Double.parseDouble(args[i]);
			total += parsed;
		}
		System.out.printf("%.2f\n", total);
		// I hate long decimals!
	}
}