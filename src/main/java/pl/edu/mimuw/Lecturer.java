package pl.edu.mimuw;

import java.util.HashSet;

public class Lecturer extends Person {
	private String academicTitle;
	private HashSet<Publication> publications;
	
	public Lecturer(String name, String surname, String personalIDNumber, int birthYear, String academicTitle) {
		super(name, surname, personalIDNumber, birthYear);
		this.academicTitle = academicTitle;
	}
	
	public String getAcademicTitle() {
		return this.academicTitle;
	}
	
	public HashSet<Publication> getPublications() {
		var copy = new HashSet<Publication>();
		for(var publication: publications) {
			copy.add(new Publication(publication.getName(), publication.getYear()));
		}
		return copy;
	}
	
	public void addPublication(Publication publication) {
		this.publications.add(publication);
	}
	
	@Override
	public String toString() {
		var answer = new StringBuilder().append("My name is ")
		                                .append(this.name)
		                                .append(" ")
		                                .append(this.surname)
		                                .append(".\nI'm ")
		                                .append(vowel(academicTitle.charAt(0)) ? "an " : "a ")
		                                .append(this.academicTitle)
		                                .append(".\n");
		return answer.toString();
	}
	
	public static boolean vowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
	}
}
