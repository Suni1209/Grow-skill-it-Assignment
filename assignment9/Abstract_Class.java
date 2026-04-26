package assignment9;
		abstract class Payment 
		{
		int amount;
			
			Payment(int amount) 
			{
				this.amount = amount;
			}
			abstract void makePayment();
			void paymentDetails() 
			{
				System.out.println("Payment Amount: " + amount);
			}
		}
		class CreditCardPayment extends Payment 
		{

			String cardNumber;

			CreditCardPayment(int amount, String cardNumber) 
			{
				super(amount);
				this.cardNumber = cardNumber;
			}
			void makePayment() 
			{
				String last4 = cardNumber.substring(cardNumber.length() - 4);
				System.out.println("Paid " + amount + " using Credit Card ending with " + last4);
			}
		}
		class UPIPayment extends Payment 
		{
			String upiId;

			UPIPayment(int amount, String upiId) 
			{
				super(amount);
				this.upiId = upiId;
			}

			void makePayment() 
			{
				System.out.println("Paid " + amount + " using UPI ID: " + upiId);
			}
		}

		public class Abstract_Class {

			public static void main(String[] args) {
				
				Payment p1 = new CreditCardPayment(5000, "1234567812341234");
				p1.paymentDetails();
				p1.makePayment();

				System.out.println();

				Payment p2 = new UPIPayment(1500, "user@upi");
				p2.paymentDetails();
				p2.makePayment();
			}
	}


