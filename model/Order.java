package model;

import java.util.List;
import java.util.ArrayList;

public class Order {

    private int id;
    private Customer customer;
    private Restaurant restaurant;
    private List<OrderItem> items;
    private double subTotal;
    private PaymentMode paymentMode;
    private OrderStatus status;

    public Order(int id, Customer customer, Restaurant restaurant,
                 List<OrderItem> items, PaymentMode paymentMode) {

        this.id = id;
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>(items);
        this.paymentMode = paymentMode;
        this.status = OrderStatus.PLACED;

        subTotal = 0;

        for (OrderItem x : items) {
            subTotal += x.getTotal();
        }
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public boolean updateStatus(OrderStatus newStatus) {

        if (status == OrderStatus.PLACED &&
            (newStatus == OrderStatus.ACCEPTED ||
            newStatus == OrderStatus.REJECTED ||
            newStatus == OrderStatus.CANCELLED)) {

            status = newStatus;
            return true;
        }

        if (status == OrderStatus.ACCEPTED &&
            newStatus == OrderStatus.READY) {

            status = newStatus;
            return true;
        }

        if (status == OrderStatus.READY &&
            newStatus == OrderStatus.PICKED_UP) {

            status = newStatus;
            return true;
        }

        if (status == OrderStatus.PICKED_UP &&
            newStatus == OrderStatus.DELIVERED) {

            status = newStatus;
            return true;
        }

        return false;
    }
}