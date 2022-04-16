package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class Scholar extends Person
{
	private Set <Publication> publications;
	private int publicationCount;
	private Set <MaintainedClass> maintainedClasses;
	public Scholar(String _name, String _surname, int _age, int _id, Set <Publication> _publications)
	{
		super(_name, _surname, _age, _id);
		publications = _publications;
		publicationCount = publications.size();
		maintainedClasses = new HashSet<>();
	}

	public Scholar publish(Publication publication)
	{
		publications.add(publication);
		publicationCount++;
		return this;
	}

	public Scholar addMaintainedClass(MaintainedClass maintainedClass)
	{
		maintainedClasses.add(maintainedClass);
		return this;
	}

	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append(super.toString())
			.append("Number of publications: ").append(publicationCount).append('\n')
			.append("List of publications:\n");
		for (var p : publications)
			sb.append(p);
		sb.append("Number of maintained classes: ").append(maintainedClasses.size()).append('\n')
			.append("List of maintained classes:\n");
		for (var c : maintainedClasses)
			sb.append(c);
		return sb.append('\n').toString();
	}
}