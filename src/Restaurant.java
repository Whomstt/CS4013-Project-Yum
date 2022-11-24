public class Restaurant {
    private String restaurantID;
    private int capacity;

    public Restaurant(String restaurantID){
        this.restaurantID = restaurantID;
    }
    public String getRestaurantID() {
        return restaurantID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setRestaurantID(String restaurantID) {
        this.restaurantID = restaurantID;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
