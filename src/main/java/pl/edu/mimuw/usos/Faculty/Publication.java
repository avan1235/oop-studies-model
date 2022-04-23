package pl.edu.mimuw.usos.Faculty;

public class Publication {
  private final String name;
  private final Integer[] authors;

  public Publication(String name, Integer[] authors) {
    this.name = name;
    this.authors = authors;
  }

  @Override
  public String toString() {
    return "Publication - " + name;
  }
}
