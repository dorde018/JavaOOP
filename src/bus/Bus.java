package bus;

import java.util.ArrayList;

public class Bus {
	private String busCompanyName;
	private double ticketPrice;

	public Bus(String busCompanyName, double ticketPrice) {
	this.busCompanyName = busCompanyName;
		this.ticketPrice = ticketPrice;
	}

	public String getBusCompanyName() {
		return busCompanyName;
	}
	
	public void setBusCompanyName(String busCompanyName) {
		this.busCompanyName = busCompanyName;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public void printListOfThePersonsInTheBus(ArrayList <Person> listOfThePersonsInTheBus ) {
		System.out.println("Company's name: " + this.busCompanyName + " " + "\nThe price of the ticket: " + this.ticketPrice + " eur.\n");
		System.out.println("The list of the persons that are in the bus:\n");
		String person="";
		for (int i = 0; i < listOfThePersonsInTheBus.size(); i++) {
			person = listOfThePersonsInTheBus.get(i).getName() + " " + listOfThePersonsInTheBus.get(i).getSurname();
			System.out.println(person);
		}
		System.out.println("---------------------------------------------");
	}
	
	public void printDetails(){
		System.out.println("Company's name: " + this.busCompanyName + " " + "\nThe price of the ticket: " + this.ticketPrice + " eur.");
		System.out.println("---------------------------------------------");
	}
	
}
