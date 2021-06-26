package climbers;

import climbers.Mountain;

public abstract class Climber extends Mountain  {
	
	protected int uniqueIdentificationNumber;
	protected String nameAndSurname;

	public Climber (int uniqueIdentificationNumber, String nameAndSurname) {
		super();
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
		this.nameAndSurname = nameAndSurname;		
	}
	
	public int getUniqueIdentificationNumber() {
		return uniqueIdentificationNumber;
	}
	public String getNameAndSurname() {
		return nameAndSurname;
	}
	public abstract void print();
	public abstract int climberMembershipFee();
	public boolean successfulAscent(Mountain theAscentOfTheClimber) {
		return true;
		
	}

}
