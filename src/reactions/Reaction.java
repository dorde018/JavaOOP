package reactions;

public class Reaction {
	private String typeOfTheReaction;
	private String name;
	private String surname;
	public Reaction(String typeOfTheReaction, String name, String surname) {
		super();
		this.typeOfTheReaction = typeOfTheReaction;
		this.name = name;
		this.surname = surname;
	}
	public String getTypeOfTheReaction() {
		return typeOfTheReaction;
	}
	public void setTypeOfTheReaction(String typeOfTheReaction) {
		this.typeOfTheReaction = typeOfTheReaction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
