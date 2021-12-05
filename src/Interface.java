import java.util.List;
import java.util.Scanner;

public class Interface {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        Controller controller = new Controller();

        // call of login
        List<Restaurant> restaurantList = null;
        do {
            System.out.println("Enter your email:");
            String email = reader.next();
            System.out.println("Enter your password:");
            String password = reader.next();
            restaurantList = controller.logIn(email, password);
            if(restaurantList == null) {
                System.out.println("Invalid login");
            }
        } while(restaurantList == null);

        // return of displayResterauntList
        for(Restaurant restaurant: restaurantList) {
            System.out.println(restaurant.getName() + "\tID: " + restaurant.getId());
        }
        System.out.println("Finalize choice\tID: -1");

        // loop for !choosenRestaurant
        int choice = 0;
        while(choice != -1) {
            System.out.println("What is the ID of the restaurant you want to get more details about?");
            choice = reader.nextInt();
            if(choice == -1) break;
            System.out.println(controller.viewRestaurant(choice));
        }

        controller.finalizeRestaurant(choice);


        reader.close();
    }
}
