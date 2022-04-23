package pl.edu.mimuw;

public class Program {

  private final String faculty;
  private final String major;
  private int year;

  public Program(String faculty, String major, int year) {
    this.faculty = faculty;
    this.major = major;
    this.year = year;
  }

  public Program(String faculty, String major) {
    this(faculty, major, 1);
  }

  public Program(Program program) {
    this(program.faculty, program.major, program.year);
  }

  public void incrementYear() {
    this.year += 1;
  }

  public String getFaculty() {
    return this.faculty;
  }

  public String getMajor() {
    return this.major;
  }

  public int getYear() {
    return this.year;
  }

  @Override
  public String toString() {
    return year + " year of " + major + " at " + faculty;
  }
}
