public class Customer extends Person {
    private double money;
    private String phoneNum;
    private String email;

    public Customer(String name, String age, double money, String phoneNum, String email) {

        super(name, age);
        this.phoneNum = phoneNum;
        this.email = email;
        this.money = money;
    }
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void buyProduct(){

    }
}
