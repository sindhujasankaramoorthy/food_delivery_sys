package model;

public class RestaurantOwner extends User {

    public Customer(int id, String name, String phone,
                    String email, String password) {

        super(id, name, phone, email, password);
    }

    @Override
    public String getRole() {
        return "Restaurant owner";
    }
}
