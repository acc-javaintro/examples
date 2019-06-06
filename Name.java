/**
    Write a Java program called Name that prompts the user for their
    first name, then prompts the user for their last name,
    then displays their name in phone book style. Here's what I see
    when I run mine:
        <pre>
C:\Users\javauser\Desktop> java Name
What is your first name? Sean
What is your last name? Gilkey
 
Your name appears in the phone book as Gilkey, Sean
 
C:\Users\javauser\Desktop>
        </pre>
 */
public class Name {
         
    public static void main(String[] args) {
        final String first = System.console().readLine("What is your first name? ");
        final String last  = System.console().readLine("What is your last name? ");
        System.out.printf("\nYour name appears in the phone book as %s, %s\n\n", last, first);
    }
     
}