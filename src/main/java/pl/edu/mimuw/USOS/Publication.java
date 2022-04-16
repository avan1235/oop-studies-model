package pl.edu.mimuw.USOS;

public class Publication {

  private final String title;
  private final Academic author;


  public Publication(String title, Academic author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle(){
    return this.title;
  }

  public Academic getAuthor(){
    return this.author;
  }
}
