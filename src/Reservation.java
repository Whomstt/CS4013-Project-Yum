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
    private String reservationID;
    private File fileReserves = new File("./Reservations.csv");
    private File fileTables = new File("./Tables.csv");
    private PrintWriter outReserves = new PrintWriter(new FileOutputStream(fileReserves, true));
    private PrintWriter outTables = new PrintWriter(new FileOutputStream(fileTables, true));



    public Reservation(int reservationID, String name, String day, String time, String numOfPeople, String phoneNumber) throws IOException {
        this.name = name;
        this.day = day;
        this.time = time;
        this.numOfPeople = numOfPeople;
        this.phoneNumber = phoneNumber;
        localDateTime = LocalDateTime.now();
        outReserves.print("\n" + reservationID + "," + numOfPeople + "," + day + "," + time + "," + tableNumber + "," + customerID);
        outReserves.close();
    }

    public String checkIfTableFree() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Tables.csv"));
        String resultRow = "";
        String line;
        while ( (line = br.readLine()) != null ) {
            String[] values = line.split(",");
            if(values[1].equals(numOfPeople)) {
                resultRow = line;
                break;
            }
        }
        br.close();
        return resultRow;
    }

    public String toString() {
        return "" + "Name: " + name + " Day: " + day + " Time: " + time + " Number Of People: " + numOfPeople + " Phone Number: " + phoneNumber;
    }
}