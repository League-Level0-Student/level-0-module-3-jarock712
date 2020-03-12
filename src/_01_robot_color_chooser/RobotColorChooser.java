package _01_robot_color_chooser;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;
public class RobotColorChooser {
	public static void main(String[] args) {
	for (int i = 0; i<= 10; i++) {
		Robot Joe = new Robot();
		Joe.setSpeed(50);
		Joe.penDown();
		String colors = JOptionPane.showInputDialog("What color do you want the robot to draw?");
		Joe.setPenWidth(10);
		if(colors.equals("red")) {
			Joe.setPenColor(Color.red);
		}
		if(colors.equals("green")) {
			Joe.setPenColor(Color.green);
		}
		if(colors.equals("blue")) {
			Joe.setPenColor(Color.blue);
		}
		if(colors.equals("yellow")) {
			Joe.setPenColor(Color.yellow);
		}
		if(colors.equals("magenta")) {
			Joe.setPenColor(Color.magenta);
		}
		else{
			Joe.setRandomPenColor();
		}
		Joe.move(100);
		Joe.turn(90);
		Joe.move(100);
		Joe.turn(90);
		Joe.move(100);
		Joe.turn(90);
		Joe.move(100);
		Joe.turn(90);
	}				
	}
}