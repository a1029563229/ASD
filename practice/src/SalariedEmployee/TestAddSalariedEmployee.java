package SalariedEmployee;

import junit.framework.*;
public class TestAddSalariedEmployee extends TestCase {
    public void testAddSalariedEmployee() {
        int empId = 1;
        AddSalariedEmployee t = new AddSalariedEmployee(empId,"Bob", "Home", 1000.00);
        t.Execute();

        Employee e =
    }
}
