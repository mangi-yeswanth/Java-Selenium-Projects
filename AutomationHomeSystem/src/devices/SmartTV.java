package devices;

public class SmartTV implements SmartDevice, Adjustable {
    private int volume = 20;
    private int brightness=3;

    public void turnOn() {
        System.out.println("Smart TV is ON Now");
    }

    public void turnOff() {
        System.out.println("Smart TV is OFF Now");
    }

    public void increaseSetting() {
        if (volume < 100) {
            volume++;
            System.out.println("TV Volume is increased to " + volume);
        }
        else {
        	System.out.println("tv volume cant be increased after 100");
        }
    }

    public void decreaseSetting() {
        if (volume > 0) {
            volume--;
            System.out.println("TV Volume is decreased to " + volume);
        }
        else {
        	System.out.println("tv volume cant be decreased after 0");
        }
    }
}

