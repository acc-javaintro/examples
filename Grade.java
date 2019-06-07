/**
	Write a Java program called Grade that accepts a letter grade (A-F) in
	upper- or lower-case at the command-line and then produces
	a parental declaration regarding the quality of the grade.
	Use a String to store the grade.
*/
public class Grade {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Grade <A-F>");
			return;
		}
		
		args[0] = args[0].toUpperCase();
		
		if (args[0].equals("A"))
			System.out.println("Great job! Ice cream party!");
		else if ("B".equals(args[0]))
			System.out.println("Good job.");
		else if (args[0].equals("C"))
			System.out.println("You can do better.");
		else if (args[0].equals("D"))
			System.out.println("You're grounded!");	
		else if (args[0].equals("F"))
			System.out.println("Military school for you!");
		else {
			System.out.println("Illegal input");
			System.out.println("Re-enter your letter grade");
		}
	}
}


	
	
		
	
	
	