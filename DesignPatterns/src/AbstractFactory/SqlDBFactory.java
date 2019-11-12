package AbstractFactory;

public class SqlDBFactory extends IDBFactory {

    @Override
    public IDBConnection createDBConnection() {
        return new SqlConnection();
    }

    @Override
    public IDBCommand createDBCommand() {
        return new SqlCommand();
    }

    @Override
    public IDataReader createDataReader() {
        return new SqlDataReader();
    }
}
