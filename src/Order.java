import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Order {
    private ArrayList<Item> order = new ArrayList<Item>();
    private ArrayList<Item> defaultMenu;
    private double total;

    public Order () throws FileNotFoundException {
        Menu thisMenu = new Menu();
        thisMenu.createDefaultMenu(thisMenu);
        defaultMenu = thisMenu.getMenu();
    }


    public Item selectItem(String i) {
        for (Item p : defaultMenu) {
                if (i.equals(p.getName())) {
                    return p;
                }
            }
            System.out.println("not on menu try again");

        return new Item("error", 0, "");
    }


    public void addToOrder(Item p) {
        order.add(p);
        this.total += p.getPrice();


    }

    public void placeOrder() throws FileNotFoundException {
        Menu thisMenu = new Menu();
        thisMenu.createDefaultMenu(thisMenu);
        defaultMenu = thisMenu.getMenu();
        thisMenu.format();
        int i = 0;
        System.out.println("");

        boolean orderFinished = false;

        while(orderFinished == false) {



            Scanner start = new Scanner(System.in);
            System.out.println("Enter Starter:");
            String Starter = start.nextLine().toLowerCase();
            while(selectItem(Starter).getName().equals("error")) {
                System.out.println("Enter Starter:");
                Starter = start.nextLine().toLowerCase();
            }
            addToOrder(selectItem(Starter));


            Scanner main = new Scanner(System.in);
            System.out.println("Enter Main Course:");
            String mainCourse = main.nextLine().toLowerCase();
            while(selectItem(mainCourse).getName().equals("error")) {
                System.out.println("Enter Main Course:");
                mainCourse = start.nextLine().toLowerCase();
            }
            addToOrder(selectItem(mainCourse));

            Scanner dessert = new Scanner(System.in);
            System.out.println("Enter Dessert:");
            String des = dessert.nextLine().toLowerCase();
            while(selectItem(des).getName().equals("error")) {
                System.out.println("Enter Dessert:");
                des = start.nextLine().toLowerCase();
            }
            addToOrder(selectItem(des));

            Scanner finished = new Scanner(System.in);

            System.out.println("Are you finished ordering (Y/N)");
            String fin = finished.nextLine().toLowerCase();

            if (fin.equals("y")) {
                orderFinished = true;
            }
        }

        System.out.println("Your total for this meal is €"+ total);
    }



}