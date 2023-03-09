public class Order {
    private String id;
    private OrderStatus status;



    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order(String id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }
}
