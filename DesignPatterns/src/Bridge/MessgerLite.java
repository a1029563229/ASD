package Bridge;

public class MessgerLite extends Messager {
    public MessgerLite(MessagerImp imp) {
        this.imp = imp;
    }

    @Override
    public void login(String username, int password) {
        System.out.println("username is " + username + "password is " + password);
        System.out.println("login by MessagerLite");
        this.imp.writeText("login success");
    }

    @Override
    public void sendMessage(String message) {
        this.imp.writeText(message);
    }
}
