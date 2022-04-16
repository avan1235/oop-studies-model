package pl.edu.mimuw;

public abstract class Person {
  protected String firstName;
  protected String surname;

  protected int numberIndex;

  public Person (String firstName, String surname, int numberIndex)
  {
    this.firstName = firstName;
    this.surname = surname;
    this.numberIndex = numberIndex;
  }
  public int getIndex() {
    return this.numberIndex;
  }
  public String getNames(){
    var sb = new StringBuilder();
    sb.append(this.firstName)
      .append(" ").append(surname);
    return sb.toString();
  }
  @Override
  public String toString()
  {
    var sb = new StringBuilder ();
    sb.append(this.firstName).append(" ");
    sb.append(this.surname);
    return sb.toString();
  }
  public String getName()
  {
    return this.firstName + this.surname;
  }
}
