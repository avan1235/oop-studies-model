package pl.edu.mimuw;

public class PersonFactory {
  private static int lastPersonIndex = 1;

  public static Student makeStudent(String name, Program program) {
    Student student = new Student(name, Faculty.assignStudentID(), program);
    Faculty.registerStudent(student);
    lastPersonIndex++;
    return student;
  }

  public static Student makeStudent(String name) {
    Student student = new Student(name, Faculty.assignStudentID(), null);
    Faculty.registerStudent(student);
    lastPersonIndex++;
    return student;
  }

  public static StaffMember makeStaffMember(String name) {
    return makeStaffMember(name, null);
  }

  public static StaffMember makeStaffMember(String name, Subject[] subjectsTaught) {
    StaffMember staff = new StaffMember(name, Faculty.assignStaffID(), subjectsTaught);
    Faculty.registerStaff(staff);
    lastPersonIndex++;
    return staff;
  }

  public static Person makePerson(String name) {
    return new Person(name, Integer.toString(lastPersonIndex++));
  }
}
