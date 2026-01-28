//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {


				PaymentContext context = new PaymentContext();

				try {
					// Switch payment dynamically
					context.setPayment(new CreditCardPayment());
					context.makePayment(1500);

					context.setPayment(new UPIPayment());
					context.makePayment(500);

					context.setPayment(new NetBankingPayment());
					context.makePayment(-100); // Invalid case

				} catch (Exception e) {
					System.out.println("[ERROR] " + e.getMessage());
				}
			}
		}