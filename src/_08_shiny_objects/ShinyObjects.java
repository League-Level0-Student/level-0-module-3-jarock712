package _08_shiny_objects;
import java.applet.AudioClip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class ShinyObjects {
	public static void main(String[] args) {
		String objects = JOptionPane.showInputDialog("How many shiny objects do you want?");
		int number = Integer.parseInt(objects);
		for (int i = 0; i < number; i++) {
			playMisterZee();
		}
	}
	public static void playMisterZee() {
		try {
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}