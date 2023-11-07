import java.util.*;

public class Market implements IQueueBehaviour {
    Map<Long,Buyer> buyers = new HashMap();
    Set<Product> products;

    Long countQueue = 0L;

    public Market(Set<Product> products) {
        System.out.println("Магазин открыт!");
        this.products = products;

    }

    @Override
    public void marketBehaviour(Buyer buyer) {
        if (!buyer.getInQueue()) {
            countQueue ++;
            buyers.put(countQueue, buyer);
            buyer.setInQueue(true);
            buyer.setIndexQueue( countQueue );
        } else{
            buyers.remove(buyer.getIndexQueue());
            buyer.setIndexQueue(-1L);
            buyer.setInQueue(false);
        }
    }

    @Override
    public void update(Order order) {
        for (Product product: products) {
            if (product.name.equals(order.product)) {
                product.setQuantity( product.getQuantity() - order.quantity);
                order.setIssue(true);
            }
        }
    }
}
