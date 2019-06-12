public class Ternary {
	public static void main(String[] args) {
		int number = 13;
		
		/*
		String result;
		if (number == 13)
			result = "Unlucky!";
		else
			result = "Not unlucky!";
		*/
		String result = number == 13 ? "Unlucky" : "Not unlucky";
			
		System.out.println(result);
	}
}