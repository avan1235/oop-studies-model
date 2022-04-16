package pl.edu.mimuw;

public class MaintainedClass
{
	private final int year;
	private final String course;
	private final int group;

	public MaintainedClass(int _year, String _course, int _group)
	{
		year = _year;
		course = _course;
		group = _group;
	}

	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append(group).append("th group of ")
				.append(year).append("th year of ")
				.append(course).append('\n');
		return sb.toString();
	}
}