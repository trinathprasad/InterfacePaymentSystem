public class Shoppingcart {
  private double totalAmount;

  public Shoppingcart(double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public void checkout(Payment payment) {
    System.out.println("Starting checkout for amount RS :" + totalAmount);
    System.out.println(" ");
    payment.makePayment(totalAmount);
  }

  public void cancelOrder(Payment payment) {
    System.out.println("Order Canceled. Initiating Refund...");
    System.out.println("Cancelling order for amount RS :" + totalAmount);
    System.out.println(" ");
    payment.makeRefund(totalAmount);

  }
}
