package climbers;

public class RecreationalClimber extends Climber {
	private int weightOfTheEquipment;
	private String nameOfTheDistrictWhereTheRecreationalClimberIsFrom;
	private int maximumAscentThatClimberCanReachWithoutEquipment;
	
	public RecreationalClimber(int uniqueIdentificationNumber, String nameAndSurname, int weightOfTheEquipment, String nameOfTheDistrictWhereTheRecreationalClimberIsFrom, int maximumAscentThatClimberCanReachWithoutEquipment) {
		super(uniqueIdentificationNumber, nameAndSurname);
		this.weightOfTheEquipment = weightOfTheEquipment;
		this.nameOfTheDistrictWhereTheRecreationalClimberIsFrom = nameOfTheDistrictWhereTheRecreationalClimberIsFrom;
		this.maximumAscentThatClimberCanReachWithoutEquipment = maximumAscentThatClimberCanReachWithoutEquipment;
	}
	public int getWeightOfTheEquipment() {
		return weightOfTheEquipment;
	}
	public String getNameOfTheDistrictWhereTheRecreationalClimberIsFrom() {
		return nameOfTheDistrictWhereTheRecreationalClimberIsFrom;
	}
	public double getMaximumAscentThatClimberCanReachWithoutEquipment() {
		return maximumAscentThatClimberCanReachWithoutEquipment;
	}
	@Override
	public void print() {
		System.out.println("The ID of the recreational climber is: " + this.uniqueIdentificationNumber +"\nName and surname: "+ this.nameAndSurname + "\nThe District: " +this.nameOfTheDistrictWhereTheRecreationalClimberIsFrom );
		System.out.println();
		System.out.println("-----------------------------------------");
	}
	@Override
	public int climberMembershipFee() {
		return 1000;
	}
	@Override
	public boolean successfulAscent(Mountain theAscentOfTheClimber) {
		boolean success = true;
		if ( (this.maximumAscentThatClimberCanReachWithoutEquipment - (this.weightOfTheEquipment * 50)) >= super.getHeightOfTheMountain() ) {
			System.out.println("This climber will successfully ascend to the top of the mountain.");
			success = true;
			
		}else if( (this.maximumAscentThatClimberCanReachWithoutEquipment - (this.weightOfTheEquipment * 50)) < super.getHeightOfTheMountain() ) {
			System.out.println("This climber will not successfully ascend to the top of the mountain.");
			success = false;

		}else {
			System.out.println("Wrong or inaccurate data:.");
		}
		return success;
	}

}

