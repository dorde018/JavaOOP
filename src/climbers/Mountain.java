package climbers;

public class Mountain {
	private String nameOfTheMountain;
	private String nameOfTheCountryInWhichItIsLocated;
	private  int heightOfTheMountain;
	
	public Mountain() {
		super();
	}
	public Mountain(String nameOfTheMountain, String nameOfTheCountryInWhichItIsLocated, int heightOfTheMountain) {
		super();
		this.nameOfTheMountain = nameOfTheMountain;
		this.nameOfTheCountryInWhichItIsLocated = nameOfTheCountryInWhichItIsLocated;
		this.heightOfTheMountain = heightOfTheMountain;
	}
	public String getNameOfTheMountain() {
		return nameOfTheMountain;
	}
	public void setNameOfTheMountain(String nameOfTheMountain) {
		this.nameOfTheMountain = nameOfTheMountain;
	}
	public String getNameOfTheCountryInWhichItIsLocated() {
		return nameOfTheCountryInWhichItIsLocated;
	}
	public void setNameOfTheCountryInWhichItIsLocated(String nameOfTheCountryInWhichItIsLocated) {
		this.nameOfTheCountryInWhichItIsLocated = nameOfTheCountryInWhichItIsLocated;
	}
	public int getHeightOfTheMountain() {
		return heightOfTheMountain;
	}
	public void setHeightOfTheMountain(int heightOfTheMountain) {
		this.heightOfTheMountain = heightOfTheMountain;
	}

}

