import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Reservation {
    private int reservationID;
    private LocalDateTime localDateTime;
    private String name;
    private String day;
    private String time;
    private int numOfPeople;
    private String phoneNumber;
    private String customerID;
    private String tableNumber;
    private File fileReserves = new File("./Reservations.csv");
    private File fileTables = new File("./Tables.csv");
    private PrintWriter outReserves = new PrintWriter(new FileOutputStream(fileReserves, true));
    private PrintWriter outTables = new PrintWriter(new FileOutputStream(fileTables, true));


    public Reservation(String name, String day, String time, int numOfPeople, String phoneNumber, String tableNumber) throws IOException {
        this.name = name;
        this.day = day;
        this.time = time;
        this.numOfPeople = numOfPeople;
        this.phoneNumber = phoneNumber;
        this.reservationID = (int) (Math.random() * 1000);
        localDateTime = LocalDateTime.now();
        outReserves.print("\n" + reservationID + "," + numOfPeople + "," + day + "," + time + "," + tableNumber + "," + name);
        outReserves.close();
    }

    public Reservation() throws IOException {

    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public int getReservationID() {
        return reservationID;
    }

    public String toString() {
        return "" + "Reservation ID: " + reservationID + " Name: " + name + " Day: " + day + " Time: " + time + " Number Of People: " + numOfPeople + " Phone Number: " + phoneNumber;
    }
}
