package Payment;

public class PayPal implements PaymentMethod{
    private String Email;
    PayPal(String Email){
        this.Email = Email;
    }

    @Override
    public void pay(double amount){
        System.out.printf("payment %.2f$\n", amount);
    }

}
