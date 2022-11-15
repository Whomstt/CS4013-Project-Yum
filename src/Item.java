public class Item {
    private String name;
    private double price;
    private String type;
    private int No;


    public Item(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public String getType() {
        return type;
    }


    public String toString() {
        return name + " €" + price;
    }

    public int getNo(int i) {
        return No;
    }
}
