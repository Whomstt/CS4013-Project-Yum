import java.util.ArrayList;

public class Moneyset {
    private double currentMoney;
    private ArrayList<Money> Money1;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void addCoin(Money choice) {
        Money1.add(choice);
        balance += choice.getValue();
    }
    public void removeMondey(){
        double savedMoney =  currentMoney +  currentMoney;
        Money1.clear();
    }
}
