import static java.rmi.server.LogStream.log;

public class NetBankingPayment extends AbstractPayment {

	@Override
	public void pay(double amount) {
		validateAmount(amount);
		log("Processing Net Banking payment...");
		System.out.println("Paid ₹" + amount + " using Net Banking");
	}
}
