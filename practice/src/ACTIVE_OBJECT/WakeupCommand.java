package ACTIVE_OBJECT;

public class WakeupCommand implements Command {
    @Override
    public void execute() throws Exception {
        System.out.println("wakeup");
    }
}
