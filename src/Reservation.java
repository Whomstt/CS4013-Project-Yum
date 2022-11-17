import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Reservation {
    private LocalDateTime localDateTime;
    private String name;
    private String day;
    private String time;
    private String numOfPeople;
    private String phoneNumber;
    private String reservationID;
    private String customerID;

    public Reservation(String name, String day, String time, String numOfPeople, String phoneNumber) throws IOException {
        this.name = name;
        this.day = day;
        this.time = time;
        this.numOfPeople = numOfPeople;
        this.phoneNumber = phoneNumber;
        localDateTime = LocalDateTime.now();
    }

    public String toString() {
        return "" + "Name: " + name + " Day: " + day + " Time: " + time + " Number Of People: " + numOfPeople + " Phone Number: " + phoneNumber;
    }
}