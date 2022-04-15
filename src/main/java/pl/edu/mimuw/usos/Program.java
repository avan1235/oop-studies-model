package pl.edu.mimuw.usos;

public class Program {

  private final String faculty;
  private final String major;
  private int year;

  public Program(int year, String faculty, String major) {
    this.year = year;
    this.faculty = faculty;
    this.major = major;
  }

  public Program(String faculty, String major) {
    this(1, faculty, major);
  }

  public Program(Program program) {
    this(program.year, program.faculty, program.major);
  }

  public void incrementYear() {
    this.year++;
  }

  @Override
  public String toString() {
    return this.faculty + " " + this.major + " year: " + this.year;
  }
}
