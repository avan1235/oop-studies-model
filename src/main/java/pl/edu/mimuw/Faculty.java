package pl.edu.mimuw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Faculty {
  private static final HashMap<String, Person> facultyPeople = new HashMap<>();
  private static final Set<Program> programs = new HashSet<>();

  private static int lastStudentIndex = 1;
  private static int lastStaffIndex = 1;
  private static int lastSubjectIndex = 1;
  private static int lastProgramIndex = 1;

  public static String assignStudentID() {
    return "STUDENT" + lastStudentIndex++;
  }

  public static String assignStaffID() {
    return "STAFF" + lastStaffIndex++;
  }

  public static String assignSubjectID(String prefix) {
    return lastSubjectIndex++ + "-" + prefix;
  }

  public static String assignProgramID(String areaOfStudy) {
    return areaOfStudy + lastProgramIndex++;
  }

  public static void registerStudent(Student student) {
    facultyPeople.put(student.getId(), student);
  }

  public static void registerStaff(StaffMember staffMember) {
    facultyPeople.put(staffMember.getId(), staffMember);
  }

  public static void registerProgram(Program program) {
    programs.add(program);
  }

  public static String getPersonInfoById(String id) {
    return facultyPeople.get(id).toString();
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("Welcome to our faculty. Please meet our people!\n");
    for (var people : facultyPeople.values())
      res.append(people).append("\n");
    res.append("And here are programs that we offer:\n");
    for (var program : programs)
      res.append(program).append("\n");
    return res.toString();
  }
}
