package DIP;

enum State {
    OFF("off"),
    ON("on");

    State(String value) {}
}

public class Button {
    private SwitchableDevice switchableDevice;

    private Button(SwitchableDevice switchableDevice) {
        this.switchableDevice = switchableDevice;
    }

    private void poll(State state) {
        if (state == State.OFF) {
            switchableDevice.turnOff();
        } else {
            switchableDevice.turnOn();
        }
    }

    public static void main(String[] args) {
        Button btn = new Button(new Lamp());
        btn.poll(State.OFF);
        btn.poll(State.ON);
    }
}
