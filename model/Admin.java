package model;

public class Admin extends User {
    
    public Admin(int id, String name, String phno, String email, String pass) {
        super(id, name, phno, email, pass);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}