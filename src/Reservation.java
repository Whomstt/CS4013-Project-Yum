import java.time.LocalDateTime;

public class Reservation {
    private LocalDateTime localDateTime;
    private String name;
    private String day;
    private String time;
    private String numberOfPeople;
    private String phoneNumber;

    public Reservation(String name, String day, String time, String numberOfPeople, String phoneNumber) {
        this.name = name;
        this.day = day;
        this.time = time;
        this.numberOfPeople = numberOfPeople;
        this.phoneNumber = phoneNumber;
        localDateTime = LocalDateTime.now();

    }
}