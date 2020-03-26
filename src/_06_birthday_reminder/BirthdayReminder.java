package _06_birthday_reminder;
import javax.swing.JOptionPane;
public class BirthdayReminder {
	public static void main(String[] args) {	
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";
		String remind = JOptionPane.showInputDialog("Which birthday do you need?");
		System.out.println(remind);
		if (remind.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		if (remind.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		if (remind.equalsIgnoreCase("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry I don't remember that person's birthday.");
		}
	} 
}