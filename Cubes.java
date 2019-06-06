/**
    Write a Java program called Cubes that prints the first
    three natural numbers along with their squares and cubes as
    shown. (Hints: to square a number, multiply it by itself.
    To cube it, multiply it by itself twice. Try using
    tabs to get the alignment of data pretty in your output).
    <pre>
C:\Users\javauser\Desktop> java Cubes
Num Square  Cube
1   1   1
2   4   8
3   9   27
 
C:\Users\javauser\Desktop>
    </pre>
 */
public class Cubes {
 
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");
 
        final String fmt = "%s\t%s\t%s\n";
        int number = 1, square = number * number, cube = square * number;
        System.out.printf(fmt , number, square, cube);
 
        number = 2;
        square = number * number;
        cube = square * number;
        System.out.printf(fmt, number, square, cube);
 
        number = 3;
        square = number * number;
        cube = square * number;
        System.out.printf(fmt, number, square, cube);
 
    }
}