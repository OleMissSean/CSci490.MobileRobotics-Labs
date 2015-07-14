//Sean Staz
//CSci 490
//Robotics

package edu.olemiss.robotics;

import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.LocalBTDevice;

public class BluetoothInfo
{
	public static void main(String[] args)
	{
		LocalBTDevice bt = LocalEV3.get().getBluetoothDevice();
		System.out.println("Bluetooth Address");
		System.out.println(bt.getBluetoothAddress());
		System.out.println("Visibility: ");
		System.out.println(bt.getVisibility());
		Button.waitForAnyPress();
	}
}
