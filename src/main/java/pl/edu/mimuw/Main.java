package pl.edu.mimuw;

import java.util.Arrays;
import java.util.HashSet;

public class Main
{

	public static void main(String[] args)
	{
		var usos = new USOS();

		String[] names = {"Adalbert", "Adam", "Adrian", "Aleksander", "Alfred", "Alojzy", "Amadeusz", "Anatol", "Apolinary", "Augustyn"};
		String[] surnames = {"Aalto", "Abel", "Ackermann", "Afonin", "Ainzychart", "Akus", "Aondo-Akaa", "Aquari", "Ataman", "Avicenna"};

		Student[] informaticians = new Student[7];
		for (int i = 0;i<7;i++)
			informaticians[i] = PersonFactory.makeStudent(names[i], surnames[i], (int)(Math.random() * 8 + 18));
		Arrays.stream(informaticians).map(i -> i.addStudyProgram(new StudyProgram((int)(Math.random() * 4 + 1), "Computer Science")))
				.forEach(usos::addPerson);

		Scholar[] assistants = new Scholar[3];
		for (int i = 0;i<3;i++)
			assistants[i] = PersonFactory.makeScholar(names[i], surnames[i], (int)(Math.random() * 20 + 22), new HashSet <>());
		Arrays.stream(assistants).map(i -> i.publish(new Publication((int)(Math.random() * 1000000000))))
				.map(i -> i.addMaintainedClass(new MaintainedClass((int)(Math.random() * 4 + 1), "Calculus", (int)(Math.random() * 12 + 1))))
				.forEach(usos::addPerson);

		for (int i = 0;i<10;i++)
			assert(surnames[i].equals(usos.findByName(names[i]).getSurname()));

		System.out.println(usos);
	}
}