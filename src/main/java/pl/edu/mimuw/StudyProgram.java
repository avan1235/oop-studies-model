package pl.edu.mimuw;

public class StudyProgram
{
	private int year;
	private final String major;

	public StudyProgram(int _year, String _major)
	{
		year = _year;
		major = _major;
	}

	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append(year).append("th year of ").append(major).append('\n');
		//na tych zajęciach raczej nie przejmujemy się zbytnio poprawnością językową, jeśli chodzi o angielski, a lokalizacja to już trochę bardziej skomplikowana kwestia niż to proste zadanko o dziedziczeniu
		return sb.toString();
	}
}