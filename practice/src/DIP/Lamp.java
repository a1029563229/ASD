package DIP;

public class Lamp implements SwitchableDevice {

    @Override
    public void turnOff() {
        System.out.println("turnOff");
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn");
    }
}
