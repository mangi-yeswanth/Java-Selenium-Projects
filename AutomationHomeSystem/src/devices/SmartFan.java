package devices;
public class SmartFan implements SmartDevice, Adjustable {
    private int onOroff= 0;
    private int speed = 3;

    public void turnOn() {
        onOroff = 1;
        System.out.println("Smart Fan is ON");
    }

    public void turnOff() {
        onOroff = 0;
        System.out.println("Smart Fan is OFF");
    }

    public void increaseSetting() {
        if (speed < 5) {
            speed++;
            System.out.println("Fan Speed increased to " + speed);
        }
        else {
        	System.out.println("speed of the fan cant be increased more than 5");
        }
    }

    public void decreaseSetting() {
        if (speed > 1) {
            speed--;
            System.out.println("Fan Speed decreased to " + speed);
        }
        else {
        	System.out.println("speed of the fan cant be decreased below 1");
        }
    }
}
