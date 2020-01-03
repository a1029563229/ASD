package Proxy;

abstract class ISubject {
    abstract void process();
}

class ProxySubject extends ISubject {

    @Override
    void process() {
        //对 RealSubject 的一种间接访问
        //....
    }
}

public class Proxy {
    public static void main(String[] args) {
        ProxySubject proxy = new ProxySubject();
        proxy.process();
    }
}
