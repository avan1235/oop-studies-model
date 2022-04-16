package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class Staff extends Person {

  private String position;
  private Set<Publication> publications;

  /**
   * constructor used mainly for copying
   */
  public Staff(String number, String firstName, String lastName, String position, Set<Publication> publications) {
    super(number, firstName, lastName);
    this.position = position;
    this.publications = publications;
  }

  public Staff(String number, String firstName, String lastName, String position) {
    super(number, firstName, lastName);
    this.position = position;
    this.publications = new HashSet<Publication>();
  }

  @Override
  public String fullName() {
    return position + " " + super.fullName();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb
      .append("I'm ")
      .append(fullName())
      .append(" ")
      .append("number: ")
      .append(number)
      .append("\n")
      .append("I published:");
    for (Publication publication : publications) {
      sb.append("\n").append(publication.toString());
    }
    sb.append("\n");
    return sb.toString();
  }

  @Override
  public Person createCopy() {
    var copyOfPublications = new HashSet<Publication>();
    for (Publication publication : publications) {
      copyOfPublications.add(publication);
    }
    return new Staff(number, firstName, lastName, position, copyOfPublications);
  }

  @Override
   /**
   * Publications are non-mutable - no need for copying
   */
  public void addPublication(Publication publication) {
    publications.add(publication);
  }
}
