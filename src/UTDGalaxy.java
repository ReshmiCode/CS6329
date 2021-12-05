import java.util.ArrayList;
import java.util.List;

public class UTDGalaxy {
    List<CustomerRecord> customers;

    public UTDGalaxy() {
        customers = new ArrayList<CustomerRecord>();
        customers.add(new CustomerRecord("Sarah Jane", 1, "sxj@utdallas.edu", "password", 2035244567));
        customers.add(new CustomerRecord("Matt Smith", 2, "mms@utdallas.edu", "password", 2145244333));
        customers.add(new CustomerRecord("Test User", 3, "test", "test", 2145242939));
    }

    public int validateLogIn(String email, String password) {
        for (CustomerRecord customer : customers) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer.getId();
            }
        }
        return -1;
    }

    public CustomerRecord getRecord(int id) {
        for (CustomerRecord customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
}
