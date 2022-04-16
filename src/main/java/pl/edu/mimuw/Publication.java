package pl.edu.mimuw;

public class Publication {
  private String title;
  private Employee author;

  public Publication(String title, Employee author) {
    this.title = title;
    this.author = author;

    author.addPublication(this);
  }

  public String getTitle() {
    return title;
  }

  public Person getAuthor() {
    return author;
  }
}
