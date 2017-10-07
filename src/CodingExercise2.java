

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	

	String g = JOptionPane.showInputDialog("Enter age");
int a = Integer.parseInt(g);
if (a >= 31 ) {
	JOptionPane.showMessageDialog(null, "Sorry, you are over 30 years of age, you're too old!");
}
else if(a < 31) {
JOptionPane.showMessageDialog(null, "You were born around the year " +(2017 - a)+ " or " +(2016 - a)  );
}

}
}



