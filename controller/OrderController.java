package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class OrderController {
    private List<Order> orders;
    private int nextOrderId;

    public OrderController() {
        orders = new ArrayList<>();
        nextOrderId = 1;
    }

    public Order placeOrder(Customer customer, Cart cart, PaymentMode paymentMode) {
        List<OrderItem> orderItems = new ArrayList<>();

        for (CartItem x : cart.getItems()) {
            OrderItem item = new OrderItem(
                x.getItem(),
                x.getQuantity(),
                x.getItem().getPrice()
            );
            orderItems.add(item);
        }

        Order order = new Order(
            nextOrderId,
            customer,
            cart.getRestaurant(),
            orderItems,
            paymentMode
        );

        orders.add(order);
        nextOrderId++;

        cart.clearCart();

        return order;
    }

    public List<Order> getCustomerOrders(Customer customer) {
        List<Order> cust = new ArrayList<>();

        for(Order x: orders) {
            if(x.getCustomer().equals(customer)) {
                cust.add(x);
            }
        }
        return cust;
    }

    public List<Order> getRestaurantOrders(Restaurant restaurant) {
        List<Order> rest = new ArrayList<>();

        if(Order x: orders) {
            if(x.getRestaurant().equals(restaurant)) {
                cust.add(x);
            }
        }
        return rest;
    }

    public List<Order> getOrdersById(int id) {
        if(Order x: orders) {
            if(x.getId() == id) {
                return x;
            }
        }
        return null;
    }

    public boolean updateOrderStatus(int orderId, OrderStatus status) {
        for (Order x : orders) {
            if (x.getId() == orderId) {
                return x.updateStatus(status);
            }
        }
        return false;
    }
}