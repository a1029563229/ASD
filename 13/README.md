# COMMAND 模式和 ACTIVE OBJECT 模式

## COMMAND 模式

```java
public interface Command {
  public void do();
  public void undo();
}
```

## ACTIVE OBJECT 模式

```java
import java.util.LinkedList;
import java.util.Iterator;

public class ActiveObjectEngine {
  LinkedList itsCommands = new LinkedList();

  public void addCommand(Command c) {
    itsCommands.add(c);
  }

  public void run() {
    while (!itsCommands.isEmpty()) {
      Command c = (Command) itsCommands.getFirst();
      itsCommands.removeFirst();
      c.execute();
    }
  }
}

public interface Command {
  public void execute() throws Exception;
}
```

