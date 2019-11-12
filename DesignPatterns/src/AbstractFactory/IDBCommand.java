package AbstractFactory;

public abstract class IDBCommand {
    public abstract void CommandText(String ctx);
    public abstract void SetConnection(IDBConnection connection);
}
