package bus;

public class Driver extends Person {
	private String occupation;

	public Driver(String name, String surname, String occupation) {
		super(name, surname);
		this.occupation = occupation;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Diver's name: " + this.getName() + " " + this.getSurname() + "\nOccupation: " + this.getOccupation());
		System.out.println("-----------------------------------------");
	}
	
}
