package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot nuclear = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
		nuclear.setSpeed(350);
		// 5. Set the pen width to 5
		nuclear.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			// 7. Set the pen color to random
			nuclear.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();

			// 8. Turn the robot 90 degrees to the right
			nuclear.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		nuclear.penDown();
		nuclear.setRandomPenColor();
		for (int i = 0; i < 4; i++) {
			nuclear.move(200);
			nuclear.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
