public sealed interface Payment permits 
 DebitCardPayment, CreditCardPaymets, UpiPayments
 {
	void makePayment(double amount);
	 void makeRefund(double amount);

}
