public class Money {

private double value;
private String name;
private String cardNum;
private String cvc;
private String expiryDate;
private Order order;
private  int cardAmount;
    private  int cashAmount;
    private int balanceAmount;
    private double cardBalanceAmount;
    private double cashBalanceAmount;

//public Money(int cardAmount, int cashAmount, int balanceAmount){
//    this.cardAmount = cardAmount;
//    this.cashAmount = cashAmount;
//    this.balanceAmount = balanceAmount;
//
//}
    public Money(){

    }

    public void addCardBalance( double cardAmount ){
        cardBalanceAmount += cardAmount;


    }
    public void addCashBalance( double cashAmount){
         cashBalanceAmount += cashAmount;

    }
    public double getCashBalance(){
        return cashBalanceAmount;
    }
    public double getCardBalance(){
        return cardBalanceAmount;
    }
    public double getTotalPrice() {
        return order.getTotal();
    }


}


