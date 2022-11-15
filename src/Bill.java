public class Bill {
    private int numberOfPeople;
    private double tips;

    public Bill(double total, int numberOfPeople) {

        this.numberOfPeople = numberOfPeople;
    }

    public Bill(double total, int numberOfPeople, double tips) {

        this.numberOfPeople = numberOfPeople;
        this.tips = tips;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getTips() {
        return tips;
    }

    public void setTips(double tips) {
        this.tips = tips;

    }

}
