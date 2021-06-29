package bankCard;

public class VisaCard extends PaymentCard {
	private String nameAndSurname;

	public VisaCard(double sum, long cardNumber, int year, int month, String nameAndSurname) {
		super(sum, cardNumber, year, month);
		this.nameAndSurname = nameAndSurname;
	}

	public String getNameAndSurname() {
		return nameAndSurname;
	}

	public void setNameAndSurname(String nameAndSurname) {
		this.nameAndSurname = nameAndSurname;
	}
	public void executionOfTheTransaction(double charge) {
		double commission = charge * 0.018;
		if(commission < 4) {
			super.executionOfTheTransaction(charge + 4);
		}else {
			super.executionOfTheTransaction(charge + commission);
		}
	}
	public void printDetails() {
		System.out.println("--------------------------------------");
		System.out.println("Visa card:" );
		System.out.println("\nThe cardholder name: " + nameAndSurname);
		super.printDetails();
		System.out.println("--------------------------------------");
	}	
}
