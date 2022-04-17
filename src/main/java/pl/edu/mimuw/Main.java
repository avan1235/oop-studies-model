package pl.edu.mimuw;
import pl.edu.mimuw.usosweb.*;

public class Main {

  public static void main(String[] args) {
    var exampleStudent1 = PersonFactory.createStudent("Baba", "Hassan");
    var exampleStudent2 = PersonFactory.createStudent("Ozjasz", "Goldberg");
    var exampleProgram = new Program("Informatyka", 1);
    exampleStudent1.assignProgram(exampleProgram);
    var exampleStaffMember = PersonFactory.creatStaffMember("Marcin", "Goleszowski");
    var exampleCourse = new Course("Pemat", exampleStaffMember);
    var examplePublication = new Publication(exampleStaffMember, "Maths or smth");
    exampleStaffMember.addPublication(examplePublication);
    exampleStaffMember.addPublication("Maths or smth 2: Electric Bogaloo");
    System.out.println(exampleStaffMember);
    exampleCourse.addAttender(exampleStudent1);
    exampleStudent2.assignCourse(exampleCourse);
    System.out.println(exampleCourse);
    exampleCourse.removeAttender(exampleStudent1);
    System.out.println(exampleCourse);
    exampleStudent2.resignFromCourse(exampleCourse);
    System.out.println(exampleCourse);
    System.out.println(PersonFactory.peopleToString());
  }
}
