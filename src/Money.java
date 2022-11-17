public class Money {

private double value;
private String name;
private String cardNum;
private String cvc;
private String expiryDate;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }


    public Money(double value, String  name) {
        this.name = name;
        this.value = value;
    }

    public Money( String cardNum, String cvc, String date){
         this.cardNum = cardNum;
         this.cvc = cvc;
         this.expiryDate = date;

        }


public double addMoney(){

    return 0;
}

}
