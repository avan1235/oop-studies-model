package pl.edu.mimuw;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
  final private int studentID;
  final private List<Course> enrolledCourses;
  final private List<Course> completedCourses;

  static private int curStudentID = 0;

  public Student(String name, int age) {
    super(name, age);
    this.studentID = ++curStudentID;
    this.enrolledCourses = new ArrayList<Course>();
    this.completedCourses = new ArrayList<Course>();
  }

  public Student(Student other) {
    super(other);
    this.studentID = other.studentID;
    this.enrolledCourses = new ArrayList<Course>();

    for(Course c : other.enrolledCourses) {
      this.enrolledCourses.add(new Course(c));
    }

    this.completedCourses = new ArrayList<Course>();

    for(Course c : other.completedCourses) {
      this.completedCourses.add(new Course(c));
    }

  }

  public String toString() {
    var sb = new StringBuilder();
    sb.append("Hi, I'm ")
      .append(name)
      .append(" and I'm ")
      .append(age)
      .append("y/o student, I study ")
      .append(enrolledCourses.size())
      .append(" courses and completed ")
      .append(completedCourses.size())
      .append(" courses");

    return sb.toString();
  }

  public int getStudentID() {
    return this.studentID;
  }

  public void enrollInCourse(Course course) {
    enrolledCourses.add(course);
  }

  public void giveUpCourse(Course course) {
    enrolledCourses.remove(course);
  }

  public void finishCourse(Course course) {
    if(this.enrolledCourses.contains(course)) {
      this.enrolledCourses.remove(course);
      this.completedCourses.add(course);
    }
  }

  public void giveUpStudies() {
    while (!enrolledCourses.isEmpty()) {
      enrolledCourses.remove(enrolledCourses.size() - 1);
    }
  }
}
