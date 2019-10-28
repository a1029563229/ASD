package ACTIVE_OBJECT;
import java.util.LinkedList;
import java.util.Iterator;

public class ActiveObjectEngine {
    private LinkedList itsCommands = new LinkedList();

    public void addCommand(Command c) {
        itsCommands.add(c);
    }

    public void run() throws Exception {
        while (!itsCommands.isEmpty()) {
            Command c = (Command) itsCommands.getFirst();
            itsCommands.removeFirst();
            c.execute();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("start");
        ActiveObjectEngine engine = new ActiveObjectEngine();
        SleepCommand sleepCommand = new SleepCommand(1500, engine, new WakeupCommand());
        engine.addCommand(sleepCommand);
        engine.run();
    }
}
