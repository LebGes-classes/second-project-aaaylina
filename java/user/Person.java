package user;

import product.Location;

public abstract class Person {
    private String name;
    private String phone;
    private String email;
    private Location location;

    public Person(String name, String phone, String email, Location location) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.location = location;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public Location getLocation() { return location; }

}
