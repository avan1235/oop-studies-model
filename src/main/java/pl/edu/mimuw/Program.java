package pl.edu.mimuw;

public class Program {
	private final String name, faculty;
	
	public Program(String name, String faculty) {
		this.name = name;
		this.faculty = faculty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getFaculty() {
		return this.faculty;
	}
	
	@Override
	public String toString() {
		var answer = new StringBuilder().append("program name: ")
		                                .append(this.name)
		                                .append("\nprogram faculty: ")
		                                .append(this.faculty)
		                                .append("\n");
		return answer.toString();
	}
}
