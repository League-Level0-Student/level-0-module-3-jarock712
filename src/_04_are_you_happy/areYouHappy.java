package _04_are_you_happy;
import javax.swing.JOptionPane;
public class areYouHappy {
public static void main(String[] args) {
	String answer1 = JOptionPane.showInputDialog("Are you happy?");
	if (answer1.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}
	if (answer1.equalsIgnoreCase("no")) {
		String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
		if (answer2.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		}
		if (answer2.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
		}
	}
}
}