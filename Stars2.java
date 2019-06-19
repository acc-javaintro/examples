/*
Write a Java program called Stars2 to produce the
following pattern:

C:\Users\javauser\Desktop> java Stars2
**********
 *********
  ********
   *******
    ******
	 *****
	  ****
	   ***
	    **
		 *
 */
public class Stars2 {

    public static void main(String[] args) {
        int max = 10;
        if (args.length == 1) {
            int suggestion = Integer.parseInt(args[0]);
            if (suggestion > 0) {
                max = suggestion;
            }
        }
        for (int line = 0; line < max; line++) {
            // print spaces
            for (int space = 0; space < line; space++) {
                System.out.print(' ');
            }
            // print stars
            for (int star = max; star > line; star--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
