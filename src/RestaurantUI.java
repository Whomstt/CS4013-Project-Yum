import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantUI {
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    private Scanner in;
    public RestaurantUI() {
        in = new Scanner(System.in);
    }
    public void run(Restaurant restaurant) throws IOException {
        boolean more = true;
        while(more) {
            System.out.println("(P)lace reservation  (S)how Reservations  (Q)uit");
            String command = in.nextLine().toUpperCase();
            if (command.equals("P")) {
                System.out.println("Enter Reservation Name:");
                String name = in.nextLine();
                System.out.println("Enter Reservation Day:");
                String day = in.nextLine();
                System.out.println("Enter Reservation Time:");
                String time = in.nextLine();
                System.out.println("Enter Number of People:");
                String numberOfPeople = in.nextLine();
                System.out.println("Enter phone number:");
                String phoneNumber = in.nextLine();
                Reservation reservation = new Reservation(name, day, time, numberOfPeople, phoneNumber);
                reservations.add(reservation);
            } else if (command.equals("Q")) {
                System.out.println("Exiting program... \uD83C\uDF46");
                more = false;

            } else if (command.equals("S")) {
                int i = 1;
                for (Reservation r : reservations) {
                    System.out.println("Reservation" + i);
                    System.out.println(r.toString() + "\n");
                    i++;
                }
            }
        }
    }
}