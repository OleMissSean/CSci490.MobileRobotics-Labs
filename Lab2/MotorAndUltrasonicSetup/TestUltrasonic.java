//Sean Staz
//CSci 490
//Robotics

package edu.olemiss.robotics;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.utility.Delay;

public class TestUltrasonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Port port = LocalEV3.get().getPort("S1");
		EV3UltrasonicSensor Ultrasonic = new EV3UltrasonicSensor(port);
		SensorMode distanceProvider = (SensorMode) Ultrasonic.getDistanceMode();
		// SensorMode distanceProvider = (SensorMode)
		// Ultrasonic.getListenMode();

		float[] sample = new float[distanceProvider.sampleSize()];
		distanceProvider.fetchSample(sample, 0);
		Sound.beep();
		Ultrasonic.enable();
		while (Button.getButtons() != Button.ID_ESCAPE) {
			distanceProvider.fetchSample(sample, 0);
			LCD.drawString(" U " + sample[0] + "			", 0, 2);
			Delay.msDelay(500);
		}
		Ultrasonic.disable();
		while (Ultrasonic.isEnabled()) {
		}
		Ultrasonic.close();
	}
}
