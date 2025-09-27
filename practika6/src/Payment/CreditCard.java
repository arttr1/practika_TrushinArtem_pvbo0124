package Payment;

public class CreditCard implements PaymentMethod {
    private String CardNumber;

    CreditCard(String CardNumber){
        this.CardNumber = CardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.printf("payment %.2f$\n", amount);
    }
}
