import java.util.*;

public class Market implements IQueueBehaviour {
    LinkedList<Buyer> buyers = new LinkedList<>();
    Set<Product> products;



    public Market(Set<Product> products) {
        System.out.println("Магазин открыт!");
        this.products = products;

    }

    @Override
    public void marketBehaviour(Buyer buyer) {
        if (!buyer.getInQueue() && buyer.getOrder() != null) {
            buyers.add(buyer);
            buyer.setInQueue(true);
        }
    }

    public Buyer getBuyer() {

        return buyers.pollFirst();
    }

    @Override
    public void update(Order order) {
        for (Product product: products) {
            if (product.name.equals(order.product)) {
                if (product.getQuantity() >= order.quantity) {
                    product.setQuantity(product.getQuantity() - order.quantity);
                    order.setIssue(true);
                    System.out.println(order.product + order.quantity + "Товар выдан");
                } else {
                    System.out.println("Не могу выдать заказ. Недостаточное количество товара");
                }
            }
        }
    }
}
