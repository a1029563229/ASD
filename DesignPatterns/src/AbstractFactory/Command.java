package AbstractFactory;

public class Command {
    public static void main(String[] args) {
        EmployeeDAO employee = new EmployeeDAO(new SqlDBFactory());
        employee.GetEmployee();
    }
}
