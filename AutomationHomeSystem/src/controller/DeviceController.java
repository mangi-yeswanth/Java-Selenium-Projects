package controller;
import devices.SmartDevice;
import devices.Adjustable;
public class DeviceController {
	public void switchOn(SmartDevice device) {
		device.turnOn();
	}

	public void switchOff(SmartDevice device) {
		device.turnOff();
	}

	public void increase(SmartDevice device) {
		if (device instanceof Adjustable) {
			((Adjustable) device).increaseSetting();
		} else {
			System.out.println("The device does not supports to modify or change its settings");
		}
	}

	public void decrease(SmartDevice device) {
		if (device instanceof Adjustable) {
			((Adjustable) device).decreaseSetting();
		} 
		else {
			System.out.println("This device does not support adjustable settings.");
		}
	}
}
