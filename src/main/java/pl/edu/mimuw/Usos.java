package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.List;

public class Usos {
  private final String schoolName;
  private final List<Student> students;
  private final List<StaffMember> staff;

  Usos(String schoolName) {
    this.schoolName = schoolName;
    this.students = new ArrayList<Student>();
    this.staff = new ArrayList<StaffMember>();
  }

  public List<Student> getStudents() {
    List<Student> allStudents = new ArrayList<Student>();

    for(Student student : this.students) {
      allStudents.add(new Student(student));
    }

    return allStudents;
  }

  public List<StaffMember> getStaff() {
   List<StaffMember> allStaff = new ArrayList<StaffMember>();

   for(StaffMember member : this.staff) {
     allStaff.add(new StaffMember(member));
   }

   return allStaff;
  }

  public String getSchoolName() {
    return schoolName;
  }

  public void addStudent(Student s) {
    this.students.add(s);
  }

  public void kickOutStudent(Student s) {
    this.students.remove(s);
  }

  public void hire(StaffMember sm) {
    this.staff.add(sm);
  }

  public void fire(StaffMember sm) {
    this.staff.remove(sm);
  }

  public String toString() {
    var sb = new StringBuilder();

    sb.append("Welcome to ")
      .append(this.schoolName)
      .append(". We have ")
      .append(this.students.size())
      .append(" students and ")
      .append(this.staff.size())
      .append(" staff members");

    return sb.toString();
  }

  public Student findStudentByName(String name) {
    for(Student s : this.students) {
      if (s.getName().equals(name)) {
        return s;
      }
    }

    return null;
  }

  public StaffMember findStaffByName(String name) {
    for(StaffMember s : this.staff) {
      if(s.getName().equals(name)) {
        return s;
      }
    }

    return null;
  }
}
