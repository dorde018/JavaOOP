package bus;

import java.util.ArrayList;

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
		System.out.println("---------------------------------------------");
	}
	
	public void printDriversOfAllTheCompanies(ArrayList<Driver> listOfDriversOfAllTheCompanies) {
		System.out.println("The list of the drivers of all the companies:\n");
		String person = "";
		for (int i = 0; i < listOfDriversOfAllTheCompanies.size(); i++) {
		person = i + 1 +". "  + listOfDriversOfAllTheCompanies.get(i).getName() + " " + listOfDriversOfAllTheCompanies.get(i).getSurname();
			
		System.out.println(person);
		}
		System.out.println("---------------------------------------------");
		
	}
	
}
