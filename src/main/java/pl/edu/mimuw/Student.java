package pl.edu.mimuw;

import java.util.ArrayList;

public class Student extends Person {

  ArrayList<Program> programs = new ArrayList<Program>();

  public Student(String firstName, String surname, int numberIndex) {
    super(firstName, surname, numberIndex);
    this.programs = new ArrayList<Program>(programs);
  }


  public void addProgram(Program program) {
    this.programs.add(program);
  }

  public ArrayList<Program> getPrograms() {
    var resultPrograms = new ArrayList<Program>();
    for (var singleProgram : this.programs) {
      resultPrograms.add(singleProgram);
    }
    return resultPrograms;
  }

  //increment single year
  public void incrementYear(String programName) {
    var resultPrograms = new ArrayList<Program>();
    boolean found = false;
    for (var singleProgram : this.programs) {
      if (singleProgram.getName() != programName) {
        resultPrograms.add(singleProgram);
      } else {
        found = true;
        var helpProgram = singleProgram;
        helpProgram.incrementYear();
        resultPrograms.add(helpProgram);
      }
    }
    var sb = new StringBuilder();
    if(found) {
      sb.append(this.getNames())
      .append(" has passed another year of ")
      .append(programName);
    }
    else{
      sb.append(this.getNames())
        .append(" has never attended ")
        .append(programName);
    }
    System.out.println(sb.toString());
    this.programs = resultPrograms;
  }


  public String toString() {
    var sb = new StringBuilder();
    sb.append("Student called: ");
    sb.append(this.firstName).append(" ");
    sb.append(this.surname);
    sb.append("\nNumber of index: ");
    sb.append(this.numberIndex);
    sb.append("\nThey attend such programs: \n");
    for(var pro : this.programs){
      sb.append(pro.toString());
    }
    return sb.toString();
  }
}
