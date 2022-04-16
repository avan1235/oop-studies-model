package pl.edu.mimuw;

public class Publication {
	private final String name;
	private final int year;
	
	public Publication(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	@Override
	public String toString() {
		var answer = new StringBuilder().append("publication name: ")
		                                .append(this.name)
		                                .append("\npublication year: ")
		                                .append(this.year)
		                                .append("\n");
		return answer.toString();
	}
}
