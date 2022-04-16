package pl.edu.mimuw.USOS;

public abstract class People {
  private final String name;
  private final String surname;
  private final String BirthPlace;

  public People(String name, String surname, String BirthPlace) {
    this.name = name;
    this.surname = surname;
    this.BirthPlace = BirthPlace;
  }

  public String getName() {
    return this.name;
  }

  public String getSurname() {
    return this.surname;
  }

  public String getBirthPlace() {
    return this.BirthPlace;
  }

  public abstract String printQuote();

  @Override
  public abstract String toString();

}
