
package model;

public class Item {

    private int id;
    private String name;
    private double price;
    private String category;
    private boolean veg;
    private boolean available;

    public Item(int id, String name, double price, String category, boolean veg) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.veg = veg;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isVeg() {
        return veg;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    public void markAvailable() {
        available = true;
    }

    public void markOutOfStock() {
        available = false;
    }
}
