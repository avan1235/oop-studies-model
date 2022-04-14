package pl.edu.mimuw;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Publication {
  private final String title;
  private String publicationAbstract;
  private final Set<StaffMember> authors;

  public Publication(String title, String publicationAbstract, StaffMember[] authors) {
    this.title = title;
    this.publicationAbstract = publicationAbstract;
    this.authors = new HashSet<>(List.of(authors));
  }

  public Publication(String title, String publicationAbstract, StaffMember author) {
    this(title, publicationAbstract, new StaffMember[]{author});
  }

  public Publication(String title, StaffMember[] authors) {
    this(title, null, authors);
  }

  public Publication(String title, StaffMember author) {
    this(title, null, author);
  }

  public void addAbstract(String publicationAbstract) {
    this.publicationAbstract = publicationAbstract;
  }

  public void addAuthors(StaffMember[] authors) {
    this.authors.addAll(List.of(authors));
  }

  public void addAuthors(StaffMember author) {
    this.authors.add(author);
  }

  private String getAuthorList() {
    StringBuilder res = new StringBuilder();
    for (var author : this.authors)
      res.append(author.getName()).append(" ");
    return res.toString();
  }

  @Override
  public String toString() {
    return this.getAuthorList() + "- " + this.title + ". Abstract: \"" + this.publicationAbstract + "\"";
  }
}
