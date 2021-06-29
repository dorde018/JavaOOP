package bankCards;

public class MasterCard extends PaymentCard{

	public MasterCard(double sum, long cardNumber, int year, int month) {
		super(sum, cardNumber, year, month);
	}
	public void executionOfTheTransaction(double charge) {
		double commission = charge * 0.015;
		super.executionOfTheTransaction(charge + commission);
	}
	public void maintenance() {
		super.executionOfTheTransaction(2);
		
	}
	public void printDetails() {
		System.out.println("--------------------------------------");
		System.out.println("Master card:\n");
		super.printDetails();
		System.out.println("--------------------------------------");
	}	
}
