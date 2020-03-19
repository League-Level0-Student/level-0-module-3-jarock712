package _07_years_alive;
import javax.swing.JOptionPane;
public class yearsAlive {
public static void main(String[] args) {
	int years = 2004;
	for (int i = 0; i < 17; i++) {
		JOptionPane.showMessageDialog(null, years);
		years++;
	}
}
}
