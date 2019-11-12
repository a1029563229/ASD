package AbstractFactory;

public class SqlConnection extends IDBConnection {

    @Override
    public void ConnectionString(String ctx) {
        System.out.println(ctx);
    }
}
