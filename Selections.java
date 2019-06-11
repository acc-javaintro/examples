public class Selections {
	public static void main(String[] args) {
		//if without else
		if (args.length > 0)
			System.out.printf("There were %d command-line arguments.\n", args.length);
		
		// if with else
		if (args.length > 2)
			System.out.println("There were at least 2 arguments.");
		else
			System.out.println("There were fewer than 2 arguments.");
			
		// if with an else whose body is an if
		if (args.length > 3)
			System.out.println("There were at least 3 arguments.");
		else if (args.length > 2)
			System.out.println("There were exactly 3 arguments.");
		else if (args.length > 1)
			System.out.println("There was exactly 1 argument.");
			
		// full if/else if/else
		char grade = 'B';
		if (grade == 'A' ||| grade == 'a')
			System.out.println("Great job. You're gonna earn an OCA certification.");
		else if (grade == 'B' || grade == 'b')
			System.out.println("Nice, but keep studying for that OCA.");
		else if (grade == 'C' || grade == 'c')
			System.out.println("You know you can do better.");
		else if (grade == 'D' || grade == 'd')
			System.out.println("Go to your room and ponder what you've done.");
		else
			System.out.println("You're grounded for a month!");
		// the last else assumes the only other possible grade is F or f
		
		// converting that last example to a switch
		switch (grade) {
			case 'A':
			case 'a': System.out.println("Great job!"); break;
			case 'B':
			case 'b': System.out.println("Nice, but try harder."); break;
			case 'C':
			case 'c': System.out.println("You know you can do better."); break;
			case 'D':
			case 'd':
				System.out.println("Go to your room!"); break;
			default:
				System.out.println("You're grounded!");
		}
		
		// using the ternary operator
		int number;
		if (args.length > 1)
			number = 8;
		else
			number = -args.length;
			
		number = (args.length > 1) ? 8 : -args.length;
	}
}	