package pl.edu.mimuw;

public abstract class Person {
  final protected String name;
  final protected int age;
  final private int id;

  static private int curID = 0;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    this.id = ++curID;
  }

  protected Person(Person other) {
    this.name = other.name;
    this.age = other.age;
    this.id = other.id;
  }

  @Override
  public abstract String toString();

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int getId() {
    return this.id;
  }
}
