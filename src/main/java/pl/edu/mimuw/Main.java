package pl.edu.mimuw;

import pl.edu.mimuw.usos.PersonFactory;
import pl.edu.mimuw.usos.Student;
import pl.edu.mimuw.usos.SystemUsos;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // TODO: play with your students and staff members and show how
    //  they describe themselves

    final var usos = new SystemUsos();
    final var csStudents = new Student[] {
      PersonFactory.createCSStudent("Jan", "Kowalski", "12345678901", "543789"),
      PersonFactory.createCSStudent("Maria", "Kowalska", "12345678902", "452126"),
      PersonFactory.createCSStudent("Piotr", "Chalal", "12345883498", "453455")
    };

    Arrays.stream(csStudents).forEach(usos::addPerson);

    System.out.println(usos);
  }
}
