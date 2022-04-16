package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StaffMember extends Person {
    private Set <Publication> publications;
    public StaffMember(String firstName, String surname, int numberIndex){
    super(firstName, surname, numberIndex);
    this.publications = new HashSet<>() ;
  }
  public void addPublication(Publication newPublication){
      this.publications.add(newPublication);
  }
  public String toString() {
    var sb = new StringBuilder();
    sb.append("Staff Member called: ");
    sb.append(this.firstName).append(" ");
    sb.append(this.surname);
    sb.append("\nNumber of index: ");
    sb.append(this.numberIndex);
    sb.append("\nThey wrote such publications: \n");
    for(var pub : this.publications){
      sb.append(pub.toString()).append("");
    }
    return sb.toString();
  }
}
