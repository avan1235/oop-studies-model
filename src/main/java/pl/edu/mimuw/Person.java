package pl.edu.mimuw;

public abstract class Person {

  protected String firstname;

  protected String lastname;

  protected final int idnumber;

  protected final int dayofbirth;

  protected final int monthofbirth;

  protected final int yearofbirth;

  public Person(String firstname, String lastname, int id, int day, int month, int year) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.idnumber = id;
    this.dayofbirth = day;
    this.monthofbirth = month;
    this.yearofbirth = year;
  }

  public String getFullName() {
    return firstname + " " + lastname;
  }

  public String getBirthday() { return String.format("%s-%s-%s", dayofbirth, monthofbirth, yearofbirth); }

}
