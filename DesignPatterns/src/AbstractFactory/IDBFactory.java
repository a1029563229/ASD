package AbstractFactory;

public abstract class IDBFactory {
    public abstract IDBConnection createDBConnection();
    public abstract IDBCommand createDBCommand();
    public abstract IDataReader createDataReader();
}
