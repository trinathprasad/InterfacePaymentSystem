public non-sealed class UpiPayments implements Payment {

  private String upiId;

  public UpiPayments(String upiId) {
    super();
    this.upiId = upiId;
  }

  public void makePayment(double amount) {
    System.out.println("Paid RS : " + amount + "using UPI ID :" + this.upiId);

  }

  public void makeRefund(double amount) {

    System.out.println("Refunded RS : " + amount + "to Credit Card Holder : " + this.upiId);

  }
}
