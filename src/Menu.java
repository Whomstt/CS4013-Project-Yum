import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Menu {
    ArrayList<Item> Menu = new ArrayList<>();
    File csvFile = new File("Menu.csv");
    PrintWriter out = new PrintWriter(csvFile);

    public Menu() throws FileNotFoundException {
    }

    public  void addItem (String name, double price, String type) {
        Item newItem = new Item(name, price, type);
        Menu.add(newItem);
        for (Item item : Menu) {
            out.printf("%s, %d\n, %s", item.getName(), item.getPrice(), item.getType());

        }
             out.close();
    }

}

