package Payment;

public class CheckOut {
    public void ProcessOrder(double amount, PaymentMethod method){
        System.out.printf("processing order for the amount: %.2f \n", amount);
        method.pay(amount);
        System.out.println("order payment successful");
    }
}
