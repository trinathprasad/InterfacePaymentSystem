public non-sealed class DebitCardPayment implements Payment {

  private String bankName;

  public DebitCardPayment(String bankName) {
    super();
    this.bankName = bankName;
  }

  public void makePayment(double amount) {
    System.out.println("Paid RS : " + amount + "using Debit Card Bank :" + this.bankName);
  }

  public void makeRefund(double amount) {

    System.out.println("Refunded RS : " + amount + "to Debit Card Bank : " + this.bankName);

  }

}
