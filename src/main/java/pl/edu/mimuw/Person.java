package pl.edu.mimuw;

public class Person {
  private final String name;
  private final String id;

  public Person(String name, String id) {
    this.name = name;
    this.id = id;
  }

  public String getOccupation() {
    return "unemployed";
  }

  public String getStatus() {
    return "do nothing";
  }

  @Override
  public String toString() {
    return "Hello, my name's " + name + " (" + id + ") and I'm "
      + getOccupation() + ". I currently " + getStatus() + ".";
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }
}
