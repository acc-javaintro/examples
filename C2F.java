public class C2F {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java C2F <temp celsius>");
            return;
        }
         
        double cels = Double.parseDouble(args[0]);
        double fahr = (9.0 / 5.0) * cels + 32.0;
 
        System.out.printf("\n%.1f degrees Celsius is %.1f degrees Fahrenheit\n",
            cels, fahr);
    }
}