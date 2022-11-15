import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Order {
    private int numOfPeople;
    private ArrayList<Item> order;
    private double total = 0;


    public void placeOrder(int numOfPeople) throws FileNotFoundException {
        this.numOfPeople = numOfPeople;
        Menu thisMenu = new Menu();
        thisMenu.createDefaultMenu(thisMenu);
        thisMenu.format();
    }



}