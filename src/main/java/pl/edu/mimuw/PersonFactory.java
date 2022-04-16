package pl.edu.mimuw;

import java.util.Set;

public class PersonFactory
{
	private static int population = 0;

	public static Student makeStudent(String name, String surname, int age)
	{
		return new Student(name, surname, age, population++);
	}

	public static Scholar makeScholar(String name, String surname, int age, Set <Publication> publications)
	{
		return new Scholar(name, surname, age, population++, publications);
	}
}