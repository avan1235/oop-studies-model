package pl.edu.mimuw.usos.People;

import java.util.ArrayList;

public abstract class Person {
  private final String firstName;
  private final String secondName;
  private final String birthDate;


  protected Person(String firstName, String secondName, String birthDate) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return firstName + " " + secondName;
  }

  protected String basicInfo() {
    return firstName + " " + secondName + ", birth at: " + birthDate;
  }

  public abstract ArrayList<Integer> getProgramsIds();

}
