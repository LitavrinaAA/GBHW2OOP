public class Order {
    Integer id;
    String product;
    Integer quantity;
    Boolean isIssue;

    public Order(Integer id, String product, Integer quantity, Boolean isIssue) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.isIssue = isIssue;
    }
}
