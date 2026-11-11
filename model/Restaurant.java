package model;

import java.time.LocalTime;

public class Restaurant {

    private int id;
    private User owner;
    private String name;
    private String phone;
    private String location;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private RestaurantStatus status;
    private boolean acceptingOrders;
    private Menu menu;

    public Restaurant(int id, User owner, String name,
                      String phone, String location,
                      LocalTime openingTime, LocalTime closingTime) {

        this.id = id;
        this.owner = owner;
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;

        this.status = RestaurantStatus.PENDING;
        this.acceptingOrders = false;
        this.menu = new Menu();
    }

    public int getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getLoc() {
        return location;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public RestaurantStatus getStatus() {
        return status;
    }

    public boolean isAcceptingOrders() {
        return acceptingOrders;
    }

    public void setStatus(RestaurantStatus status) {
        this.status = status;
    }

    public void setAcceptingOrders(boolean acceptingOrders) {
        this.acceptingOrders = acceptingOrders;
    }

    public Menu getMenu() {
        return menu;
    }

    public boolean isOpen() {
        LocalTime curr = LocalTime.now();

        return !curr.isBefore(openingTime) && !curr.isAfter(closingTime);
    }

    public boolean canAcceptOrders() {
        return status == RestaurantStatus.APPROVED
           && acceptingOrders
           && isOpen(LocalTime.now());
    }
}
