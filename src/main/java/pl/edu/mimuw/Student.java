package pl.edu.mimuw;

import java.util.HashSet;

public class Student extends Person {
  private final HashSet<Program> programs;
  private boolean active;

  public Student(String name, String last_name, String birthNumber, int index, HashSet<Program> programs, boolean active) {
    super(name, last_name, birthNumber, index);
    this.active = active;
    this.programs = programs;
  }

  public Student(String name, String last_name, String birthNumber, int index) {
    this(name, last_name, birthNumber, index, new HashSet<>(), true);
  }

  public void addProgram(Program p) {
    programs.add(p);
  }
  public void endStudies() { active = false; }

  public HashSet<Program> getPrograms() {
    return new HashSet<>(programs);
  }

  public boolean isActive() {
    return active;
  }

  @Override
  public String toString() {
    return "Im an " + (active ? "active" : "inactive") + " Student, " + super.toString();
  }
}
