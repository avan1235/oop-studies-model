package pl.edu.mimuw;

public class Program {
  private final String faculty;
  private final String major; //kierunek
  private int year;

  public Program(String faculty, String major, int year) {
    this.faculty = faculty;
    this.major = major;
    this.year = year;
  }

  public void incrementYear() {
    this.year++;
  }

  public String getName() {
    return this.major;
  }

  public String toString() {
    return faculty + ", " + major + ", on year: " + year + "\n";
  }
}
