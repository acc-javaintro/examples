/*
	Write a Java program called NameFrame that accepts 
	the user's name from the command line and prints
	it in our nifty box:
	
	+-----------------+		+-----------+
	| Rumplestiltskin |		| Sandra Oh |
	+-----------------+		+-----------+
	
 */
public class NameFrame {

    private static void printEnd(int w) {
        System.out.print("+");
        for (int n = 0; n < w; n++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java NameFrame name");
            return;
        }

        final int width = args[0].length() + 2;

        printEnd(width);
        System.out.printf("| %s |\n", args[0]);
        printEnd(width);
    }

}
