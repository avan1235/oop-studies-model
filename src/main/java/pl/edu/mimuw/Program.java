package pl.edu.mimuw;

import java.util.ArrayList;

public class Program {
  private String name;
  private String programType;
  private ArrayList<Subject> obligatory;
  private ArrayList<Subject> facultative;

  public Program() {
  }

  public Program(String name, String programType) {
    this.name = name;
    this.programType = programType;
  }

  public Program(String name, String programType, ArrayList<Subject> obligatory, ArrayList<Subject> facultative) {
    this(name, programType);
    this.obligatory = obligatory;
    this.facultative = facultative;
  }

  public String toString(boolean withSubjects) {
    var sb = new StringBuilder();
    sb.append(this.name).append(", ").append(this.programType);
    if (withSubjects) {
      sb.append("Obligatory sobjects: ");
      for (var subject : obligatory) {
        sb.append(subject).append(" ");
      }
      sb.append(" Facultative  sobjects: ");
      for (var subject : facultative) {
        sb.append(subject).append(" ");
      }
    }
    sb.append("; ");
    return sb.toString();
  }
}
