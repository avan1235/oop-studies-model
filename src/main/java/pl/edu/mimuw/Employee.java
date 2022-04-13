package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class Employee extends Person {
  private final HashSet<Publication> publications;

  public Employee(String name, String last_name, String birthNumber, int index, HashSet<Publication> p) {
    super(name, last_name, birthNumber, index);
    publications = p;
  }

  public Employee(String name, String last_name, String birthNumber, int index) {
    this(name, last_name, birthNumber, index, new HashSet<>());
  }

  public Set<Publication> getPublications() {
    return new HashSet<>(publications);
  }

  public void addPublication(Publication p) {
    publications.add(p);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Im an employee");
    sb.append(", my name is ");
    sb.append(name + " " + last_name);
    sb.append(", my publications are: ");
    for (var p : publications)
      sb.append(p);
    return sb.toString();
  }
}
