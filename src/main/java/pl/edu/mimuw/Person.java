package pl.edu.mimuw;

public abstract class Person {
  protected String name;
  protected String pesel;
  protected boolean isAlive;

  public Person() {
    this.isAlive = true;
  }

  public Person(String name, String pesel) {
    this();
    this.pesel = pesel;
    this.name = name;
  }

  public void die() {
    System.out.println("\n" + this + " has died.");
    this.isAlive = false;
  }
}
