package pl.edu.mimuw;

public class Course {
  private final Program program;
  private final String courseName;

  public Course(Program program, String courseName) {
    this.program = program;
    this.courseName = courseName;
  }

  public Course(Course other) {
    this(other.getProgram(), other.courseName);
  }

  public String toString() {
    return "Course " + this.courseName + " in program " + this.program.getName();
  }

  public Program getProgram() {
    return new Program(this.program);
  }

  public String getName() {
    return this.courseName;
  }
}
