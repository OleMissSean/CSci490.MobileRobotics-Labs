//Sean Staz
//CSci 490
//Robotics

package edu.olemiss.robotics;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.Motor;
import lejos.utility.Delay;

public class TestMotor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Motor.C.setSpeed(100);
		Motor.D.setSpeed(100);
		Motor.C.forward();
		Motor.D.forward();
		Delay.msDelay(4000);
		Motor.C.stop();
		Motor.D.stop();
		Motor.C.rotateTo(360);
		Motor.C.rotate(-720,true);
		// while(Motor.A.isMoving()) {}
		//  	Thread.yield();
		int angle = Motor.C.getTachoCount(); // should be -360
		LCD.drawInt(angle, 0, 0);
		Delay.msDelay(4000);
		Motor.D.setSpeed(100);
		Motor.D.forward();
		Delay.msDelay(4000);
		Motor.D.stop();
	}

}
