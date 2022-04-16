package pl.edu.mimuw.usos;

public abstract class Person {

  private final String firstName;
  private final String lastName;
  private final String pesel;
  private final int index;

  public Person(String firstName, String lastName, String pesel, int index) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.pesel = pesel;
    this.index = index;
  }

  /**
   * @return the complete name of the person.
   */
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  /**
   * @return the id.
   */
  public int getIndex() {
    return this.index;
  }

  public abstract void incrementYears();

  @Override
  public String toString() {
    return this.getFullName() + " (" + this.pesel + ")";
  }
}
