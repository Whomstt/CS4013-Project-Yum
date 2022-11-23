import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Reservation {
    private LocalDateTime localDateTime;
    private String name;
    private String day;
    private String time;
    private String numOfPeople;
    private String phoneNumber;
    private String customerID;
    private String tableNumber;
    private File fileReserves = new File("./Reservations.csv");
    private File fileTables = new File("./Tables.csv");
    private PrintWriter outReserves = new PrintWriter(new FileOutputStream(fileReserves, true));
    private PrintWriter outTables = new PrintWriter(new FileOutputStream(fileTables, true));


    public Reservation(String name, String day, String time, String numOfPeople, String phoneNumber, String tableNumber) throws IOException {
        this.name = name;
        this.day = day;
        this.time = time;
        this.numOfPeople = numOfPeople;
        this.phoneNumber = phoneNumber;
        int reservationID = (int) (Math.random() * 1000);
        localDateTime = LocalDateTime.now();
        outReserves.print("\n" + reservationID + "," + numOfPeople + "," + day + "," + time + "," + tableNumber + "," + name);
        outReserves.close();
    }

    public Reservation() throws IOException {

    }


    public String getNumOfPeople() {

        return numOfPeople;
    }

    public int getNumOfPeopleInt() {
        System.out.println("Number of people is " + numOfPeople);
        return Integer.parseInt(numOfPeople);
    }

        public void removeReservation (String reservationID){

        }

        public String toString () {
            return "" + "Name: " + name + " Day: " + day + " Time: " + time + " Number Of People: " + numOfPeople + " Phone Number: " + phoneNumber;
        }
    }
