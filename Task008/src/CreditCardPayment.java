import static java.rmi.server.LogStream.log;

public class CreditCardPayment extends AbstractPayment {

	@Override
	public void pay(double amount) {
		validateAmount(amount);
		log("Processing Credit Card payment...");
		System.out.println("Paid ₹" + amount + " using Credit Card");
	}
}
