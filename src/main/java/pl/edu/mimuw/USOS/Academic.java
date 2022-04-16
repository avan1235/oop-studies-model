package pl.edu.mimuw.USOS;

import java.util.HashSet;
import java.util.Set;

public class Academic extends People {

  private String academicTitle;
  private final Set<Publication> publications;

  public Academic(String name, String surname, String academicTitle, String BirthPlace) {
    super(name, surname, BirthPlace);
    this.academicTitle = academicTitle;
    this.publications = new HashSet<Publication>();
  }

  public String getAcademicTitle() {
    return this.academicTitle;
  }

  public void setAcademicTitle(String title) {
    this.academicTitle = title;
  }

  public Set<Publication> getPublications(){
    return new HashSet<>(publications);
  }

  public void addPublication(Publication book){
    this.publications.add(book);
  }

  @Override
  public String printQuote(){
    return "Hehe, to co drugi termin";
  }

  @Override
  public String toString(){
    StringBuilder result = new StringBuilder();
    result.append("Academic: ")
      .append(this.getAcademicTitle()).append(" ")
      .append(this.getName()).append(" ").append(this.getSurname()).append("\n");
    return result.toString();
  }
}
