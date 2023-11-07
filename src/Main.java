import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product p1 = new Product("Сосиски", 10);
        Product p2 = new Product("Молоко", 5);
        Product p3 = new Product("Сок", 20);
        Product p4 = new Product("Йогурт", 10);

        products.add(p1);
        products.add(p2);
        products.add(p3);

        Market market = new Market(products);
        Buyer b1 = new Buyer("Покупатель1");
        Buyer b2 = new Buyer("Покупатель2");
        Buyer b3 = new Buyer("Покупатель3");
        Buyer b4 = new Buyer("Покупатель4");
        Buyer b5 = new Buyer("Покупатель5");



        Integer orderCount = 0;
        b1.setOrder(new Order(orderCount++, p3.name, 1, false));
        b2.setOrder(new Order(orderCount++, p1.name, 1, false));
        b3.setOrder(new Order(orderCount++, p2.name, 1, false));
        b4.setOrder(new Order(orderCount++, p4.name, 2, false));

        market.marketBehaviour(b1);
        market.marketBehaviour(b2);
        market.marketBehaviour(b3);
        market.marketBehaviour(b1);
        market.marketBehaviour(b4);

        Buyer b; // текущий покупатель в очереди
        //очередь пошла
        b = market.getNextBuyer();
        while (b != null) {
            market.update(b.getOrder());
            b = market.getNextBuyer();
        }


    }
}