package bus;

import java.util.ArrayList;

public class Passenger extends Person {
	private double passengerAmountOfMoney;

	public Passenger(String name, String surname, double passengerAmountOfMoney) {
	super(name, surname);
	this.passengerAmountOfMoney = passengerAmountOfMoney;
	}
	
	public double getPassengerAmountOfMoney() {
		return passengerAmountOfMoney;
	}
	public void setPassengerAmountOfMoney(double passengerAmountOfMoney) {
		this.passengerAmountOfMoney = passengerAmountOfMoney;
	}

	public void addAmount(double amount) {
		setPassengerAmountOfMoney(getPassengerAmountOfMoney() + amount);
	}
	public void subtractAmount(double amount) {
		setPassengerAmountOfMoney(getPassengerAmountOfMoney() - amount);
	}
	
	@Override
	public void printDetails() {
		System.out.println("Passenger's name: " + this.getName() + " " + this.getSurname() + "\nPassenger's money amount: " 
										+ this.getPassengerAmountOfMoney() );
		System.out.println("-----------------------------------------");
	}
	
	public void printListOfThePassengers(ArrayList<Passenger>listOfThePassengers) {
		System.out.println("List of the passengers:\n");
		String person="";
		for (int i = 0; i < listOfThePassengers.size(); i++) {
		person = listOfThePassengers.get(i).getName() + " " + listOfThePassengers.get(i).getSurname()
				+ "\nPassenger's money amount: " + listOfThePassengers.get(i).getPassengerAmountOfMoney()
				+ " eur.\n- - - - - - - - - - - - - - - - - -";
		System.out.println(person);
		}
		System.out.println("-----------------------------------------");
	}
	
}
