package AbstractFactory;

public class EmployeeDAO {
    IDBFactory dbFactory;

    public EmployeeDAO(IDBFactory idbFactory) {
        dbFactory = idbFactory;
    }

    public void GetEmployee() {
        IDBConnection connection = dbFactory.createDBConnection();
        connection.ConnectionString("connection...");

        IDBCommand command = dbFactory.createDBCommand();
        command.CommandText("command...");
        command.SetConnection(connection);

        IDataReader reader = dbFactory.createDataReader();
        reader.ExecuteReader();
    }
}
