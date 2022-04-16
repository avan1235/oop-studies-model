package pl.edu.mimuw;

public class PersonFactory {

  private static int indexNumber=0;

  public static Student createStudent(String firstname, String lastname, String gender, String personalID) {
    indexNumber++;
    return new Student(firstname, lastname, gender, personalID, indexNumber);
  }

  public static Student createStudent(String firstname, String lastname, String gender, String personalID, Program pro) {
    indexNumber++;
    return new Student(firstname, lastname, gender, personalID, indexNumber, pro);
  }

  public static StaffMember createStaffMember(String firstname, String lastname, String gender, String personalID) {
    indexNumber++;
    return new StaffMember(firstname, lastname, gender, personalID, indexNumber);
  }
}
