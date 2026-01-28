import static java.rmi.server.LogStream.log;

public class UPIPayment extends AbstractPayment {

	@Override
	public void pay(double amount) {
		validateAmount(amount);
		log("Processing UPI payment...");
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}
