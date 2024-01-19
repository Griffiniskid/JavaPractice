import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private List<MenuItem> menuItems;

    public Cafe() {
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void removeMenuItem(int index) {
        menuItems.remove(index);
    }

    public double getAverageRating() {
        double totalRating = 0;
        int count = 0;
        for (MenuItem menuItem : menuItems) {
            totalRating += menuItem.getRating();
            count++;
        }
        return totalRating / count;
    }
}

class MenuItem {

    private String name;
    private double price;
    private int rating;

    public MenuItem(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

public class Main {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        cafe.addMenuItem(new MenuItem("Coffee", 1.0, 4));
        cafe.addMenuItem(new MenuItem("Tea", 2.0, 5));
        cafe.addMenuItem(new MenuItem("Sandwich", 3.0, 3));

        System.out.println("Average rating: " + cafe.getAverageRating());
    }
}
