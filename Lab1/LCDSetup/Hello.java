//Sean Staz
//CSci 490
//Robotics

package edu.olemiss.robotics;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;

public class Hello {
	public static void main(String[] args)
	{
		LCD.drawString("Hello", 1, 1);
		Button.waitForAnyEvent();
	}
}
