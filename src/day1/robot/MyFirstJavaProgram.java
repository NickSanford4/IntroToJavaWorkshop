package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot bob;
	bob=new Robot("mini");
	bob.penDown();
	bob.setSpeed(10);
	for (int i = 0; i < 4; i++) {
		bob.move(100);
		bob.turn(360);
	}
		
		
	}
}
