import javax.print.attribute.standard.DateTimeAtCompleted;

public enum OrderStatus {
    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELED("Canceled");
    private String string;


    OrderStatus(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "string='" + string + '\'' +
                '}';
    }
}
