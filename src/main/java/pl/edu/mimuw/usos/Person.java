package pl.edu.mimuw.usos;

public class Person {
  private final int yearOfBirth;
  private final String firstName;
  private final String lastName;
  private final String identificationNumber;
  private final String gender;

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getIdentificationNumber() {
    return identificationNumber;
  }

  public Person(int yearOfBirth, String firstName, String lastName, String gender, String identificationNumber) {
    this.yearOfBirth = yearOfBirth;
    this.firstName = firstName;
    this.lastName = lastName;
    this.identificationNumber = identificationNumber;
    this.gender = gender;
  }

  public Person(Person person) {
    this.yearOfBirth = person.getYearOfBirth();
    this.firstName = person.getFirstName();
    this.lastName = person.getLastName();
    this.identificationNumber = person.getIdentificationNumber();
    this.gender = person.getGender();
  }

  public String getName() {
    return this.firstName + " " + this.lastName;
  }

  public int getAge(int currentYear) {
    return currentYear - this.yearOfBirth;
  }

  public String getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "Hello, I'm " + this.getName();
  }


}
