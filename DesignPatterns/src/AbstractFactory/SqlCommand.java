package AbstractFactory;

public class SqlCommand extends IDBCommand {

    @Override
    public void CommandText(String ctx) {
        System.out.println(ctx);
    }

    @Override
    public void SetConnection(IDBConnection connection) {
        System.out.println("Set Connection...");
    }
}
