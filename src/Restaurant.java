public class Restaurant {
    private String RestaurantID;
    private int Capacity;

    public Restaurant(String RestaurantI){

    }
    public String getRestaurantID() {
        return RestaurantID;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setRestaurantID(String restaurantID) {
        RestaurantID = restaurantID;
    }

    public void setCapacity(int capacity) {
        Capacity = capacity;
    }

    public void mergeTableCapacity(int capacity, int capacity2,int tableNo, int tableNo2) {
//        Capacity = capacity + capacity2;
//        if(tableNo < tableNo2 ){
//            TableNo = tableNo;
//        }else{
//            TableNo = tableNo2;
//        }
    }
}
