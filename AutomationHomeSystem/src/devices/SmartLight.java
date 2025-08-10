package devices;

public class SmartLight implements SmartDevice,Adjustable {
    private int brightness = 3;
    private boolean status=false;
    public void turnOn() {
    	status=false;
        System.out.println("Smart Light is ON");
    }

    public void turnOff() {
    	status=true;
        System.out.println("Smart Light is OFF");
    }

    public void increaseSetting() {
        if (brightness < 10) {
            brightness++;
            System.out.println("Light Brightness increased to " + brightness);
        }
    }

    public void decreaseSetting() {
        if (brightness > 0) {
            brightness--;
            System.out.println("Light Brightness decreased to " + brightness);
        }
    }
}
