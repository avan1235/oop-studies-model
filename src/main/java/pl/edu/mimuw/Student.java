package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

  private List<Program> programs;

  /**
   * constructor used mainly for copying
   */
  public Student(
    String number,
    String firstName,
    String lastName,
    List<Program> programs
  ) {
    super(number, firstName, lastName);
    this.programs = programs;
  }

  public Student(
    String number, 
    String firstName, 
    String lastName
  ) {
    super(number, firstName, lastName);
    this.programs = new ArrayList<Program>();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb
      .append("I'm ")
      .append(super.fullName())
      .append(" number: ")
      .append(number)
      .append("\n")
      .append("My programs are:")
      .append("\n");
    for (Program program : programs) {
      sb.append(program.toString()).append("\n");
    }
    return sb.toString();
  }

  @Override
  /**
   * Programs are non-mutable - no need for copying
   */
  public void addProgram(Program program) {
    programs.add(program);
  }

  @Override
  public Person createCopy() {
    var copyOfPrograms = new ArrayList<Program>();
    for (Program program : programs) {
      copyOfPrograms.add(program);
    }
    return new Student(number, firstName, lastName, copyOfPrograms);
  }
}
