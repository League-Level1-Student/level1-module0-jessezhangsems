package _01_houses;

import java.awt.AWTException;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Houses {
	public void run()  {
		Robot house=new Robot(); 
		house.setX(0);
		house.setY(550);
		house.setSpeed(100);
		house.setPenWidth(50);
		house.penDown();
		house.setPenColor(Color.green);
		house.turn(90);
		house.move(100);
		house.setRandomPenColor();
		house.turn(270);
		house.move(500);
		house.turn(90);
		house.move(100);
		house.turn(90);
		house.move(500);
		house.turn(270);
		house.setPenColor(Color.green);
		house.move(100);
		house.setRandomPenColor();
		house.turn(270);
		house.move(300);
		house.turn(90);
		house.move(400);
		house.turn(90);
		house.move(300);
		house.turn(270);
		house.setPenColor(Color.green);
		house.move(100);
		house.setRandomPenColor();
		house.turn(270);
		house.move(500);
		house.turn(90);
		house.move(100);
		house.turn(90);
		house.move(500);
		house.turn(270);
		
	}
}
