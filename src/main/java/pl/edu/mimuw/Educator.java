package pl.edu.mimuw;

import java.util.ArrayList;

public class Educator extends Employee{
  private String rank;
  //private ArrayList<Program>programsInvolved;
  private ArrayList<Subject>subjectsTaught;
  //private ArrayList<Subject>subjectsCoordinated;

  public Educator()
  {

  }
  public Educator(String name,String pesel,String EmployeeId,String rank)
  {
    super(name,pesel,EmployeeId);
    this.rank=rank;
  }

  public Educator(String name,String pesel,String EmployeeId,String rank/*ArrayList<Program>programsInvolved*/,ArrayList<Subject>subjectsTaught)
  {
    this(name,pesel,EmployeeId,rank);
    //this.programsInvolved=programsInvolved;
    this.subjectsTaught=subjectsTaught;
  }

  public void resignFromTeaching(Subject subject)
  {
    this.subjectsTaught.remove(subject);
  }

  @Override
  public String toString() {
    var sb=new StringBuilder();
    sb.append("Educator: ").append(this.name)
      .append(", rank: ").append(this.rank)
      .append(", subjects taught: ");
    for(var subject:subjectsTaught)
    {
      sb.append(subject.toString(false)).append(" ");
    }
    return sb.toString();
  }
}
