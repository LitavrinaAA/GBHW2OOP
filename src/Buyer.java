public class Buyer {
    private String name;
    private Long indexQueue;
    private Boolean isInQueue;

    private Order order = null;


    public Buyer(String name) {
        this.name = name;
        this.isInQueue = false;
        this.indexQueue = -1L;
    }

    public Long getIndexQueue() {
        return indexQueue;
    }

    public void setIndexQueue(Long indexQueue) {
        this.indexQueue = indexQueue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Boolean getInQueue() {
        return isInQueue;
    }

    public void setInQueue(Boolean inQueue) {
        isInQueue = inQueue;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
