import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantUI {
    private int reservationID = 1;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    private Scanner in;
    private Money money = new Money();
    public RestaurantUI() throws FileNotFoundException {
        in = new Scanner(System.in);
    }
    public void run(Restaurant restaurant) throws IOException {
        boolean more = true;
        while(more) {
            System.out.println("(P)lace reservation  (S)how Reservations  (R)emove Reservation (T)ransaction  (O)rder  (Q)uit");
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
                Reservation reservation = new Reservation(reservationID, name, day, time, numberOfPeople, phoneNumber);
                reservations.add(reservation);
                reservationID++;
            } else if (command.equals("Q")) {
                System.out.println("Exiting program... \uD83C\uDF46");
                more = false;

            } else if (command.equals("O")) {
                Order thisOrder = new Order();
                thisOrder.placeOrder();
            }


            else if (command.equals("T")) {
                System.out.println("(C)ard  (CA)sh  (S)how balance");
                command = in.nextLine().toUpperCase();
                if (command.equals("C")) {
                    System.out.println("Enter card amount");
                    double cardAmount = in.nextDouble();
                    money.addCardBalance(cardAmount);
                } else if(command.equals("CA")){
                    System.out.println("Enter cash amount");
                    double cashAmount = in.nextDouble();
                    money.addCashBalance(cashAmount);
                } else if(command.equals("S")){
                    System.out.println("Balance amount: Cash " + money.getCashBalance() + " Card " + money.getCardBalance());
                }
            }


            else if (command.equals("S")) {
                Scanner sc = new Scanner(new File("./Reservations.csv"));
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    System.out.print(sc.next() + ", ");
                }
                System.out.println();
                sc.close();
            } else if (command.equals("R")) {
                System.out.println("Enter Reservation ID of booking you would like to cancel");

            }
        }
    }
}