import javax.swing.JOptionPane;
        
/**
 * A Java program that will prompt the user for their name and a greeting style and then
 * display a welcome message of the form "style, name!" in both the console and a
 * dialog box.
 * <pre>
 * Compile with: javac Hello.java
 * Run with: java Hello
 * 
 * @author Sean Gilkey
 * @version 1.0.0
 * </pre>
 */
public class Hello {
    public static void main(String[] args) {
        // input phase: gather the user's name from the console
        final String prompt = "Enter your name: ";
        final String name = System.console().readLine(prompt);
        
        // processing phase: build a greeting message incorporating user's name
        final String greeting = "Hello";
        final String format   = "%s, %s!";
        final String message = String.format(format, greeting, name);

        // output phase: display message in console and a pop-up dialog box
        System.out.println(message);
        JOptionPane.showMessageDialog(null, message);
    }
}

/*
    Lessons:
    1.  Some code we write is boilerplate - it is simply required to be there
    2.  Some code we write serves to enhance performance with no affect on the algorithm
    3.  Documenting our intentions, requirements, and assumptions makes code maintainable
    4.  Every Java program is a class and any class with a main() method is a program
    5.  Every Java source code file must end in .java and have the same name as its public class
    6.  Java is case-sensitive
    7.  The package java.lang.* is automatically imported; no other package is
    8.  Every class belongs to a package; the default package has no name;
        only our classes will be in the default package; a class' fully-qualified name includes
        its package
    9.  A class declares/defines zero or more members
    10. Class members may be variable declarations or method declarations
    11. Every Java value has a type; a type defines a fixed-width bit pattern and its meaning
    12. Literals are values written directly in the source code
    13. Variables are named memory locations for storing values
    14. Variables can only hold values of their type
    15. Variables must be declared and initialized before being read
    16. The assignment operator places a value into a variable, overwriting its former contents
    17. Class, variable, and method names must be valid Java identifiers
    18. Identifiers must begin with a letter or underscore but may then contain numbers as well
    19. Source code should be written to follow certain industry conventions for readability
    20. All methods are members of a class
    21. Some variables are local to a method i.e. they only exist while the method is executing
    22. A method declaration defines what a method will do
    23. A method call invokes a method, causing it's statements to execute
    24. An expression is a literal value, a variable, or the result of an operation
    25. A statement is a declaration, assignment, or method call
    26. Statements come in simple and block form
    27. Simple statements end in a semi-colon
    28. Block statements contain zero or more body statements in curly braces
    29. Import statements may list classes individually or by package wildcard
    30. A class name may ALWAYS be fully-qualified; imports are a typing shortcut only
    31. A class definition has an access modifier, a class name, and a body block
    32. A method definition has an access modifier, optional non-access modifiers, a
        return type, a name, a parameter list in parentheses, and a body block
*/