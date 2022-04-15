package pl.edu.mimuw.usos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Usos {
  private static Integer counter = 0;
  private final Map<Integer, Student> students;
  private final Map<Integer, StaffMember> staffMembers;
  private final Set<Program> programs;
  private final String name;

  public Usos(String name) {
    this.name = name;
    this.students = new HashMap<>();
    this.staffMembers = new HashMap<>();
    this.programs = new HashSet<>();
  }

  private static Integer incrementCounter() {
    return ++counter;
  }

  private static Integer getCounter() {
    return counter;
  }

  public Map<Integer, Student> getStudents() {
    return students;
  }

  public Map<Integer, StaffMember> getStaffMembers() {
    return staffMembers;
  }

  public Set<Program> getPrograms() {
    return programs;
  }

  public void addProgram(Program program) {
    this.programs.add(program);
  }

  public void addStudent(Student student) {
    this.students.put(Usos.incrementCounter(), student);
  }

  public void addStaff(StaffMember staff) {
    this.staffMembers.put(Usos.incrementCounter(), staff);
  }

  public Person getPersonById(Integer id) {
    if (this.students.containsKey(id)) {
      return this.students.get(id);
    }
    return this.staffMembers.getOrDefault(id, null);
  }

  @Override
  public String toString() {
    String suffixA = "s";
    String suffixB = "s";

    if (this.students.size() == 1) {
      suffixA = "";
    }
    if (this.staffMembers.size() == 1) {
      suffixB = "";
    }

    return this.name + " USOS\n" + this.students.size() + " student" + suffixA + " and " + this.staffMembers.size() + " staff member" + suffixB;
  }
}
