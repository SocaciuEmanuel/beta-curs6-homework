public class Product {
    private String name, category;
    private double price;
    private Integer quantity;

    public Product(String name, String category, double price, Integer quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public boolean hasStock() {
        //boolean answer = quantity != 0 ? return true : return false;
        if (quantity != 0) return true;
        else return false;
    }

    public boolean isCategory(String wantedCategory) {
        if (category.equals(wantedCategory)) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Product { " +
                "name = '" + name + '\'' +
                ", category = '" + category + '\'' +
                ", price = " + price +
                ", quantity = " + quantity +
                " }";
    }
}
