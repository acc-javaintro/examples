/**
	Write a Java program called Calc that accepts three command-line
	arguments and produces as output the specified operation on the
	specified operands. By way of example:

	C:\Users\javauser\Deskto> java Calc 5 - 2
	5 - 2 = 3
	C:\Users\javauser\Desktop> java Calc 21 / 3
	21 / 3 = 7
	C:\Users\javauser\Desktop java Calc 3 + 5
	-3 + 5 = 2
*/
public class Calc {

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calc <num> <+|-|x|/> <num>");
			System.out.println(args[1]);
			return;
		}
		double op1 = Double.parseDouble(args[0]);
		double op2 = Double.parseDouble(args[2]);
		
		double result;
		switch (args[1]) {
			case "+" : result = op1 + op2; break;
			case "-" : result = op1 - op2; break;
			case "/" : result = op1 / op2; break;
			case "x": case "X": case "*": result = op1 * op2; break;
			default:
				System.out.println("Unknown operation: " + args[1]);
				return;
		}
		System.out.printf("%s %s %s = %s\n", op1, args[1], op2, result);
	}
	
}






