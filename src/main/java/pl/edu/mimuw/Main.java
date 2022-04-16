package pl.edu.mimuw;

public class Main {
	public static void main(String[] args) {
		var usos = new Usos();
		
		var student1 = new Student("Jan", "Kowalski", "123456", 1999, "42069");
		student1.addProgram(new Program("mathematics", "MIMUW"));
		student1.addProgram(new Program("physics", "FUW"));
		System.out.println(student1);
		usos.addUser(student1);
		
		var student2 = new Student("Anna", "Nowak", "654321", 2002, "2137");
		student2.addProgram(new Program("journalism", "WDIBUW"));
		System.out.println(student2);
		usos.addUser(student2);
		
		var lecturer1 = new Lecturer("Paweł", "Strzelecki", "13579", 1963, "professor");
		lecturer1.addPublication(new Publication("On the differentiability of solutions of quasilinear elliptic equations", 1993));
		lecturer1.addPublication(new Publication("How to measure volume with a thread", 2005));
		System.out.println(lecturer1);
		usos.addUser(lecturer1);
		
		System.out.println("number of users: " + usos.getNumberOfUsers() + "\n");
	}
}
