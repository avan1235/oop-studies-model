package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {
  private Program program;
  private final Set<Subject> passedSubjects;

  public Student(String name, String id, Program program) {
    super(name, id);
    this.program = program;
    this.passedSubjects = new HashSet<>();
  }

  @Override
  public String getOccupation() {
    StringBuilder res = new StringBuilder();
    res.append("a student");
    if (!this.passedSubjects.isEmpty()) {
      res.append("\nI passed following subjects:");
      for (var subject : this.passedSubjects)
        res.append("\n * ").append(subject);
    }
    return res.toString();
  }

  @Override
  public String getStatus() {
    if (this.program != null)
      return "study " + program.getName();
    else
      return super.getStatus();
  }

  public boolean meetsRequirements(Program program) {
    return this.passedSubjects.containsAll(program.getPrerequisites());
  }

  public void applyForProgram(Program newProgram) {
    if (this.meetsRequirements(newProgram)) {
      System.out.println(this.getName() + " zapisał się na " + newProgram.getName() + ".");
      this.program = newProgram;
    } else
      System.out.println(this.getName() + " nie spełnia wymagań dla kursu " + newProgram.getName() + "!");
  }

  public void finishProgram() {
    assert this.program != null;
    System.out.println(this.getName() + " zdał kurs " + this.program.getName() + "!");
    this.passedSubjects.addAll(this.program.getSubjects());
    this.program = null;
  }
}
