public class Main {

    public static void main(String[] args) {
        Order firstorder = new Order("324", OrderStatus.IN_DELIVERY);


        System.out.println(firstorder.getStatus());

        switch(firstorder.getStatus())
        {
            case RECEIVED:
                System.out.println("Received");
                break;
            case IN_PROGRESS:
                System.out.println("In Progress");
                break;
            case IN_DELIVERY:
                System.out.println("In Delivery");
                break;
            case COMPLETED:
                System.out.println("Completed");
                break;
            case CANCELED:
                System.out.println("Canceled");
                break;
            default:
                System.out.println("Status unknown");
        }


    }




}
