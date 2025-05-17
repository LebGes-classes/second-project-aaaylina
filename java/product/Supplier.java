package product;

public enum Supplier {
    SUPPLIER1("Pop", "инструменты"),
    SUPPLIER2("Barabulka", "косметика"),
    SUPPLIER3("Z", "травы(чайные)"),
    SUPPLIER4("Balerina", "пища для ума"),
    SUPPLIER5("Capuchina", "одежда");

    private final String name;
    private final String category;


    Supplier(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
