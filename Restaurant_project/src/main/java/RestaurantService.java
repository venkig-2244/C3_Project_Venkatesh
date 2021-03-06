import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName){

        // Implemented by Venkatesh G
        Restaurant foundRestaurant = null;
        for (Restaurant currRestaurant : restaurants) {
            if (currRestaurant.getName().equals (restaurantName)) {
                foundRestaurant = currRestaurant;
                break;
            }
        }
        return foundRestaurant;
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);

        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        if (restaurantToBeRemoved == null)
            throw new restaurantNotFoundException(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    // Implemented by Venkatesh G
    public int getTotalCostForOrder(String restaurantName, ArrayList<String> menuItems) {
        int totalOrderCost = 0;
        Restaurant existingRestaurant = findRestaurantByName (restaurantName);
        if (existingRestaurant == null) {
            totalOrderCost = -1;
        }
        else {
            totalOrderCost = existingRestaurant.getTotalCostOfItems (menuItems);
        }
        return totalOrderCost;
    }
}
