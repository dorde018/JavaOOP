package vehicles;

public class RefrigeratorTruck extends Vehicle {
	private int temperatureInTheRefrigerator;
	private int  freezerCapacity;
	public RefrigeratorTruck(int numberOfTheWheels, int doorNumber, String licensePlate,
			int temperatureInTheRefrigerator, int freezerCapacity) {
		super(numberOfTheWheels, doorNumber, licensePlate);
		this.temperatureInTheRefrigerator = temperatureInTheRefrigerator;
		this.freezerCapacity = freezerCapacity;
	}
	public int getTemperatureInTheRefrigerator() {
		return temperatureInTheRefrigerator;
	}
	public void setTemperatureInTheRefrigerator(int temperatureInTheRefrigerator) {
		this.temperatureInTheRefrigerator = temperatureInTheRefrigerator;
	}
	public int getFreezerCapacity() {
		return freezerCapacity;
	}
	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}
	@Override
	public void vehicleDetails() {
		System.out.println("------------------------------------------------");
		System.out.println("The refrigerator truck" + "\nDoor number: " + super.getDoorNumber() + "\nTemperature in the refrigerator: " 
			+ temperatureInTheRefrigerator	+ "°C" + "\nFreezer capacity: " + freezerCapacity + " ton" + "\nNumber of the wheels: " + super.getNumberOfTheWheels() +
			"\nLicense plate: " + super.getLicensePlate());
		System.out.println("------------------------------------------------");
	}

}
