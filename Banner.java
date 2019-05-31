/**
   Write a Java program called Banner that displays the following pattern in the console:

   * * * * *
    * * * * *
   * * * * *
    * * * * *
   * * * * *

    @author kaffn
    @version 1.0.0
 */
public class Banner {
    
	public static void main(String[] args) {
            
		// variation 1 - verbatim
		System.out.println("* * * * *");
		System.out.println(" * * * * *");
		System.out.println("* * * * *");
		System.out.println(" * * * * *");
		System.out.println("* * * * *");

		// variation 2 - recognize the string constants
		final String ODD =  "* * * * *";
		final String EVEN = " * * * * *";
		System.out.println(ODD);
		System.out.println(EVEN);
		System.out.println(ODD);
		System.out.println(EVEN);
		System.out.println(ODD);

		// variation 3 - use formatted string to shorten the source file
		final String FORMAT = "%s\n%s\n%s\n%s\n%s\n";
		final String OUTPUT = String.format(FORMAT, ODD, EVEN, ODD, EVEN, ODD);
		System.out.print(OUTPUT);

		// variation 4 - recognize strings are identical except that first space
		// so migrate that space to the format and switch to printf() because why not
		final String LINE = "* * * * *";
		final String FORMAT2 = "%s\n %s\n%s\n %s\n%s\n";
		System.out.printf(FORMAT2, LINE, LINE, LINE, LINE, LINE);

		// variation 5 - use indexed formatters
                // this allows you to repeat string $1 (LINE) as many times as you like
		final String FORMAT3 = "%1$s\n %2$2\n%1$s\n %2$s\n%1$s\n";
		System.out.printf(FORMAT3, LINE);
	}
}
