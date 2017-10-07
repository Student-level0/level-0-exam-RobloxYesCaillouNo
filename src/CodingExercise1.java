import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {
	
    public static void main(String[] args) {
   	 Robot Robot = new Robot();
    	// 3. ask the user what color they would like the Robot to draw
   	 String f = JOptionPane.showInputDialog("What color do u want? We have red green and blue");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
   	 if (f.equals("green")) {
		Robot.setPenColor(0, 250, 0);
	}
   	 else if (f.equals("red")) {
		Robot.setPenColor(250, 0 , 0);
	}
   	 else if (f.equals("blue")) {
		Robot.setPenColor(0, 0, 250);
	}
   	 // 2. set the pen width to 10
    	Robot.setPenWidth(10);
    	
   	 // 1. make the Robot draw a shape
   	 Robot.penDown();
   	 for (int i = 0; i < 4; i++) {
	Robot.move(100);
    Robot.turn(90);
   	 }
    }

}
