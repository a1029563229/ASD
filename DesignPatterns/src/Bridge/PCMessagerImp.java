package Bridge;

public class PCMessagerImp extends MessagerImp {
    @Override
    public void playSound(String sound) {
        System.out.println("Play PC sound " + sound);
    }

    @Override
    public void writeText(String text) {
        System.out.println("Write PC text " + text);
    }

    @Override
    public void connect(String host, int port) {
        System.out.println("PC Connect to host: " + host + " port: " + port);
    }
}
