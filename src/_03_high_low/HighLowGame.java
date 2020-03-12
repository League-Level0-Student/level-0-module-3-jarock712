package _03_high_low;
import java.util.Random;
import javax.swing.JOptionPane;
public class HighLowGame {
	public static void main(String[] args) {
		int random = new Random().nextInt(5);
		System.out.println(random);
		for (int i = 0; i < 10; i++) {
		String guess = JOptionPane.showInputDialog("Guess a number...");
			int num = Integer.parseInt(guess);
			if (num == random) {
				JOptionPane.showMessageDialog(null, "You win!!");
				System.exit(0);
			}
			if (num > random) {
				JOptionPane.showMessageDialog(null, "Too high!");
			}
			if (num < random) {
				JOptionPane.showMessageDialog(null, "Too low!");
			}
		}
		JOptionPane.showMessageDialog(null, "You lose...");
	}
}