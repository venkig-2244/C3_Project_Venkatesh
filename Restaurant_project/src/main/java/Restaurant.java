import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;
    private List<Item> menu = new ArrayList<Item>();

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public boolean isRestaurantOpen() {

        // Implemented by Venkatesh G
        LocalTime currTime = getCurrentTime ();
        if (currTime.compareTo (this.openingTime) > 0 && currTime.compareTo (this.closingTime) < 0) {
            return true;
        }
        return false;
    }

    public LocalTime getCurrentTime(){ return  LocalTime.now(); }

    public List<Item> getMenu() {
        // Implemented by Venkatesh G
        return menu;

    }

    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }

    /*
        Implemented by Venkatesh G
        Returns total cost of selected items
     */
    public int getTotalCostOfItems(ArrayList<String> selectedItems) {

        int totalCost = 0;
        try {
            throw new NoSuchMethodException ("Method yet to be implemented.");
        }
        /*
            Reset total cost to 0 and report an error incase selected item is not found the passed array.
            This condition must not occur.
         */
        catch (Exception e) {
            System.out.println (e.getMessage ());
            totalCost = -1;
        }


        return totalCost;
    }
}
