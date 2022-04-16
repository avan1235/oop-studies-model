package pl.edu.mimuw;

public abstract class Person {
  private String name;
  static int nextIndex = 0;
  private int index;

  public Person(String name) {
    this.name = name;
    this.index = nextIndex++;
  }

  public String getName() {
    return name;
  }

  public int getIndex() {
    return index;
  }
}
