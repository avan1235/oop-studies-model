package pl.edu.mimuw;

public class Subject {
  private final String id;
  private final String name;
  private final String type;
  private final double subjectECTS;

  public Subject(String prefix, String name, String type, double subjectECTS) {
    this.name = name;
    this.type = type;
    this.subjectECTS = subjectECTS;
    this.id = Faculty.assignSubjectID(prefix);
  }

  public double getSubjectECTS() {
    return subjectECTS;
  }

  public String toString() {
    return "(" + this.id + ") " + this.name + ", " + this.type + ", " + this.subjectECTS + " ECTS";
  }
}
