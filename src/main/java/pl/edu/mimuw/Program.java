package pl.edu.mimuw;

public class Program {
  private int year;
  private final String faculty;
  private final String major;

  public Program(int year, String faculty, String major) {
    this.year = year;
    this.faculty = faculty;
    this.major = major;
  }

  public void incremetYear() {
    this.year++;
  }

  public int getYear() {
    return this.year;
  }

  public String getFaculty() {
    return this.faculty;
  }

  public String getMajor() {
    return this.major;
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append("faculty: ").append(faculty).append(", major: ").append(major).append(", year: ").append(year);
    return sb.toString();
  }
}
