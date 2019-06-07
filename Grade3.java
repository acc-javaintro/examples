public class Grade3 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Grade3 <A-F>");
			return;
		}
			
		switch (args[0]) {
			case "a":
			case "A": System.out.println("Great job! Ice cream party!"); break;
			case "b":
			case "B": System.out.println("Good job.");
			case "c":
			case "C": System.out.println("You can do better."); break;
			case "d":
			case "D": System.out.println("You're grounded!");
			case "f":
			case "F": System.out.println("Military school for you!"); break;
			default:
				System.out.println("Illegal input");
				System.out.println("Re-enter your letter grade");
		}
		
	}

}