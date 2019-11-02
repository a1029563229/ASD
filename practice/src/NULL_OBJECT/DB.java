package NULL_OBJECT;

import java.util.Date;

public class DB {
    public static Employee getEmployee(String name) {
        // if no exists
        return Employee.NULL;
    }

    public static void main() {
        Employee e = DB.getEmployee("bob");
        if (e.isTimeToPay(new Date())) {
            e.pay();
        }
    }
}
