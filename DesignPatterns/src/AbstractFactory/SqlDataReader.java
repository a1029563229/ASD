package AbstractFactory;

public class SqlDataReader extends IDataReader {
    @Override
    public void ExecuteReader() {
        System.out.println("Sql Execute Reader...");
    }
}
