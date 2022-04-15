package pl.edu.mimuw.usos;

import java.util.ArrayList;

public class Student extends Person {
  private final ArrayList<Program> programs;
  private String number;

  public Student(String firstName, String lastName, String pesel, int index, String number, ArrayList<Program> programs) {
    super(firstName, lastName, pesel, index);
    this.number = number;
    this.programs = programs;
  }

  public Student(String firstName, String lastName, String pesel, int index, String number, Program program) {
    super(firstName, lastName, pesel, index);
    this.number = number;
    this.programs = new ArrayList<Program>();
    this.programs.add(program);
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder("Student ");

    sb.append(super.toString()).append(" ").append(number).append(" studies:\n");
    for (Program program : programs) {
      sb.append("\t\t").append(program.toString()).append("\n");
    }

    return sb.toString();
  }
}
