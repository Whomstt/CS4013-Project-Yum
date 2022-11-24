public class Money {
    private double cardBalanceAmount;
    private double cashBalanceAmount;

    public Money() {
    }

    public void addCardBalance(double cardAmount) {
        cardBalanceAmount += cardAmount;

    }

    public void addCashBalance(double cashAmount) {
        cashBalanceAmount += cashAmount;

    }

    public double getCashBalance() {
        return cashBalanceAmount;
    }

    public double getCardBalance() {
        return cardBalanceAmount;
    }

}


