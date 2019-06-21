// 1. Encode manually
// 2. Command-line arguments
// 3. System.console().readLine() prompts
// 4. new Scanner(System.in) / scanner.nextInt() scanner.next()
// 5. JOptionPane.showInputDialog();
import javax.swing.JOptionPane;
public class Input {
	public static void main(String[] args) {
		final String message = "Say something";
		String answer = JOptionPane.showInputDialog(null, message);
		if (answer == null)
			answer = "I prefer not to say";
		Object[] buttons = {"Kyll\u00E4", "Ei", "Ehk\u00E4", "Mit\u00E4\u00E4n Tahansa"};
		Object result = 
			JOptionPane.showOptionDialog(null, answer, "My Dialog",
		    JOptionPane.DEFAULT_OPTION,
			JOptionPane.WARNING_MESSAGE, null, buttons, buttons[0]);
		int idx = Integer.parseInt(""+result);
		System.out.println(idx);
		JOptionPane.showMessageDialog(null, buttons[idx]);
	}

}