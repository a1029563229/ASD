package Bridge;

public abstract class MessagerImp {
    public abstract void playSound(String sound);
    public abstract void writeText(String text);
    public abstract void connect(String host, int port);
}
