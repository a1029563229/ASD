package State;

abstract class NetworkState {
    public NetworkState pNext;
    public abstract void Operation1();
    public abstract void Operation2();
}

class OpenState extends NetworkState {

    private static NetworkState n_instance;
    public static NetworkState getInstance() {
        if (n_instance == null) {
            n_instance = new OpenState();
        }
        return n_instance;
    }

    @Override
    public void Operation1() {
        System.out.println("OpenState Operation1");
        pNext = CloseState.getInstance();
    }

    @Override
    public void Operation2() {
        System.out.println("OpenState Operation2");
        pNext = getInstance();
    }
}

class CloseState extends NetworkState {

    private static NetworkState n_instance;
    public static NetworkState getInstance() {
        if (n_instance == null) {
            n_instance = new CloseState();
        }
        return n_instance;
    }

    @Override
    public void Operation1() {
        System.out.println("CloseState Operation1");
        pNext = OpenState.getInstance();
    }

    @Override
    public void Operation2() {
        System.out.println("CloseState Operation2");
        pNext = getInstance();
    }
}

public class NetworkProcessor {
    private NetworkState pState;

    public NetworkProcessor(NetworkState state) {
        pState = state;
    }

    public void Operation1() {
        pState.Operation1();
        pState = pState.pNext;
    }

    public void Operation2() {
        pState.Operation2();
        pState = pState.pNext;
    }

    public static void main(String[] args) {
        NetworkProcessor networkProcessor = new NetworkProcessor(new OpenState());
        networkProcessor.Operation1();
        networkProcessor.Operation1();
        networkProcessor.Operation1();
        networkProcessor.Operation1();
        networkProcessor.Operation1();
        networkProcessor.Operation1();
        networkProcessor.Operation2();
        networkProcessor.Operation2();
        networkProcessor.Operation2();
        networkProcessor.Operation2();
    }
}
