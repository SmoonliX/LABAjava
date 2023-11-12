public class Order {
    private int orderNumber;
    private String products;
    private String deliveryAddress;
    private double orderCost;

    public Order(int orderNumber, String products, String deliveryAddress, double orderCost) {
        this.orderNumber = orderNumber;
        this.products = products;
        this.deliveryAddress = deliveryAddress;
        this.orderCost = orderCost;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getProducts() {
        return products;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public double getOrderCost() {
        return orderCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", products='" + products + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", orderCost=" + orderCost +
                '}';
    }
}
