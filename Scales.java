/**
	Write a Java program called Scales that prints all the whole
	numbers between -25 and +25; between 0 and 100 by fives; the
	first 20 multiples of 3; even numbers between 1 and 99; all
	the negative numbers less than -30 and greater than -40 in
	descending order;
*/
public class Scales {
	
	public static void main(String[] args) {
		
		for (int n = -25; n <= 25; n++) {
			System.out.printf("%d ", n);
		}
		System.out.println();
		
		for (int n = 0; n <= 100; n += 5) {
			System.out.printf("%d ", n);
		}
		System.out.println();
		
		for (int n = 3; n <= (3 * 20); n+= 3) {
			System.out.printf("%d ", n);
		}
		System.out.println();
		
		// int theNumber = 3;
		for (int n = 0, theNumber = 3; n < 20; n++) {
			System.out.printf("%d ", theNumber);
			theNumber += 3;
		}
		System.out.println();
		
		for (int n = 2; n <= 99; n++) {
			if (n % 2 == 0)
				System.out.printf("%d ", n);
		}
		System.out.println();
		
		for (int n = -31; n > -40; n--)
			System.out.printf("%d ", n);
		System.out.println();
	}
	
}






