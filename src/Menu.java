import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Menu {
    private ArrayList<Item> menu = new ArrayList<>();
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
            System.out.println(I.toString());
        }
        System.out.println("");
        System.out.println("MAIN COURSES");
        for (Item I : menu)
            if(I.getType() == "Main Course") {
                System.out.println(I.toString());
            }
        System.out.println("");
        System.out.println("DESSERTS");
        for (Item I : menu)
            if(I.getType() == "Dessert") {
                System.out.println(I.toString());
            }
    }

    public void createDefaultMenu(Menu defaultMenu) throws FileNotFoundException {
        defaultMenu.addItem("chicken" , 12.50, "Main Course");
        defaultMenu.addItem("beef" , 15, "Main Course");
        defaultMenu.addItem("burger" , 12, "Main Course");
        defaultMenu.addItem("salad" , 8, "Main Course");
        defaultMenu.addItem("ice cream" , 7, "Dessert");
        defaultMenu.addItem("bread" , 3, "Starter");
        defaultMenu.addItem("sandwich" , 8, "Starter");
        defaultMenu.addItem("wings" , 6, "Starter");
        defaultMenu.addItem("soup" , 4, "Starter");
        defaultMenu.addItem("apple tart" , 5, "Dessert");
        defaultMenu.addItem("pudding" , 6.50, "Dessert");
        defaultMenu.addItem("curry" , 10, "Main Course");
        defaultMenu.addItem("lasagna" , 12, "Main Course");
        defaultMenu.addItem("s" , 0, "");

        defaultMenu.out.close();
    }

    public ArrayList<Item> getMenu() {
        return menu;
    }




}

