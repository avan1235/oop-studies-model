package pl.edu.mimuw;

import java.util.ArrayList;

public class Student extends Person {
	private final String indexNumber;
	private ArrayList<Program> programs;
	
	public Student(String name, String surname, String personalIDNumber, int birthYear, String indexNumber) {
		super(name, surname, personalIDNumber, birthYear);
		this.indexNumber = indexNumber;
	}
	
	public String getIndexNumber() {
		return this.indexNumber;
	}
	
	public ArrayList<Program> getPrograms() {
		var copy = new ArrayList<Program>();
		for(var program: this.programs) {
			copy.add(new Program(program.getName(), program.getFaculty()));
		}
		return copy;
	}
	
	public void addProgram(Program program) {
		this.programs.add(program);
	}
	
	@Override
	public String toString() {
		var answer = new StringBuilder().append("My name is ")
		                                .append(this.name)
		                                .append(" ")
		                                .append(this.surname)
		                                .append(".\nI study ")
		                                .append(this.programs.size())
		                                .append(" programs.\n");
		return answer.toString();
	}
}
