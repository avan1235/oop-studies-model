package pl.edu.mimuw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//University System of Handling People
public class USHP {

  private String name;

  private int sizeStudents = 0;
  private int sizeStaff = 0;
  private static final HashMap<String, Student> students = new HashMap<>();
  private static final HashMap<String, StaffMember> staffMembers = new HashMap<>();

  public USHP(String name) {
    this.name = name;
  }

  public String getNameOfSystem() {
    return this.name;
  }

  public void addStudent(Student person, int idNumber) {
    String number = idNumber + "";
    this.sizeStudents++;
    students.put(number, person);
  }

  public void addStaffMember(StaffMember person, int idNumber) {
    String number = idNumber + "";
    this.sizeStaff++;
    staffMembers.put(number, person);
  }

  public int getSizeStudents() {
    return sizeStudents;
  }

  public int getSizeStaff() {
    return sizeStaff;
  }

  public String toString() {
    var sb = new StringBuilder();
    sb.append("Welcome to ")
      .append(this.getNameOfSystem())
      .append(", which is system of handling students and staff members!\n")
    .append("********************************\n");
    //Students
    sb.append("There are: ").append(this.getSizeStudents())
      .append(" students here. Those students are: \n");
    for(var student : this.students.values()){
      sb.append(student.toString()).append("\n");
    }
    sb.append("\n********************************\n");
    sb.append("There are: ").append(this.getSizeStaff())
      .append(" staff members here. Those staff members are: \n");
    for(var staffMember : this.staffMembers.values()){
      sb.append("\n").append(staffMember.toString());
    }

    sb.append("\n\n********************************");
    return sb.toString();
  }
}
