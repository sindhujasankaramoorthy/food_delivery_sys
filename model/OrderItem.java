package model;

public class OrderItem {
    private Item item;
    private int qty;
    private double price;

    public OrderItem(Item item, int qty, int price) {
        this.item = item;
        this.qty = qty;
        this.price = price;
    }

    public Item getItem() {
        return item;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return price * qty;
    }
}