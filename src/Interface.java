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
            String email = reader.nextLine();
            System.out.println("Enter your password:");
            String password = reader.nextLine();
            restaurantList = controller.logIn(email, password);
            if(restaurantList == null) {
                System.out.println("Invalid login. Try again.");
            }
        } while(restaurantList == null);

        // return of displayResterauntList
        for(Restaurant restaurant: restaurantList) {
            System.out.println(restaurant.getId() + "\t" + restaurant.getName());
        }
        System.out.println("Finalize choice\tID: -1");

        // loop for !choosenRestaurant
        int choice = 0;
        while(choice != -1) {
            System.out.println("What is the ID of the restaurant you want to get more details about?");
            choice = reader.nextInt();
            if(choice == -1) break;
            String restaurant = controller.viewRestaurant(choice);
            System.out.println(restaurant == null ? "Invalid ID. Try again." : controller.viewRestaurant(choice));
        }

        System.out.println("What is the ID of the restaurant you want to order from?");
        choice = reader.nextInt();
        System.out.println(controller.finalizeRestaurant(choice));
        choice = 0;
        int quantity = 0;
        while(choice != -1) {
            System.out.println("What is the ID of the item you want to add to your order? Enter -1 to stop adding items.");
            choice = reader.nextInt();
            if(choice == -1) break;
            System.out.println("How many of this item would you like to add to your order?");
            quantity = reader.nextInt();
            Order updatedOrder  = controller.addItem(choice, quantity);
            System.out.println(updatedOrder == null ? "Invalid item ID" : "Current " + updatedOrder);
        }

        String [] waitingTimeAndBill = controller.finalizeOrder();
        System.out.println(waitingTimeAndBill[0] + "\t" + waitingTimeAndBill[1]);

        reader.nextLine(); // get rid of newline char
        boolean paid = false;
        do {
            System.out.println("Enter your credit card information in the format of {CC number} {CID} {Exp. Date in the form of 04/2021}");
            String creditCard = reader.nextLine();
            paid = controller.makePayment(creditCard);
            if(!paid) {
                System.out.println("Invalid card details. Try again.");
            }
        } while(!paid);

        System.out.println("Your Order has been completed.");

        reader.close();
    }
}
