public class Ifs {
    public static void main(String[] args) {
        
        System.out.print("Enter your letter grade (A-D,F): ");
        final String grade = System.console().readLine();
        
        if ( grade.equals("A") || grade.equals("a") ) {
            System.out.println("Great job! Ice Cream Party!");
		}
        else if (grade.equals("B") || grade.equals("b")) {
            System.out.println("Good work.");
		}
        else if (grade.equals("C") || grade.equals("c")) {
            System.out.println("You can do better.");
		}
        else if (grade.equals("D") || grade.equals("d")) {
            System.out.println("Unacceptable.");
            System.out.println("Go study.");
        }
        else if (grade.equals("F") || grade.equals("f")) {
            System.out.println("You're grounded!");
		}
        else {
            System.out.println("Use only letter grades A-D or F.");
        }
        // EQUIVALENT SWITCH STATEMENT:
        
        switch (grade) {
            default:
                System.out.println("Use only letter grades A-D or F."); break;
            case "A": case "a": 
                System.out.println("Great job! Ice Cream Party!"); break;
            case "B": case "b":
                System.out.println("Good work."); break;
            case "C": case "c":
                System.out.println("You can do better."); break;
            case "D": case "d":
                System.out.println("Unacceptable.");
                System.out.println("Go study."); break;
            case "F": case "f":
                System.out.println("You're grounded!"); break;
        }
   
    }
}
