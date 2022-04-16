package pl.edu.mimuw;

import java.util.ArrayList;

public class Student extends Person {
  private ArrayList<Program> programs;

  public Student(String firstname, String lastname, String gender, String personalID, int indexNumber) {
    super(firstname, lastname, gender, personalID, indexNumber);
    this.programs=new ArrayList<Program>();
  }

  public Student(String firstname, String lastname, String gender, String personalID, int indexNumber, Program program) {
    super(firstname, lastname, gender, personalID, indexNumber);
    this.programs=new ArrayList<Program>();
    programs.add(program);
  }

  public void incremetYears() {
    for(var pro: this.programs) {
      pro.incremetYear();
    }
  }

  public void addProgram(Program pro) {
    this.programs.add(pro);
  }

  public ArrayList<Program> getPrograms() {
    var list=new ArrayList<Program>();
    for(var pro: this.programs) {
      list.add(new Program(pro.getYear(), pro.getFaculty(), pro.getMajor()));
    }
    return list;
  }

  @Override
  public String toString() {
    var sb=new StringBuilder();
    sb.append("Student ").append(super.toString()).append("\nprograms:");
    for(var pro: this.programs) {
      sb.append("\n").append(pro.toString());
    }
    return sb.toString();
  }
}
