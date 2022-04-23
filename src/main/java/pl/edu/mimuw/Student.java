package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Student extends Person {
  private final List<Program> programs;

  public Student(String firstname, String lastname, int id, int day, int month, int year) {
    super(firstname, lastname, id, day, month, year);
    this.programs = new ArrayList<>();
  }

  public void addProgram(Program program) {
    this.programs.add(program);
  }

  public void incrementYear() {
    for (final var program : programs) program.incrementYear();
  }

  public List<Program> getPrograms() { return programs.stream().map(Program::new).collect(Collectors.toList()); }

  @Override
  public String toString() {
    final var sb = new StringBuilder();
    sb.append("--- Student ").append(getFullName()).append(" ---\n")
      .append("Date of birth: ").append(getBirthday()).append("\n")
      .append("ID number: ").append(idnumber).append("\n")
      .append("is attending:");

    for (final var program : programs) sb.append("\n").append("  - ").append(program);

    return sb.append("\n").toString();
  }
}
