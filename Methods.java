public class Methods {
    
    public static void main(String[] args) {
        int i = 3;
        String s = "Java";
        
        a();                        // void return, no args
        int j = b();                // int return, no args
        
        c(i);                       // void return, 1 primitive int arg
        int k = d(i);               // int return, 1 primitive int arg
        
        e(s);                       // void return, 1 reference arg
        String t = f(s);            // String return, 1 reference arg
        
        double d = workIt(i,s);     // double return, multiple arguments
        System.out.println(d);
    }
    
    private static void a() {
    }
    
    private static int b() {
        return 1 + (int)(Math.random() * 6);
    }
    
    private static void c(int val) {
        System.out.println(val + val);
    }
    
    private static int d(int val) {
        return val + val;
    }
    
    private static void e(String text) {
        System.out.println(text + text + text);
    }
    
    private static String f(String text) {
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
    
    private static double workIt(int val, String text) {
        return text.length() * val + Math.PI;
    }
}
