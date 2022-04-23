package pl.edu.mimuw.usos.People;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
  private final List<Integer> programsIds;
  private String studyStatus;

  public Student(String firstName, String secondName, String birthDate, String studyStatus) {
    super(firstName, secondName, birthDate);
    this.programsIds = new ArrayList<Integer>();
    this.studyStatus = studyStatus;
  }

  public void addProgram(Integer programId) {
    this.programsIds.add(programId);
  }

  public void changeStatus(String status) {
    this.studyStatus = status;
  }

  public String getStudyStatus() {
    return this.studyStatus;
  }

  public ArrayList<Integer> getProgramsIds() {
    return new ArrayList<Integer>(this.programsIds);
  }

  public String studentDetailedInfo() {
    return basicInfo() + ", has status: " + studyStatus;
  }
}
