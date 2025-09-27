package Payment;

public class Main {
    public static void main(String[] args) {
        CheckOut check = new CheckOut();

        PaymentMethod card = new CreditCard("843759873245");
        PaymentMethod paypayl = new PayPal("aneoahu@gmail.com");

        check.ProcessOrder(847.87, card);

        System.out.println();
        check.ProcessOrder(988.65, paypayl);

    }
}
