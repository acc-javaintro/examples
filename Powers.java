/**
	Write a Java program called Powers that displays
	the numbers 1 - 25 along with their squares and
	cubes. An example run follows:
	
	C:\Users\javauser\Desktop> java Powers
	
	Number  Square  Cube
	1       1       1
	2       4       8
	3       9       27
	...
*/
public class Powers {
	
	/*
		%	   -              20					   s
		format left-justified in a 20-char wide field  a string
	*/
	
	public static void main(String[] args) {
		System.out.printf("%-20s%-20s%-20s\n", "Number", "Square", "Cube");
		for (long n = 1; n <= 10_000; n++) {
			long sq = n * n;
			long cb = sq * n;
			System.out.printf("%-20d%-20d%-20d\n", n, sq, cb);
		}
	}
	
}













