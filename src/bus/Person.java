package bus;

public abstract class Person {
	private String name;
	private String surname;
	
	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}

	public abstract void printDetails();
	
}