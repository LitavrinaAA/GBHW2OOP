public class Product {

    final public String name;
    private Integer quantity;

    public Product( String name, Integer quantity) {
        this.quantity = quantity;
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
