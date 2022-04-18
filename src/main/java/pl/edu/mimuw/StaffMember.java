package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class StaffMember extends Person {
  private Set<Publication> publications;

  public StaffMember(String firstname, String lastname, String gender, String personalID, int indexNumber) {
    super(firstname, lastname, gender, personalID, indexNumber);
    this.publications = new HashSet<>();
  }

  public void WritePublication(Publication pub) {
    this.publications.add(pub);
  }

  @Override
  public String toString() {
    var sb = new StringBuilder();
    sb.append("Staff member ").append(super.toString()).append("\npublications:");
    for (var pub : this.publications) {
      sb.append("\n").append(pub.toString());
    }
    return sb.toString();
  }
}
