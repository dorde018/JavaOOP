package bankCard;

public class PaymentCard {
	private double sum;
	private long cardNumber;
	private int year;
	private int month;
	
	public PaymentCard(double sum, long cardNumber, int year, int month) {
		super();
		this.sum = sum;
		this.cardNumber = cardNumber;
		this.year = year;
		this.month = month;
	}

	public double getSum() {
		return sum;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}
	
	public void addFunds(double payment) {
		sum += payment;
	}
	
	public void executionOfTheTransaction(double charge) {
		sum -= charge;
	}
	
	public void printDetails() {
		System.out.println("Card number: " + cardNumber + "\nCard's expiration date: " + month + "/" + year + "\nAmount available: " + sum);
	}
}

