/**
	Write a Java program called Grade2 that accepts a letter grade (A-F) in
	upper- or lower-case at the command-line and then produces
	a parental declaration regarding the quality of the grade.
	Use a primitive char to store the grade.
*/
public class Grade2 {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Grade <A-F>");
			return;
		}
		
		char grade = args[0].toUpperCase().charAt(0);
	
		if (grade == 'A')
			System.out.println("Great job! Ice cream party!");
		else if (grade == 'B')
			System.out.println("Good job.");
		else if (grade == 'C')
			System.out.println("You can do better.");
		else if (grade == 'D')
			System.out.println("You're grounded!");	
		else if (grade == 'F')
			System.out.println("Military school for you!");
		else {
			System.out.println("Illegal input");
			System.out.println("Re-enter your letter grade");
		}
	}
}


	
	
		
	
	
	