package pl.edu.mimuw;

public abstract class Person {
	protected final String name, surname, personalIDNumber;
	protected final int birthYear;
	
	public Person(String name, String surname, String personalIDNumber, int birthYear) {
		this.name = name;
		this.surname = surname;
		this.personalIDNumber = personalIDNumber;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPersonalIDNumber() {
		return this.personalIDNumber;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
	@Override
	public String toString() {
		var answer = new StringBuilder().append("My name is ")
		                                .append(this.name)
		                                .append(" ")
		                                .append(this.surname)
		                                .append(".\nI was born in ")
		                                .append(this.birthYear)
		                                .append(".\n");
		return answer.toString();
	}
}
