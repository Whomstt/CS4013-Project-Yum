public class Restaurant {
    private int RestaurantID;
    private int TableNo;
    private int Capacity;

    public Restaurant(){
    }

    public int getRestaurantID() {
        return RestaurantID;
    }

    public int getCapacity() {
        return Capacity;
    }

    public int getTableNo() {
        return TableNo;
    }

    public void setTableNo_setCapacity(int capacity, int capacity2,int tableNo, int tableNo2) {
        Capacity = capacity + capacity2;
        if(tableNo > tableNo2 ){
            TableNo = tableNo;
        }else{
            TableNo = tableNo2;
        }
    }
}
