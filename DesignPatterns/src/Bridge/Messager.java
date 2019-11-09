package Bridge;

public abstract class Messager {
    protected MessagerImp imp;

    public abstract void login(String username, int password);
    public abstract void sendMessage(String message);
}
