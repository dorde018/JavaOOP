package climbers;

public class Alpinist extends Climber {
	private int howManyPointsTheAlpinistHasScored;

	public Alpinist(int uniqueIdentificationNumber, String nameAndSurname, int howManyPointsTheAlpinistHasScored) {
		super(uniqueIdentificationNumber, nameAndSurname);
		this.howManyPointsTheAlpinistHasScored = howManyPointsTheAlpinistHasScored;
	}

	public int getHowManyPointsTheAlpinistHasScored() {
		return howManyPointsTheAlpinistHasScored;
	}

	public void setHowManyPointsTheAlpinistHasScored(int howManyPointsTheAlpinistHasScored) {
		this.howManyPointsTheAlpinistHasScored = howManyPointsTheAlpinistHasScored;
	}

	@Override
	public void print() {
		System.out.println("The ID of the alpinist is: " + this.uniqueIdentificationNumber + "\nName and surname: " + this.nameAndSurname + "\nPoints scored:"+this.howManyPointsTheAlpinistHasScored);
		System.out.println("-----------------------------------------");
	}
	@Override
	public int climberMembershipFee() {
		int alpinistMembershipFee = 0;
		if( this.howManyPointsTheAlpinistHasScored == 0 ) {
			alpinistMembershipFee = 1500;
		}else {
			alpinistMembershipFee = ( 1500 - ((this.howManyPointsTheAlpinistHasScored * 50) / 100) );
		}
		return alpinistMembershipFee;
	}
	public boolean successfulAscent(Mountain theAscentOfTheClimber) {
		int theAscentOfTheAlpinist = 0;
		if( theAscentOfTheAlpinist <= 4000 ) {
			return true;
		}
		else {
			return false;
		}
		
	}
		
	public boolean canAlpinsituccessfullyAscendToTheTopOfTheMountain(int ascentOtTheAlpinsit) {
		if( ascentOtTheAlpinsit <= 4000 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
