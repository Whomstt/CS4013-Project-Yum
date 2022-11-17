import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Reservation {
    private LocalDateTime localDateTime;
    private String name;
    private String day;
    private String time;
    private String numOfPeople;
    private String phoneNumber;
    private String customerID;
    private String tableNumber;
    private File file = new File("./Reservations.csv");
    private PrintWriter out = new PrintWriter(new FileOutputStream(file, true));

    public Reservation(int reservationID, String name, String day, String time, String numOfPeople, String phoneNumber) throws IOException {
        this.name = name;
        this.day = day;
        this.time = time;
        this.numOfPeople = numOfPeople;
        this.phoneNumber = phoneNumber;
        localDateTime = LocalDateTime.now();
        out.print("\n" + reservationID + "," + numOfPeople + "," + day + "," + time + "," + tableNumber + "," + customerID);
        out.close();

    }

    public String toString() {
        return "" + "Name: " + name + " Day: " + day + " Time: " + time + " Number Of People: " + numOfPeople + " Phone Number: " + phoneNumber;
    }
}