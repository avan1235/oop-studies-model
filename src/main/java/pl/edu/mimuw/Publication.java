package pl.edu.mimuw;

public class Publication {
  public final String name;
  public final Person[] authors;

  public Publication(String name, Person[] authors) {
    this.name = name;
    this.authors = authors;
  }

  @Override
  public String toString(){
    return name;
  }
}
