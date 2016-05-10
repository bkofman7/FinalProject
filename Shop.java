package FinalProject;
import java.util.ArrayList;

/**
 * Write a description of class Shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shop
{
    private ArrayList<Item> availableItems = new ArrayList<Item>();
    public Shop() 
    {
        for (int x = 0; x < 5; x++) {
            String[] types = Item.getTypes();
            for (String type: types) {
                Item item = new Item(type);
                availableItems.add(item);
            }
        }
    }
}
