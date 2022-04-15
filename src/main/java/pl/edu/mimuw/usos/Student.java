package pl.edu.mimuw.usos;

import java.util.ArrayList;

public class Student extends Person {
  private final String id;
  private final ArrayList<ActiveProgram> activePrograms;

  public Student(int yearOfBirth, String firstName, String lastName, String gender, String identificationNumber) {
    super(yearOfBirth, firstName, lastName, gender, identificationNumber);
    this.activePrograms = new ArrayList<>();
    this.id = firstName.charAt(0) + lastName.charAt(0) + identificationNumber;
  }

  public Student(Person person) {
    super(person);
    this.activePrograms = new ArrayList<>();
    this.id = person.getFirstName().charAt(0) + person.getLastName().charAt(0) + person.getIdentificationNumber();
  }

  public String getId() {
    return id;
  }

  public ArrayList<ActiveProgram> getActivePrograms() {
    return activePrograms;
  }

  public void addProgram(ActiveProgram program) {
    this.activePrograms.add(program);
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append(super.toString()).append(". I'm a student.\n");
    sb.append("I study ").append(activePrograms.size()).append(" programs.\n");
    for (var program: activePrograms) {
      sb.append(program.toString()).append("\n");
    }

    return sb.toString();
  }
}
