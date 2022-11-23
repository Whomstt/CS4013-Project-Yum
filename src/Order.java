import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    private ArrayList<Item> order = new ArrayList<Item>();
    private ArrayList<Item> defaultMenu;
    private double total;
    private File csvFile;
    PrintWriter out;

    public Order() throws FileNotFoundException {
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
        System.out.println("Item not on menu try again");

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

        while (orderFinished == false) {


            Scanner start = new Scanner(System.in);
            System.out.println("Enter Starter (Press s to skip this course):");
            String Starter = start.nextLine().toLowerCase();
            while (selectItem(Starter).getName().equals("error")) {
                System.out.println("Enter Starter (Press s to skip this course):");
                Starter = start.nextLine().toLowerCase();
            }
            addToOrder(selectItem(Starter));


            Scanner main = new Scanner(System.in);
            System.out.println("Enter Main Course (Press s to skip this course):");
            String mainCourse = main.nextLine().toLowerCase();
            while (selectItem(mainCourse).getName().equals("error")) {
                System.out.println("Enter Main Course (Press s to skip this course):");
                mainCourse = start.nextLine().toLowerCase();
            }
            addToOrder(selectItem(mainCourse));

            Scanner dessert = new Scanner(System.in);
            System.out.println("Enter Dessert (Press s to skip this course):");
            String des = dessert.nextLine().toLowerCase();
            while (selectItem(des).getName().equals("error")) {
                System.out.println("Enter Dessert (Press s to skip this course):");
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


    }

    public double getTotal() {
        return total;
    }

    public void showBill() throws FileNotFoundException {
        csvFile = new File("Bills.csv");
        out = new PrintWriter(csvFile);
        System.out.println("--------------------------------");
        System.out.println("              BILL              ");
        for (int i = 0; i < order.size();i++) {
            System.out.println(order.get(i));
       }
        System.out.println();
        System.out.println("Your total is €"+ total);
        System.out.println("Thanks for dining with Yum");
        System.out.println("--------------------------------");


        out.println(total);
        out.close();
    }





}