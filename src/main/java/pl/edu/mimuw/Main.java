package pl.edu.mimuw;

import pl.edu.mimuw.usos.*;

import java.util.Arrays;
import java.util.Objects;

public class Main {

  public static void main(String[] args) {

    final var usos = new SystemUsos();
    final var csStudents = new Student[]{
      PersonFactory.createCSStudent("Jan", "Kowalski", "12345678901", "543789"),
      PersonFactory.createCSStudent("Maria", "Kowalska", "12345678902", "452126"),
      PersonFactory.createCSStudent("Piotr", "Chalal", "12345883498", "453455")
    };
    final var mathStudents = new Student[]{
      PersonFactory.createMathStudent("Mariusz", "Tyci", "12345142201", "086421"),
      PersonFactory.createMathStudent("Anna", "Iska", "12324565402", "871233")
    };
    final var jsimStudents = new Student[]{
      PersonFactory.createJSIMStudent("Stanisław", "Malutki", "22355673921", "746391")
    };
    final var staff = new Staff[]{
      PersonFactory.createStaffMember("Piotr", "Ziemiak", "323475427231", "Analysis Lecturer", "Professor", "Analysis for CS"),
      PersonFactory.createStaffMember("Anna", "Kowalska", "323477527232", "Programming Lecturer", "Doctor", "Introduction to Programming"),
      PersonFactory.createStaffMember("Adam", "Jang", "223453529033", "Programming Teacher", "Master", "CS Exercises")
    };

    Arrays.stream(staff)
      .filter(s -> Objects.equals(s.getFullName(), "Piotr Ziemiak"))
      .findFirst()
      .ifPresent(s -> s.addPublication("Foundation of Mathematics"));
    Arrays.stream(staff)
      .filter(s -> Objects.equals(s.getFullName(), "Piotr Ziemiak"))
      .findFirst()
      .ifPresent(s -> s.addPublication(new Publication("Discreet Mathematics and its Applications", 16)));
    Arrays.stream(staff)
      .filter(s -> Objects.equals(s.getFullName(), "Anna Kowalska"))
      .findFirst()
      .ifPresent(Staff::incrementYears);

    Arrays.stream(csStudents).forEach(usos::addPerson);
    Arrays.stream(mathStudents).forEach(usos::addPerson);
    Arrays.stream(jsimStudents).forEach(Student::incrementYears);
    Arrays.stream(jsimStudents).forEach(usos::addPerson);
    Arrays.stream(staff).forEach(usos::addPerson);

    final Person kindaStudentKindaNot = PersonFactory.createCSStudent("Jan", "Kowalski", "12345678933", "543789");
    usos.addPerson(kindaStudentKindaNot);
    kindaStudentKindaNot.incrementYears();
    //Worth noting that the following line will throw an exception
    //System.out.println(kindaStudentKindaNot.getPrograms());

    final var exampleStudent = PersonFactory.createStudent("Adam", "Strong", "12345555980", "543678", new Program(2, "WPiA", "Law"));
    usos.addPerson(exampleStudent);

    System.out.println(usos);

    //Purely to play with the implementation
    System.out.println("After a year passes (well, assuming everybody passed):");
    usos.getPeople().values().forEach(Person::incrementYears);
    System.out.println(usos);
  }
}
