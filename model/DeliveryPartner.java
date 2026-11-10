package model;

public class DeliveryPartner extends User {

    private String currLoc;
    private boolean offline;
    private double earnings;

    public DeliveryPartner(int id, String name, String phone, String email, String pass, String currLoc) {
        super(id, name, phone, email, pass);
        this.currLoc = currLoc;
        this.offline = true;
        this.earnings = 0.0;
    }

    public void goOnline() {
        this.offline = false;
    }

    public void goOffline() {
        this.offline = true;
    }

    public double getEarnings() {
        return earnings;
    }

    public void addEarnings(int amnt) {
        earnings +=amnt;
    }

    @Override
    public String getRole() {
        return "Delivery Partner";
    }
}
