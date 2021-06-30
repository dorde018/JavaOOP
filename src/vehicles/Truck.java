package vehicles;

public class Truck extends Vehicle {
	private String typeOfTheTruck;
	private String categoryOfTheVehicle;
	private int numberOfTheTrailers;
	
	public Truck(int numberOfTheWheels, int doorNumber, String licensePlate, String typeOfTheTruck,
			String categoryOfTheVehicle, int numberOfTheTrailers) {
		super(numberOfTheWheels, doorNumber, licensePlate);
		this.typeOfTheTruck = typeOfTheTruck;
		this.categoryOfTheVehicle = categoryOfTheVehicle;
		this.numberOfTheTrailers = numberOfTheTrailers;
	}

	public String getTypeOfTheTruck() {
		return typeOfTheTruck;
	}

	public void setTypeOfTheTruck(String typeOfTheTruck) {
		this.typeOfTheTruck = typeOfTheTruck;
	}

	public String getCategoryOfTheVehicle() {
		return categoryOfTheVehicle;
	}

	public void setCategoryOfTheVehicle(String categoryOfTheVehicle) {
		this.categoryOfTheVehicle = categoryOfTheVehicle;
	}

	public int getNumberOfTheTrailers() {
		return numberOfTheTrailers;
	}

	public void setNumberOfTheTrailers(int numberOfTheTrailers) {
		this.numberOfTheTrailers = numberOfTheTrailers;
	}
	@Override
	public void vehicleDetails() {
		System.out.println("--------------------------------------------------");
		System.out.println("Type of the truck: " + typeOfTheTruck + "Door number: " + super.getDoorNumber() + "\nCategory of the vehicle: " + categoryOfTheVehicle 
				+  "\nNumber of the trailers: " + numberOfTheTrailers + "\nNumber of the wheels: " + super.getNumberOfTheWheels() +  "\nLicense plate: " + super.getLicensePlate() ); 
		System.out.println("--------------------------------------------------");
	}
	
}
