package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
	Robot junior=new Robot();
	junior.setSpeed(300);
	junior.penDown();
	junior.setPenColor(Color.BLUE);
	junior.move(100);
	junior.turn(90);
	junior.setPenColor(Color.black);
	junior.move(100);
	junior.turn(90);
	junior.setPenColor(Color.YELLOW);
	junior.move(100);
	junior.turn(90);
	junior.setPenColor(Color.GREEN);
	junior.move(100);
for (int i = 0; i < 4; i++) {
	junior.move(100);
	junior.turn(90);
}
		
	}
}
