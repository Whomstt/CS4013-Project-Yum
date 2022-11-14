import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Menu {
    private ArrayList<Item> menu;
    private File csvFile;
    PrintWriter out;

    public Menu() throws FileNotFoundException {
        menu = new ArrayList<Item>();
        csvFile = new File("Menu.csv");
        out = new PrintWriter(csvFile);
        out.print("Name, ");
        out.print("Price, ");
        out.println("Type");
    }

    public  void addItem (String name, double price, String type) {
        Item newItem = new Item(name, price, type);
        menu.add(newItem);
        Item last = menu.get(menu.size() - 1);

            out.print(last.getName());
            out.print(", ");
            out.print(last.getPrice());
            out.print(", ");
            out.println(last.getType());

    }


    public void format() {
        System.out.println("STARTERS");
        for (Item I : menu)
        if(I.getType() == "Starter") {
            System.out.println(I.tString());
        }
        System.out.println("MAIN COURSES");
        for (Item I : menu)
            if(I.getType() == "Main Course") {
                System.out.println(I.tString());
            }
        System.out.println("DESSERTS");
        for (Item I : menu)
            if(I.getType() == "Dessert") {
                System.out.println(I.tString());
            }
    }



}

