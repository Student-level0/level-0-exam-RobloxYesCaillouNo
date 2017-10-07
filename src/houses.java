import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
	Robot Tortoise = new Robot();
Tortoise.moveTo(10, 600);

Tortoise.penDown();
Tortoise.setPenColor(252, 3, 55);
Tortoise.setPenWidth(5);
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(50);
Tortoise.turn(90);
Tortoise.move(100);
Tortoise.turn(90);
Tortoise.move(50);
}
}
