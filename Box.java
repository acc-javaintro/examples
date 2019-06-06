/**
    Write a Java program called Box that produces the following pattern in the console:
    <pre>
*****
*   *
*   *
*   *
*****
    </pre>
    <p>
    This pattern is a 5 by 5 box. It's five asterisks across at the top and the bottom
    and 5 asterisks high left and right. It's hollow in the middle.
    </p>
*/
public class Box {
 
    public static void main(String[] args) {
         
        // variation 1 - verbatim
        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");
 
        // variation 2 - see pattern is two strings
        final String END    = "*****\n";
        final String MIDDLE = "*   *\n";
 
        System.out.print(END);
        System.out.print(MIDDLE);
        System.out.print(MIDDLE);
        System.out.print(MIDDLE);
        System.out.print(END);
 
        // variation 3 - use formatter
        System.out.printf("%s%s%s%s%s", END, MIDDLE, MIDDLE, MIDDLE, END);
 
        // variation 4 - format indexers
        final String fmt = "%1$s\n%2$s\n%2$s\n%2$s\n%1$s\n";
        System.out.printf(fmt, END, MIDDLE);
         
        // variation 5 - what I may have suggested to some of you over the weekend
        final String theChar = System.console().readLine("Enter a character: ");
        final String END2    = theChar + theChar + theChar + theChar + theChar;
        final String MIDDLE2 = "*" + theChar + theChar + theChar + "*";
        System.out.printf(fmt, END2, MIDDLE2);
    }
}