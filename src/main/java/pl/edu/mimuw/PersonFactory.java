package pl.edu.mimuw;

abstract class PersonFactory {

  private static int numberofpeople = 0;

  public static Student createStudent(String first, String last, int day, int month, int year) {
    numberofpeople++;
    return new Student(first, last, PersonFactory.numberofpeople, day, month, year);
  }

  public static StaffMember createStaffMember(String first, String last, int day, int month, int year) {
    numberofpeople++;
    return new StaffMember(first, last, PersonFactory.numberofpeople, day, month, year);
  }

}
