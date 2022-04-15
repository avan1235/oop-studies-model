package pl.edu.mimuw.usos;

import java.util.Map;

public abstract class PersonFactory {

  private final static Program CS = new Program("MIMUW", "Computer Science");
  private final static Program MATH = new Program("MIMUW", "Math");
  private static int iterator = 0;

  public static Student createCSStudent(String firstName, String lastName, String pesel, String number) {
    return new Student(firstName, lastName, pesel, iterator++, number, CS);
  }

  public static Student createMathStudent(String firstName, String lastName, String pesel, String number) {
    return new Student(firstName, lastName, pesel, iterator++, number, MATH);
  }

  public static Student createStudent(String firstName, String lastName, String pesel, String number, Program program) {
    return new Student(firstName, lastName, pesel, iterator++, number, program);
  }
}
