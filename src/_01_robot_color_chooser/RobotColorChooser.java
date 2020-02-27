//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot helper = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int i=0; i <10; i++) {
		String color=JOptionPane.showInputDialog("What color do you want the robot to draw?");
		
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("red")) {
		 helper.setSpeed(999999999);
		helper.penDown();
		helper.setPenColor(255,0,0);;
		}
		else if(color.equalsIgnoreCase("blue")) {
			 helper.setSpeed(999999999);
			helper.penDown();
			helper.setPenColor(0,0,255);;
			}
		
        //6. If the user doesn’t enter anything, choose a random color
		else {
			JOptionPane.showMessageDialog(null, "NO RED ONLY!!!");
		}
		//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		helper.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		helper.setSpeed(999999999);
		helper.move(100);
		helper.turn(90);
		helper.move(100);
		helper.turn(90);
		helper.move(100);
		helper.turn(90);
		helper.move(100);
		helper.turn(90);
	helper.penUp();
	helper.move(700);
	}
	
	}
}
