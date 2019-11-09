package Bridge;

public class MobileMessageImp extends MessagerImp {
    @Override
    public void playSound(String sound) {
        System.out.println("Play Mobile sound " + sound);
    }

    @Override
    public void writeText(String text) {
        System.out.println("Write Mobile text " + text);
    }

    @Override
    public void connect(String host, int port) {
        System.out.println("Mobile Connect to host: " + host + " port: " + port);
    }
}
