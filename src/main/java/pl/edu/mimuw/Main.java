package pl.edu.mimuw;

public class Main {

  public static void main(String[] args) {
    var mim = new USOS("MIMUW USOS");
    var dean = PersonFactory.createStaffMember("Paweł", "Strzelecki", "male", "12345678901");
    dean.WritePublication(new Publication("Analiza matematyczna I (skrypt wykładu)", "mathematical analysis"));
    mim.addStaffMember(dean);
    var student1=PersonFactory.createStudent("Mateusz",  "Scharmach", "male", "02137696969", new Program(1, "MIM", "JSIM"));
    var student2=PersonFactory.createStudent("Krzysztof", "Wolicki", "male", "21154206969", new Program(2, "MISMAP", "Physics"));
    var student3=PersonFactory.createStudent("Michał", "Trzebuchowski", "male", "42021373180");
    student2.addProgram(new Program(1, "MISMAP", "Informatics"));
    student3.addProgram(new Program(1, "MIM", "Mathematics"));
    mim.addStudent(student1);
    mim.addStudent(student2);
    mim.addStudent(student3);
    mim.incremetYears();
    System.out.println(mim.toString());
  }
}
