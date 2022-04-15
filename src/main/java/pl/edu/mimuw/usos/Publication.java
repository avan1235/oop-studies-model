package pl.edu.mimuw.usos;

public class Publication {
  private final String author;
  private final String name;
  private final int year;

  public Publication(String author, String name, int year) {
    this.author = author;
    this.name = name;
    this.year = year;
  }

  public String getAuthor() {
    return author;
  }

  public String getName() {
    return name;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return this.name + " published by " + this.author + " in " + this.year;
  }
}
