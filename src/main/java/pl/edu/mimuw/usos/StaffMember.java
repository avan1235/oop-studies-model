package pl.edu.mimuw.usos;

import java.util.HashSet;
import java.util.Set;

public class StaffMember extends Person {
    private String title;
    private final HashSet<Publication> publications;

  public StaffMember(int yearOfBirth, String firstName, String lastName, String gender, String identificationNumber, String title) {
    super(yearOfBirth, firstName, lastName, gender, identificationNumber);
    this.title = title;
    this.publications = new HashSet<>();
  }

  public StaffMember(Person person, String title) {
    super(person);
    this.title = title;
    this.publications = new HashSet<>();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HashSet<Publication> getPublications() {
    return publications;
  }

  public void addPublication(Publication publication) {
    this.publications.add(publication);
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append(super.toString()).append(". I'm a ").append(this.title).append(".\n");
    sb.append("I published ").append(this.publications.size()).append(" publications.\n");
    for (var publication: publications) {
      sb.append(publication.toString()).append("\n");
    }
    return sb.toString();
  }
}
