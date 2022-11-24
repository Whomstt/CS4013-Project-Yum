import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantUI {
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private Scanner in;
    private Money money = new Money();
    private double total;
    Order thisOrder = new Order();
    Reservation thisReservation = new Reservation();

    public RestaurantUI() throws IOException {
        in = new Scanner(System.in);
    }

    public void run(Restaurant restaurant) throws IOException {
        boolean more = true;
        System.out.println("Select restaurant (1)Yum Diner, (2)Yum Pizza");
        int restaurantID = Integer.parseInt(in.nextLine());
        System.out.println("Login As (C)ustomer, (CH)ef, (W)aiter");
        String command = in.nextLine().toUpperCase();
        if (command.equals("C") || command.equals("CH") || command.equals("W"))
            while (more) {
                System.out.println("(P)lace reservation  (S)how Reservations  (R)emove Reservation  (T)ransaction  (O)rder  (Q)uit");
                command = in.nextLine().toUpperCase();
                if (command.equals("P")) {
                    System.out.println("(M)ake reservation  (C)heck Available Tables");
                    command = in.nextLine().toUpperCase();
                    if (command.equals("M")) {
                        System.out.println("Enter Reservation Name:");
                        String name = in.nextLine();
                        System.out.println("Enter Reservation Date:");
                        String day = in.nextLine();
                        System.out.println("Enter Reservation Time:");
                        String time = in.nextLine();
                        System.out.println("Enter Number of People:");
                        int numberOfPeople = in.nextInt();
                        System.out.println("Enter Table Number");
                        String tableNumber = in.next();
                        System.out.println("Enter phone number:");
                        String phoneNumber = in.next();
                        Reservation reservation = new Reservation(name, day, time, numberOfPeople, phoneNumber, tableNumber);
                        reservations.add(reservation);
                        thisReservation = reservation;
                    } else if (command.equals("C")) {
                        Scanner sc = new Scanner(new File("./Tables.csv"));
                        sc.useDelimiter(",");
                        while (sc.hasNext()) {
                            System.out.print(sc.next() + ", ");
                        }
                        System.out.println();
                        sc.close();
                    }
                } else if (command.equals("Q")) {
                    System.out.println("Exiting program...");
                    more = false;

                } else if (command.equals("O")) {
                    thisOrder.setRestaurantID(restaurantID);
                    thisOrder.placeOrder();
                    total = thisOrder.getTotal();
                } else if (command.equals("T")) {
                    System.out.println("(C)ard  (CA)sh  (S)how balance  (SP)lit  (P)ay order");
                    command = in.nextLine().toUpperCase();
                    if (command.equals("C")) {
                        System.out.println("Enter card amount");
                        double cardAmount = in.nextDouble();
                        money.addCardBalance(cardAmount);
                    } else if (command.equals("CA")) {
                        System.out.println("Enter cash amount");
                        double cashAmount = in.nextDouble();
                        money.addCashBalance(cashAmount);
                    } else if (command.equals("SP")) {
                        if (thisReservation.getNumOfPeople() == 0) {
                            System.out.println("error, You must add reservation first");
                        } else if (thisOrder.getTotal() == 0) {
                            System.out.println("error, You must order first");
                        } else {
                            System.out.println("Total amount is £ " + this.thisOrder.getTotal());
                            System.out.println("The bill is split by " + this.thisReservation.getNumOfPeople() + " People");
                            double v = thisOrder.getTotal() / thisReservation.getNumOfPeople();
                            System.out.println("The amount split is €" + v);
                        }
                    } else if (command.equals("S")) {
                        System.out.println("Balance amount: Cash " + money.getCashBalance() + " Card " + money.getCardBalance());
                    } else if (command.equals("P")) {
                        System.out.println("(C)ard  (CA)sh");
                        command = in.nextLine().toUpperCase();
                        if (command.equals("CA")) {
                            if (total == 0) {
                                System.out.println("Please order before attempting to pay");
                            } else if (money.getCashBalance() >= total) {
                                money.addCashBalance(-total);
                                System.out.println("Payment successful your change is €" + money.getCashBalance());
                                total = 0;
                            } else if (money.getCashBalance() < total) {
                                System.out.println("Payment unsuccessful insufficient cash");
                            }

                        }
                        if (command.equals("C")) {
                            if (total == 0) {
                                System.out.println("Please order before attempting to pay");
                            } else if (money.getCardBalance() >= total) {
                                money.addCardBalance(-total);
                                System.out.println("Payment successful your remaining balance is €" + money.getCardBalance());
                                total = 0;
                            } else if (money.getCardBalance() < total) {
                                System.out.println("Payment declined invalid credit");
                            }
                        }
                    }
                } else if (command.equals("S")) {
                    System.out.println(reservations.toString());

                } else if (command.equals("R")) {
                    System.out.println("Enter Reservation ID of booking you would like to cancel");
                    int reservationID = in.nextInt();
                    if (reservations.removeIf(r -> r.getReservationID() == reservationID)) {
                        System.out.println("Successfully removed booking ID " + reservationID);
                    } else System.out.println("No matches found for " + reservationID);
                }
            }
    }
}
