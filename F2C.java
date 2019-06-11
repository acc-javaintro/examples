public class F2C {
	
    public static void main(String[] args) {
		
        if (args.length < 1) {
            System.out.println("Usage: java F2C <temp fahrenheit>");
            return;
        }
 
        double fahr = Double.parseDouble(args[0]);         
        double cels = (fahr - 32.0) * (5.0 / 9.0);
 
        System.out.print("\n" + fahr + " degrees Fahrenheit is " + cels +
            " degrees Celsius\n");
    }
}