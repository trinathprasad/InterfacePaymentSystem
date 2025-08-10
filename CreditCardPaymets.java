public non-sealed class CreditCardPaymets implements Payment {
  private String cardHolderName;

  public CreditCardPaymets(String cardHolderName) {
    super();
    this.cardHolderName = cardHolderName;
  }

  @Override
  public void makePayment(double amount) {
    System.out.println("Paid RS : " + amount + "using Credit Card Holder :" + this.cardHolderName);

  }

  @Override
  public void makeRefund(double amount) {
    System.out.println("Refunded RS : " + amount + "to Credit Card Holder : " + this.cardHolderName);

  }

}