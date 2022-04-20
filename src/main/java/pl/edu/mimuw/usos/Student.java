package pl.edu.mimuw.usos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student extends Person {
  private final List<Program> programs;
  private final String number;

  public Student(String firstName, String lastName, String pesel, int index, String number, ArrayList<Program> programs) {
    super(firstName, lastName, pesel, index);
    this.number = number;
    this.programs = new ArrayList<>(programs);
  }

  public Student(String firstName, String lastName, String pesel, int index, String number, Program program) {
    super(firstName, lastName, pesel, index);
    this.number = number;
    this.programs = new ArrayList<>();
    this.programs.add(new Program(program));
  }

  /**
   * Increments all program's years.
   */
  @Override
  public void incrementYears() {
    for (Program program : this.programs) {
      program.incrementYear();
    }
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder("Student ");

    sb.append(super.toString()).append(" ").append(number).append(" studies:\n");
    for (Program program : this.getPrograms()) {
      sb.append("\t\t").append(program.toString()).append("\n");
    }

    return sb.toString();
  }

  /**
   * @return the copied list of programs.
   */
  private List<Program> getPrograms() {
    return this.programs.stream().map(Program::new).collect(Collectors.toList());
  }
}
