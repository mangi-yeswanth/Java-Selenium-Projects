package devices;

public class SmartAC implements SmartDevice, Adjustable {
    private int temperature = 18;

    @Override
    public void turnOn() {
        System.out.println("Smart AC is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart AC is OFF");
    }

    public void increaseSetting() {
    	if(temperature<30) {
        temperature++;
        System.out.println("AC Temperature increases to the value " + temperature + "°C");
    	}
    	else {
    		System.out.println("cant increase the temperature more than "+temperature);
    	}
    }

    public void decreaseSetting() {
    	if(temperature>18) {
        temperature--;
        System.out.println("AC Temperature decreases to the value " + temperature + "°C");
    }
    else {
    	System.out.println("AC temperature cant be decreased below 30 ");
    }
}
}
