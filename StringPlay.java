public class StringPlay {
	public static void main(String[] args) {
		String text = "She sells seashells by the seashore";
		// how long is the sentence?
		int length = text.length();
		// what is the seventh character?
		char seventh = text.charAt(6);
		// what is the index of the first lower-case 'e'?
		int first_e_at = text.indexOf('e');
		// what is the index of the second lower-case 'e'?
		int second_e_at = text.indexOf('e', first_e_at + 1);
		// what are the indexes of all the 'e's?
		int idx = 0;
		while (idx != -1) {
			idx = text.indexOf("e", idx);
			if (idx != -1) {
				System.out.println("e at " + idx);
				idx++;
			}
		}
		// print the individual words of the String
		String[] words = text.split(" ");
		for (String s : words)
			System.out.println(s);
		
		// what text occurs in the range 10-19 of the string?
		String sub = text.substring(10, 19);
		System.out.println(sub);
		
		StringBuilder sb = new StringBuilder(text.length() + 1);
		for (String s : words)
			sb.append(s).append(" ");
		System.out.println(sb);
		sb.setLength(0);
		sb.append("<!DOCTYPE html>\n")
			.append("<html>\n")
			.append("\t<body>\n")
			.append("\t\t<h1>Hello, World!</h1>\n")
			.append("\t</body>\n")
			.append("</html>\n");
		System.out.println(sb);
		
		String path = "C:\\Users\\javauser\\Desktop\\sources\\doc.html";
		int lastSlash = path.lastIndexOf('\\');
		String fileName = path.substring(lastSlash + 1);
		System.out.println(fileName);
		
		StringBuilder sb2 = new StringBuilder(512);
		StringBuilder sb3 = new StringBuilder(text);
	}
}








