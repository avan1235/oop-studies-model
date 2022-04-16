package pl.edu.mimuw;

public abstract class Person implements Comparable <Person>
{
	private final String name;
	private final String surname;
	private int age;
	private final int id;

	public Person(String _name, String _surname, int _age, int _id) 
	{
		name = _name;
		surname = _surname;
		age = _age;
		id = _id;
	}

	public String getName()
	{
		return name;
	}

	public String getSurname()
	{
		return surname;
	}

	public int getId()
	{
		return id;
	}

	@Override
	public int compareTo(Person other)
	{
		return Integer.compare(id, other.getId());
	}
	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append("Name: ").append(name).append(' ').append(surname).append('\n')
				.append("ID: ").append(id).append('\n')
				.append("Age: ").append(age).append('\n');
		return sb.toString();
	}
}