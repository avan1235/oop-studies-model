package pl.edu.mimuw;

import java.util.HashMap;
import java.util.TreeSet;

public class USOS
{
	TreeSet <Person> universityPeople;
	HashMap <String, Person> universityPeopleDatabase; //to jest dla mnie trochę bez sensu, będą oczywiście kolizje, ale implementacja jest
	private int headCount;

	public USOS()
	{
		headCount = 0;
		universityPeopleDatabase = new HashMap <>();
		universityPeople = new TreeSet <>();
	}

	public void addPerson(Person person)
	{
		universityPeopleDatabase.put(person.getName(), person);
		universityPeopleDatabase.put(person.getSurname(), person);
		universityPeopleDatabase.put(person.getName() + ' ' + person.getSurname(), person);
		universityPeople.add(person);
		headCount++;
	}

	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append("Number of people of the University: ").append(headCount).append('\n')
				.append("List of people of the University:\n");
		for (var p : universityPeople)
			sb.append(p);
		return sb.toString();
	}

	public Person findByName(String name)
	{
		return universityPeopleDatabase.get(name);
	}
}