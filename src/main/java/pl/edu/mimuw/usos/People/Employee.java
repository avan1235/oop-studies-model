package pl.edu.mimuw.usos.People;

import pl.edu.mimuw.usos.Faculty.Publication;

import java.util.ArrayList;
import java.util.List;

public class Employee extends Person {
  private final List<Integer> programsIds;
  private final List<Publication> publications;

  public Employee(String firstName, String secondName, String birthDate) {
    super(firstName, secondName, birthDate);
    this.programsIds = new ArrayList<Integer>();
    this.publications = new ArrayList<Publication>();
  }

  public void addProgram(Integer programId) {
    this.programsIds.add(programId);
  }

  public void addPublication(Publication publication) {
    this.publications.add(publication);
  }

  public ArrayList<Integer> getProgramsIds() {
    return new ArrayList<Integer>(this.programsIds);
  }

  public ArrayList<Publication> getPublications() {
    return new ArrayList<Publication>(this.publications);
  }


  public String employeeDetailedInfo() {
    return basicInfo() + ", publicated: " + publications;
  }

}
