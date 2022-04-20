package pl.edu.mimuw.usos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Staff extends Person {
  private final String position;
  private final String degree;
  private final Set<Publication> publications;

  public Staff(String firstName, String lastName, String pesel, int index, String position, String degree, Set<Publication> publications) {
    super(firstName, lastName, pesel, index);
    this.position = position;
    this.degree = degree;
    this.publications = new HashSet<>(publications);
  }

  public Staff(String firstName, String lastName, String pesel, int index, String position, String degree, String title) {
    this(firstName, lastName, pesel, index, position, degree, new HashSet<>());
    publications.add(new Publication(title));
  }

  /**
   * Adds a publication to the list.
   *
   * @param publication publication to be added.
   */
  public void addPublication(Publication publication) {
    publications.add(new Publication(publication));
  }

  /**
   * Adds a new publication to the list of publications as if it was just created.
   *
   * @param title title of the publication.
   */
  public void addPublication(String title) {
    publications.add(new Publication(title));
  }

  /**
   * Increments the age of all publications.
   */
  @Override
  public void incrementYears() {
    for (Publication publication : this.publications) {
      publication.incrementYear();
    }
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder();

    sb.append("(").append(this.degree).append(") ").append(super.toString()).append(" works as: ")
      .append(this.position).append(". Their publications are:\n");
    for (Publication publication : this.getPublications()) {
      sb.append(publication.toString()).append("\n");
    }

    return sb.toString();
  }

  /**
   * @return the copied set of publications.
   */
  private Set<Publication> getPublications() {
    return this.publications.stream().map(Publication::new).collect(Collectors.toSet());
  }
}
