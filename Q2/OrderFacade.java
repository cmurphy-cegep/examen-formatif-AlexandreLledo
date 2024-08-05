public class OrderFacade {

    private Payment payment;
    private Shipping shipping;
    private Stock stock;

    public OrderFacade() {
        payment = new Payment();
        shipping = new Shipping();
        stock = new Stock();
    }

    public void placeOrder(String item, int quantity, String paymentDetails, String address) {
        System.out.println("Placing order for: " + item);
        stock.checkStock(item, quantity);
        payment.processPayment(paymentDetails);
        shipping.arrangeShipping(item, quantity, address);
        System.out.println("Order placed successfully.");
    }
}
