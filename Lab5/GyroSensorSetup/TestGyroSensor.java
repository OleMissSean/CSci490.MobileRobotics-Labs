//Sean Staz
//CSci 490
//Robotics
package edu.olemiss.robotics;

import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.port.*;
import lejos.hardware.lcd.LCD;
import lejos.hardware.Sound;
import lejos.hardware.Button;

public class TestGyroSensor
{
	private static EV3GyroSensor gyro;
	private static SensorMode angleProvider;
	
	public static void main(String[] args) 
	{
		Port port = LocalEV3.get().getPort("S3");
		gyro = new EV3GyroSensor(port);
		angleProvider = (SensorMode) gyro.getAngleMode();
	
		LCD.drawString(" running gyro test", 0, 0);
	
		// gyro.reset();	
	    Sound.beepSequenceUp();
	
	    float[] angle = { 0 };
        for(int i = 0 ; i < 60 ; i++)
        {
	
	        Button.waitForAnyPress(0);
	
	        angleProvider.fetchSample(angle, 0);
	
	        LCD.drawString(" A "+angle[0]+"              ", 0, 2+(i % 6));
	
	        Sound.beep();
        }
	}
}
