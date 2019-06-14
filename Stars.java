/**
	Write a Java program called Stars to produce this pattern
	in the console:
	
	*
	**
	***
	****
	*****
	******
	*******
	********
	*********
	**********
*/
public class Stars {
	public static void main(String[] args) {
		for (int line = 1; line <= 10; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String line = "";
		for (int n = 1; n <= 10; n++) {
			line += "*";
			System.out.println(line);
		}
		
		char[] theLine =
			new char[]{' ',' ',' ',' ',' ', ' ', ' ', ' ', ' ', ' '};
		for (int i = 0; i < theLine.length; i++) {
			theLine[i] = '*';
			System.out.println(theLine);
		}
		
	}
}




