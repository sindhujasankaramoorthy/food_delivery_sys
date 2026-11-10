
package model;

public class Customer extends User {

    private String location;

    public Customer(int id, String name, String phone,
                    String email, String password, String location) {

        super(id, name, phone, email, password);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getRole() {
        return "Customer";
    }
}
