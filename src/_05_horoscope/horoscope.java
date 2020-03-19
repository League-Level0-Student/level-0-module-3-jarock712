package _05_horoscope;
import javax.swing.JOptionPane;
public class horoscope {
public static void main(String[] args) {
	String sign = JOptionPane.showInputDialog("What is your star sign?");
	if (sign.equalsIgnoreCase("aries")) {
		JOptionPane.showMessageDialog(null, "Aries: March 21 - April 19 The Ram. A Fire sign, ruled by Mars...");
	}
	if (sign.equalsIgnoreCase("taurus")) {
		JOptionPane.showMessageDialog(null, "Taurus: April 20 - May 20 The Bull. An Earth sign, ruled by Venus...");
	}
	if (sign.equalsIgnoreCase("gemini")) {
		JOptionPane.showMessageDialog(null, "Gemini: May 21 - June 20 The Twins. An Air sign, ruled by Mercury...");
	}
	if (sign.equalsIgnoreCase("cancer")) {
		JOptionPane.showMessageDialog(null, "Cancer: June 21 - July 22 The Crab. An Water sign, ruled by the Moon...");
	}
	if (sign.equalsIgnoreCase("leo")) {
		JOptionPane.showMessageDialog(null, "Leo: July 23 - August 22 The Lion. A Fire sign, ruled by the Sun...");
	}
	if (sign.equalsIgnoreCase("virgo")) {
		JOptionPane.showMessageDialog(null, "Virgo: August 23 - Sept. 22 The Maiden. An Earth sign, ruled by Mercury...");
	}
	if (sign.equalsIgnoreCase("libra")) {
		JOptionPane.showMessageDialog(null, "Libra: Sept. 23 - October 22 The Scales. An Air sign, ruled by Venus...");
	}
	if (sign.equalsIgnoreCase("scorpio")) {
		JOptionPane.showMessageDialog(null, "Scorpio: October 23 - Nov. 21 The Scorpion. A Water sign, ruled by Pluto..");
	}
	if (sign.equalsIgnoreCase("sagittarius")) {
		JOptionPane.showMessageDialog(null, "Sagittarius: Nov. 22 - Dec. 21 The Centaur. A Fire sign, ruled by Jupiter..");
	}
	if (sign.equalsIgnoreCase("capricorn")) {
		JOptionPane.showMessageDialog(null, "Capricorn: Dec. 22 - Jan. 19 The Mountain Goat. An Earth sign, ruled by Saturn....");
	}
	if (sign.equalsIgnoreCase("aquarius")) {
		JOptionPane.showMessageDialog(null, "Aquarius: Jan. 20 - Feb. 18 The Man who Carries Water. An Air sign, ruled by Uranus...");
	}
	if (sign.equalsIgnoreCase("pisces")) {
		JOptionPane.showMessageDialog(null, "Pisces: Feb. 19 - March 20 The Fish. A Water sign, ruled by Neptune...");
	}
}
}