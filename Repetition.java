public class Repetition {
	
	public static void main(String[] args) {
		
		// print 0 to 9
		while (i < 10) {
		int i = 0;
			System.out.println(i);
			i++;
		}
		
		// prints 0 to 9
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
		
		// prints 0 to 9
		for (i = 0; i < 10; i++)
			System.out.println(i);
		
		// prints 0 to 9
		i = 0;
		for ( ; i < 10; i++)
			System.out.println(i);
		
		// prints 0 to 9
		i = 0;
		for ( ; ; i++) {
			if (i >= 10) break;
			System.out.println(i);
		}
		
		// prints 0 to 9
		i = 0;
		for ( ; ; ) {
			if (i >= 10) break;
			System.out.println(i);
			i++;
		}
		
	}
	
}









