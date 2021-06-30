package vehicles;

public class Bus extends Vehicle {
	
	private String typeOfTheBus;
	private int numberOfSeats;
	
	public Bus(int numberOfTheWheels, int doorNumber, String licensePlate, String typeOfTheBus,
			int numberOfSeats) {
		super(numberOfTheWheels, doorNumber, licensePlate);
		this.typeOfTheBus = typeOfTheBus;
		this.numberOfSeats = numberOfSeats;
	}

	public String getTypeOfTheBus() {
		return typeOfTheBus;
	}

	public void setTypeOfTheBus(String typeOfTheBus) {
		this.typeOfTheBus = typeOfTheBus;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	@Override
	public void vehicleDetails() {
		System.out.println("--------------------------------------------------");
		System.out.println("Type of the bus: " + typeOfTheBus + "\nDoor number: " + super.getDoorNumber() + "\nNumber of the seats: " + 
		numberOfSeats + "\nNumber of the wheels: " + super.getNumberOfTheWheels() + "\nLicense plate: " + super.getLicensePlate());
		System.out.println("--------------------------------------------------");
	}
}
