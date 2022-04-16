package pl.edu.mimuw;

import java.util.ArrayList;

public class Student extends Person
{
	ArrayList <StudyProgram> studyPrograms;

	public Student(String _name, String _surname, int _age, int _id)
	{
		super(_name, _surname, _age, _id);
		studyPrograms = new ArrayList <>();
	}

	public Student addStudyProgram(StudyProgram studyProgram)
	{
		studyPrograms.add(studyProgram);
		return this;
	}

	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append(super.toString())
				.append("Study programs:\n");
		for (var sp : studyPrograms)
			sb.append(sp);
		return sb.append('\n').toString();
	}
}