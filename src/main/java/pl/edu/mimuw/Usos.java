package pl.edu.mimuw;

import java.util.HashMap;

public class Usos {
	private HashMap<String, Person> users;
	
	public Usos() {
		this.users = new HashMap<String, Person>();
	}
	
	public void addUser(Person person) {
		this.users.put(person.getPersonalIDNumber(), person);
	}
	
	public Person getUser(String personalIDNumber) {
		return this.users.get(personalIDNumber);
	}
	
	public int getNumberOfUsers() {
		return this.users.size();
	}
}
