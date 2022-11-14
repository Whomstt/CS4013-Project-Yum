public class Staff extends Person{
 private String occupation;

    public Staff(String name, String age, String occupation) {
        super(name, age);
        this.occupation = occupation;

    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


}
