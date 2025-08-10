import java.util.Scanner;

public class InterfacePaymentSystem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your total bill Amount :");
    double totalAmount = sc.nextDouble();
    Shoppingcart shop = new Shoppingcart(totalAmount);

    System.out.println("Choose Payment Method:");
    System.out.println("/t/t1. Credit Card");
    System.out.println("/t/t2. Debit Card");
    System.out.println("/t/t3. UPI");

    Payment payment = null;

    System.out.println("Enter your choice :");
    int choice = sc.nextInt();

    switch (choice) {
      case 1: {

        payment = new CreditCardPaymets("Mr.Ravi");
        shop.checkout(payment);
        shop.cancelOrder(payment);

      }
        break;

      case 2: {
        payment = new DebitCardPayment("State bank of India");
        shop.checkout(payment);
        shop.cancelOrder(payment);

      }
        break;

      case 3: {
        payment = new UpiPayments("reach_scott@upi");
        shop.checkout(payment);
        shop.cancelOrder(payment);

      }
        break;

      default:
        System.out.println("Invalid choice!!!");

    }

    sc.close();

  }

}
