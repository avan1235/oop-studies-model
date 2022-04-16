package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class Course {
  private String name;

  private Employee teacher;
  private Set<Student> students;

  private Boolean isActive;

  public Course(String name, Employee teacher, Set<Student> students) {
    this.name = name;
    (this.teacher = teacher).addCourseTeached(this);
    (this.students = students).forEach(student -> student.addCourseAttended(this));
    isActive = true;
  }

  public String getName() {
    return this.name;
  }

  public Employee getTeacher() {
    return this.teacher;
  }

  public void setTeacher(Employee teacher) {
    this.teacher.removeCourseTeached(this);
    (this.teacher = teacher).addCourseTeached(this);
  }

  public void addStudent(Student student) {
    student.addCourseAttended(this);
    this.students.add(student);
  }

  public void removeStudent(Student student) {
    student.removeCourseAttended(this);
    this.students.remove(student);
  }

  public Set<Student> getStudents() {
    return new HashSet<>(this.students);
  }

  public void deactivate() {
    isActive = false;
  }

  public Boolean isActive() {
    return isActive;
  }
}
