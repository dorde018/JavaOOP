package vehicles;

public abstract class Vehicle {
	
	private int numberOfTheWheels;
	private int doorNumber;
	private String licensePlate;
	public Vehicle(int numberOfTheWheels, int doorNumber, String licensePlate) {
		super();
		this.numberOfTheWheels = numberOfTheWheels;
		this.doorNumber = doorNumber;
		this.licensePlate = licensePlate;
	}
	public int getNumberOfTheWheels() {
		return numberOfTheWheels;
	}
	public void setNumberOfTheWheels(int numberOfTheWheels) {
		this.numberOfTheWheels = numberOfTheWheels;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public abstract void vehicleDetails();
}
