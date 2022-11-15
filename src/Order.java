import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private int numOfPeople;
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
         return null;
    }


    public void addToOrder(Item p) {
        order.add(p);
        System.out.println(p);
        System.out.println(p.getPrice());
        this.total += p.getPrice();
        System.out.println(total);

    }

    public void placeOrder(int numOfPeople) throws FileNotFoundException {
        this.numOfPeople = numOfPeople;
        Order thisOrder = new Order();
        Menu thisMenu = new Menu();
        thisMenu.createDefaultMenu(thisMenu);
        defaultMenu = thisMenu.getMenu();
        thisMenu.format();
        int i = 0;
        System.out.println("");

        while(i < numOfPeople) {

            Scanner start = new Scanner(System.in);
            System.out.println("Enter Starter:");
            String Starter = start.nextLine();
            thisOrder.addToOrder(selectItem(Starter));
            System.out.println(total);

            Scanner main = new Scanner(System.in);
            System.out.println("Enter Main Course:");
            String mainCourse = main.nextLine();
            thisOrder.addToOrder(selectItem(mainCourse));
            System.out.println(total);

            Scanner dessert = new Scanner(System.in);
            System.out.println("Enter Dessert:");
            String des = dessert.nextLine();
            thisOrder.addToOrder(selectItem(des));
            System.out.println(total);
            i++;
        }

        System.out.println(total);
    }



}