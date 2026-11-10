package model;

public abstract class User {
    private int id;
    private String name;
    private String phno;
    private String email;
    private String pass;
    private boolean blocked;

    public User(int id, String name, String phno, String email, String pass) {
        this.id = id;
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.pass = pass;
        this.blocked =  false;
    }

    public int getId() {
        return id;
    } 

    public String getName() {
        return name;
    }

    public String getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void block() {
        blocked = true;
    }

    public void unblock() {
        blocked = false;
    }

    public boolean checkPassword(String pass) {
        return this.pass.equals(pass);
    } 

    public abstract String getRole();
}