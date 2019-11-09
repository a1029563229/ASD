package Bridge;

public class Command {
    public static void main(String[] args) {
        Messager m1 = new MessgerLite(new PCMessagerImp());
        m1.login("jack", 888888);
        m1.sendMessage("hello world");
        Messager m2 = new MessgerLite(new MobileMessageImp());
        m2.login("The shy", 123123);
        m2.sendMessage("hello world");
        Messager m3 = new MessagerPerfect(new MobileMessageImp());
        m3.login("Rose", 123321);
        m3.sendMessage("hello world");
    }
}
