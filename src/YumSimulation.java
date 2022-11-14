import java.io.IOException;

public class YumSimulation {
    public static void main(String[] args) throws IOException
    {
        Restaurant restaurant = new Restaurant("Restaurant1");
        RestaurantUI restaurantUI = new RestaurantUI();
        restaurantUI.run(restaurant);
    }
}
