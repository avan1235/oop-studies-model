package pl.edu.mimuw;

import java.util.HashMap;
import java.util.Map;

public class USOS {
  private final String name;
  public Map<Integer, Student> Students;
  public Map<Integer, StaffMember> StaffMembers;

  public USOS(String name) {
    this.name=name;
    this.Students=new HashMap<>();
    this.StaffMembers=new HashMap<>();
  }

  public void addStudent(Student s) {
    this.Students.put(s.indexNumber, s);
  }

  public Student removeStudent(int indexNumber) {
    Student s=this.Students.get(indexNumber);
    this.Students.remove(indexNumber);
    return s;
  }

  public void addStaffMember(StaffMember sm) {
    this.StaffMembers.put(sm.indexNumber, sm);
  }

  public StaffMember removeStaffMember(int indexNumber) {
    StaffMember sm=this.StaffMembers.get(indexNumber);
    this.StaffMembers.remove(indexNumber);
    return sm;
  }

  public void incremetYears() {
    for(var s:this.Students.values()) {
      s.incremetYears();
    }
  }

  public String toString() {
    var sb=new StringBuilder();
    sb.append(this.name).append("\nStudents:\n");
    for(var s:this.Students.values()) {
      sb.append(s.toString()).append("\n\n");
    }
    sb.append("\nStaff Members:\n");
    for(var sm:this.StaffMembers.values()){
      sb.append(sm.toString()).append("\n");
    }
    return sb.toString();
  }
}
