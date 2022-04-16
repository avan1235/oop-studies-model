package pl.edu.mimuw;

public class PersonFactory {
  private static int index = 1;
  public static Student createStudent(String firstName, String surname, USHP USOS) {
    Student student = new Student(firstName, surname, index);
    index++;
    USOS.addStudent(student, index);
    return student;
  }
  public static StaffMember createStaffMember(String firstName, String surname, USHP USOS){
    StaffMember employee = new StaffMember(firstName, surname, index);
    index++;
    USOS.addStaffMember(employee, index);
    return employee;
  }
}

