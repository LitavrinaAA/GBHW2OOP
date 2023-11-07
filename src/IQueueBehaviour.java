public interface IQueueBehaviour {
//    помещает и удаляет человека из очереди
    void marketBehaviour(Buyer buyer);
//    метод update – обновляет состояние магазина (принимает и отдаёт заказы)
    void update(Order order);

}
