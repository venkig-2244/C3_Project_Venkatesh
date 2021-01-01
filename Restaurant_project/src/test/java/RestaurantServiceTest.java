import org.junit.jupiter.api.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class RestaurantServiceTest {

    private static RestaurantService service = new RestaurantService();
    private static Restaurant restaurant;

    private static LocalTime openingTime ;
    private static LocalTime closingTime ;

    // Implemented by Venkatesh G
    @BeforeAll
    public static void beforeAll() {

        openingTime = LocalTime.parse("10:30:00");
        closingTime = LocalTime.parse("22:00:00");

    }

    // Implemented by Venkatesh G
    @BeforeEach
    public void beforeEach() {

        restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
    }

    // Implemented by Venkatesh G
    @AfterEach
    public void afterEach() throws restaurantNotFoundException {
        List<Restaurant> restaurants = service.getRestaurants ();
        restaurants.clear ();
    }

    //>>>>>>>>>>>>>>>>>>>>>>SEARCHING<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void searching_for_existing_restaurant_should_return_expected_restaurant_object() throws restaurantNotFoundException {

        // Implemented by Venkatesh G
        Restaurant res = service.findRestaurantByName ("Amelie's cafe");
        assertNotNull (res);
    }

    @Test
    public void searching_for_non_existing_restaurant_should_throw_exception() throws restaurantNotFoundException {
        // Implemented by Venkatesh G
        Restaurant res = service.findRestaurantByName ("My Punjabi Dhaba");
        assertNull (res);
    }
    //<<<<<<<<<<<<<<<<<<<<SEARCHING>>>>>>>>>>>>>>>>>>>>>>>>>>




    //>>>>>>>>>>>>>>>>>>>>>>ADMIN: ADDING & REMOVING RESTAURANTS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @Test
    public void remove_restaurant_should_reduce_list_of_restaurants_size_by_1() throws restaurantNotFoundException {

        int initialNumberOfRestaurants = service.getRestaurants().size();
        service.removeRestaurant("Amelie's cafe");
        assertEquals(initialNumberOfRestaurants-1, service.getRestaurants().size());
    }

    @Test
    public void removing_restaurant_that_does_not_exist_should_throw_exception() throws restaurantNotFoundException {
        assertThrows(restaurantNotFoundException.class,()->service.removeRestaurant("Pantry d'or"));
    }

    @Test
    public void add_restaurant_should_increase_list_of_restaurants_size_by_1(){

        int initialNumberOfRestaurants = service.getRestaurants().size();
        service.addRestaurant("Pumpkin Tales","Chennai",LocalTime.parse("12:00:00"),LocalTime.parse("23:00:00"));
        assertEquals(initialNumberOfRestaurants + 1,service.getRestaurants().size());
    }
    //<<<<<<<<<<<<<<<<<<<<ADMIN: ADDING & REMOVING RESTAURANTS>>>>>>>>>>>>>>>>>>>>>>>>>>

    // Implemented by Venkatesh G
    @Test
    public void getting_cost_for_food_items_in_existing_restaurant_should_return_total_cost() {
        ArrayList<String> selectedItems = new ArrayList<String> ();
        selectedItems.add ("Sweet corn soup");
        selectedItems.add ("Vegetable lasagne");

        int totalCost = service.getTotalCostForOrder("Amelie's cafe", selectedItems);

        assertEquals (388, totalCost);
    }

    // Implemented by Venkatesh G
    @Test
    public void getting_cost_for_food_items_in_existing_restaurant_should_return_minus_one() {
        ArrayList<String> selectedItems = new ArrayList<String> ();
        selectedItems.add ("Stuffed Parota");
        selectedItems.add ("Salt Lassi");

        // "Mini Punjabi Dhaba" does not exists in the restaurant list.
        // Following call is expected to fail.
        int totalCost = service.getTotalCostForOrder("Mini Punjabi Dhaba", selectedItems);

        assertEquals (-1, totalCost);
    }
}