package ACTIVE_OBJECT;

public class DelayedTypeCommand implements Command {
    private long itsDelay;
    private char itsChar;
    private static ActiveObjectEngine engine = new ActiveObjectEngine();
    private static boolean stop = false;

    public DelayedTypeCommand(long delay, char c) {
        itsDelay = delay;
        itsChar = c;
    }

    public void execute() throws Exception {
        System.out.print(itsChar);
        if (!stop) {
            delayAndRepeat();
        }
    }

    private void delayAndRepeat() throws CloneNotSupportedException {
        engine.addCommand(new SleepCommand(itsDelay, engine, this));
    }

    public static void main(String args[]) throws Exception {
        engine.addCommand(new DelayedTypeCommand(100, '1'));
        engine.addCommand(new DelayedTypeCommand(300, '3'));
        engine.addCommand(new DelayedTypeCommand(500, '5'));
        engine.addCommand(new DelayedTypeCommand(700, '7'));

        Command stopCommand = new Command() {
            @Override
            public void execute() throws Exception {
                stop = true;
            }
        };

        engine.addCommand(new SleepCommand(5000, engine, stopCommand));
        engine.run();
    }
}
