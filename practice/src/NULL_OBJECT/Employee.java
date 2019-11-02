package NULL_OBJECT;

import java.util.Date;

public interface Employee {
    public boolean isTimeToPay(Date payDate);

    public void pay();

    public static final Employee NULL = new Employee() {
        @Override
        public boolean isTimeToPay(Date payDate) {
            return false;
        }

        @Override
        public void pay() {

        }
    };
}
