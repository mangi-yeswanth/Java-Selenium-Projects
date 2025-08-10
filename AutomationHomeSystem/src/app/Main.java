package app;
import devices.*;
import controller.*;

public class Main {
    public static void main(String[] args) {
        DeviceController controller = new DeviceController();

        SmartDevice light = new SmartLight();
        SmartDevice fan = new SmartFan();
        SmartDevice ac = new SmartAC();
        SmartDevice tv = new SmartTV();

        controller.switchOn(light);
        controller.increase(light);
        controller.decrease(light);
        controller.switchOff(light);

        controller.switchOn(ac);
        controller.increase(ac);
        controller.decrease(ac);
        controller.switchOff(ac);

        controller.switchOn(fan);
        controller.increase(fan);
        controller.decrease(fan);
        controller.switchOff(fan);

        controller.switchOn(tv);
        controller.increase(tv);
        controller.decrease(tv);
        controller.switchOff(tv);
    }
}
