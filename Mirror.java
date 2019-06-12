/**
	Write a Java program called Mirror that prints the text of each of
	its command line arguments in all-lowercase and reverse.
	
	C:\Users\javauser\Desktop>java Mirror Java Rocks
	avaj skcor
*/
public class Mirror {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			String lower = args[i].toLowerCase();
			for (int j = lower.length() - 1; j >= 0; j--) {
				System.out.print(lower.charAt(j));
			}
			System.out.print(' ');
		}
		
		// foreach only works forward through the collection
		for (String arg : args) {
			String lower = arg.toLowerCase();
			for (char c : lower.toCharArray())
				System.out.println(c);
		}
		
	}
	
}



	
	