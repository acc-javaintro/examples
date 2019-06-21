/**
	"When you find yourself on the side of the majority, it is
	time to pause and reflect."
		-- Mark Twain
		
	Write a Java program called Vowels that displays the count of
	each a, e, i, o and u in this quote. Ignore y. Problematic y.
*/
public class Vowels {
	public static void main(String[] args) {
		String quote = ("When you find yourself on the side of "
			+ "the majority, it is time to pause and reflect.")
			.toLowerCase();
			
		// VERSION 1 - just the vowels, no arrays
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int n = 0; n < quote.length(); n++) {
			char theChar = quote.charAt(n);
			if (theChar == 'a') a++;
			else if (theChar == 'e') e++;
			else if (theChar == 'i') i++;
			else if (theChar == 'o') o++;
			else if (theChar == 'u') u++;
		}
		final String fmt = "There are %d %c's\n";
		System.out.printf(fmt, a, 'a');
		System.out.printf(fmt, e, 'e');
		System.out.printf(fmt, i, 'i');
		System.out.printf(fmt, o, 'o');
		System.out.printf(fmt, u, 'u');
	
		// VERSION 2 -- count all letters using an array
		// also make plurals look pretty in the output
		int[] letters = new int['z' + 1];
		
		for (int n = 0; n < quote.length(); n++) {
			char theChar = quote.charAt(n);
			int theCharAscii = (int)theChar;
			letters[theCharAscii]++;
		}
		
		for (int letter = 'a'; letter <= 'z'; letter++) {
			String verb = letters[letter] == 1 ? "is " : "are";
			String plural = letters[letter] == 1 ? "  " : "'s";
			System.out.printf("There %s %d %c%s\n",
				verb, letters[letter], (char)letter, plural);
		}
	}
}






