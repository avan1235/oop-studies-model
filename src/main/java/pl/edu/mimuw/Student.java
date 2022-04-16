package pl.edu.mimuw;

import java.util.ArrayList;

public class Student extends Person{
  private String StudentID;
  private ArrayList<Program>programs;
  boolean isActive;

  Student()
  {
    this.isActive=true;
  }

  Student(String name,String pesel, String StudentID)
  {
    super(name,pesel);
    this.isActive=true;
    this.StudentID=StudentID;
  }

  Student(String name,String StudentID,String pesel,ArrayList<Program>programs)
  {
    this(name,pesel,StudentID);
    this.programs=programs;
  }

  public void resignFromProgram(Program program)
  {
    programs.remove(program);
  }

  public void quitStudies()
  {
    this.programs.clear();
    this.isActive=false;
  }

  @Override
  public String toString() {
    var sb=new StringBuilder();
    sb.append("Student: ")
      .append(this.name)
      .append(", PESEL: ")
      .append(this.pesel)
      .append(", Student ID: ")
      .append(this.StudentID);
      if(this.isActive)
      {
        sb.append(", Student active. Programs: ");
        for (var program:programs)
        {
          sb.append(program.toString(false));
        }
      }
    return sb.toString();
  }
}
