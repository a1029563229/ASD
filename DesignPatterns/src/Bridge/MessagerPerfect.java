package Bridge;

public class MessagerPerfect extends Messager {
    public MessagerPerfect(MessagerImp imp) {
        this.imp = imp;
    }

    @Override
    public void login(String username, int password) {
        System.out.println("username is " + username + "password is " + password);
        this.imp.playSound("ready to login sound");
        System.out.println("login by MessagerPerfect");
        this.imp.playSound("login success sound");
    }

    @Override
    public void sendMessage(String message) {
        this.imp.playSound("send message sound");
        this.imp.writeText(message);
    }
}
