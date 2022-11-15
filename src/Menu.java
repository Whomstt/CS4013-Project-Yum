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
        out = new PrintWriter("Menu.csv");
        out.print("No, ");
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
        int i = 1;
        for (Item I : menu)
        if(I.getType() == "Starter") {
            System.out.print(i+",");
            i++;
            System.out.println(I.toString());
        }
        System.out.println("");
        System.out.println("MAIN COURSES");
        for (Item I : menu)
            if(I.getType() == "Main Course") {
                System.out.print(i+",");
                i++;
                System.out.println(I.toString());
            }
        System.out.println("");
        System.out.println("DESSERTS");
        for (Item I : menu)
            if(I.getType() == "Dessert") {
                System.out.print(i+",");
                i++;
                System.out.println(I.toString());
            }
    }

    public void createDefaultMenu(Menu defaultMenu) throws FileNotFoundException {
        defaultMenu.addItem("Chicken" , 17, "Main Course");
        defaultMenu.addItem("Beef" , 17, "Main Course");
        defaultMenu.addItem("Ice Cream" , 10, "Dessert");
        defaultMenu.addItem("Bread" , 6, "Starter");
        defaultMenu.addItem("Wings" , 6, "Starter");
        defaultMenu.addItem("Soup" , 4, "Starter");

        defaultMenu.out.close();
    }



}

