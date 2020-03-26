package _02_crazy_cat_lady;
import java.net.URI;
import javax.swing.JOptionPane;
public class CrazyCatLady {
	public static void main(String[] args) {
		String cats = JOptionPane.showInputDialog("How many cats do you have?");
		int num = Integer.parseInt(cats);
		if(num >= 3) {
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady!!");
		}
		if(num > 0 && num <= 3) {
			playVideo("www.youtube.com/watch?v=XyNlqQId-nk");
		}
		if(num == 0) {
			playVideo("www.youtube.com/watch?v=oj_yLBltPE8");
		}
	}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}