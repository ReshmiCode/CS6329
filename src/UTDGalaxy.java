import java.util.ArrayList;
import java.util.List;

public class UTDGalaxy {
    List<String> customers; // change type to CustomerRecord class

    public UTDGalaxy() {
        customers = new ArrayList<>();
        customers.add("Sarah");
    }

    public int validateLogIn(String email, String password) {
        for (String customer : customers) {
            if (customer.equals(email) && customer.equals(password)) { // add .getEmail() etc.
                return 0; // replace
                //return customers.get(i).getId();
            }
        }
        return -1;
    }

    public String getRecord(int id) { // replace type with CustomerRecord
        for (String customer : customers) {
            if (customer.equals(id)) { // .getId
                return customer;
            }
        }
        return null;
    }
}
