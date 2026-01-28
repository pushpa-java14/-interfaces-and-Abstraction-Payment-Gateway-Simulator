public class PaymentContext {

	private Payment payment;

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void makePayment(double amount) {
		if (payment == null) {
			throw new IllegalStateException("Payment mode not selected");
		}
		payment.pay(amount);
	}
}
