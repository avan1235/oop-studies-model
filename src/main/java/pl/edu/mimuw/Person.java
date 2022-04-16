package pl.edu.mimuw;

public abstract class Person {
  private String forename;
  private String lastname;
  private String gender;
  private final String personalID;
  protected final int indexNumber;

  public Person(String forename, String lastname, String gender, String personalID, int indexNumber) {
    this.forename=forename;
    this.lastname=lastname;
    this.gender=gender;
    this.personalID=personalID;
    this.indexNumber=indexNumber;
  }

  public String getName() {
    var sb=new StringBuilder();
    sb.append(this.forename).append(" ").append(this.lastname);
    return sb.toString();
  }

  public String getGender() {
    return this.gender;
  }

  public String getPersonalID() {
    return this.personalID;
  }

  public int getIndexNumber() {
    return this.indexNumber;
  }

  @Override
  public String toString() {
    var sb=new StringBuilder();
    sb.append(this.getName()).append(", gender: ").append(this.gender).append(", ID: ").append(this.personalID).append(", index number: ").append(this.indexNumber);
    return sb.toString();
  }


}
