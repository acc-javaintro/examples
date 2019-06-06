**
    Write a Java program called Frame that prints your name
    framed in an ASCII-art box. The box should allow one
    space on either side of your name, use + symbols for
    the corners, vertical pipes (shift-backslash) for the
    sides, and hyphens for the top and bottom:
    <pre>
C:\Users\javauser\Desktop> java Frame
 
+------+
| Sean |
+------+
 
C:\Users\javauser\Desktop>
    </pre>
 */
public class Frame {
 
    public static void main(String[] args) {
        final String name = "Sean", topBottom = "+------+";
        System.out.println(topBottom);
        System.out.printf("| %s |\n", name);
        System.out.println(topBottom);
    }
         
}