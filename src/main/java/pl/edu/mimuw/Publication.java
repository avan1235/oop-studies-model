package pl.edu.mimuw;

public class Publication {
  private final StaffMember author;

  private final String title;

  public Publication(StaffMember author, String title) {
    this.author = author;
    this.title = title;
  }

  public String getTitle() { return this.title; }

  @Override

  public String toString() { return author.getFullName() + ", " + title; }

}
