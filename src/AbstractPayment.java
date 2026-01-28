public abstract class AbstractPayment implements Payment, Logger {

	protected void validateAmount(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid payment amount");
		}
	}

	@Override
	public void log(String message) {
		System.out.println("[LOG] " + message);
	}
}

