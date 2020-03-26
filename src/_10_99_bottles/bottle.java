package _10_99_bottles;
import javax.swing.JOptionPane;
public class bottle {
public static void main(String[] args) {
	int bottles = 99;
	for (int i = 0; i < 99; i++) {
		JOptionPane.showMessageDialog(null, bottles + " bottles of beer on the wall, " + bottles + " bottles of beer, Take one down and pass it around, " + --bottles + " bottles of beer on the wall.");
	}
}
}