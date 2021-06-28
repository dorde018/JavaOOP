package bus;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	Bus b1 = new Bus("Easy Road", 15.5);
	Bus b2 = new Bus("Strong Wheels", 16.0);
	Driver d1 = new Driver("Michael", "Buffer", "driver");
	Driver d2 = new Driver("Sandra", "Wellington", "driver");
	Passenger p1 = new Passenger("Ana", "Simons", 23);
	Passenger p2 = new Passenger("Anthony", "James", 31);
	Passenger p3 = new Passenger("Sonny", "Pasqual", 17.6);
	Passenger p4 = new Passenger("Amy", "Bones", 34);
	Passenger p5 = new Passenger("Michaela", "Lour", 29.2);
	Passenger p6 = new Passenger("Martina", "Sale", 34.3);
	Passenger p7 = new Passenger("Ruth", "McGregor", 16.7);
	Passenger p8 = new Passenger("Sammy", "Martins", 40);
	
	ArrayList<Person> listOfThePersonsEasyRoad = new ArrayList<>();
	listOfThePersonsEasyRoad.add(d1);
	listOfThePersonsEasyRoad.add(p1);
	listOfThePersonsEasyRoad.add(p2);
	listOfThePersonsEasyRoad.add(p3);
	listOfThePersonsEasyRoad.add(p4);

	b1.printListOfThePeopleInTheBus(listOfThePersonsEasyRoad);
	d1.printDetails();
	
	ArrayList<Passenger> listOfThePassengersEasyRoad = new ArrayList<>();
	listOfThePassengersEasyRoad.add(p1);
	listOfThePassengersEasyRoad.add(p2);
	listOfThePassengersEasyRoad.add(p3);
	listOfThePassengersEasyRoad.add(p4);
	p4.subtractAmount(6);
	
	p1.printListOfThePassengers(listOfThePassengersEasyRoad);
	
	ArrayList<Person> listOfThePersonsStrongWheels = new ArrayList<>();
	listOfThePersonsStrongWheels.add(d2);
	listOfThePersonsStrongWheels.add(p5);
	listOfThePersonsStrongWheels.add(p6);
	listOfThePersonsStrongWheels.add(p7);
	listOfThePersonsStrongWheels.add(p8);
	
	
	b2.printListOfThePeopleInTheBus(listOfThePersonsStrongWheels);
	d2.printDetails();
	
	ArrayList<Passenger> listOfThePassengersStrongWheels = new ArrayList<>();
	listOfThePassengersStrongWheels.add(p5);
	listOfThePassengersStrongWheels.add(p6);
	listOfThePassengersStrongWheels.add(p7);
	listOfThePassengersStrongWheels.add(p8);
	p7.addAmount(11);
	p8.subtractAmount(6);
	
	p1.printListOfThePassengers(listOfThePassengersStrongWheels);
	
	}

}
