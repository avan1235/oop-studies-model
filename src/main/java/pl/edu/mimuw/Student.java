package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {

  private Set<Course> coursesAttended;
  private int studyProgress;

  public Student(String name) {
    super(name);
    this.coursesAttended = new HashSet<Course>();
    this.studyProgress = 0;
  }

  public void addCourseAttended(Course course) {
    ++studyProgress;
    coursesAttended.add(course);
  }

  public void removeCourseAttended(Course course) {
    coursesAttended.remove(course);
  }

  public int getStudyProgress() {
    return studyProgress;
  }

  public Set<Course> getCoursesAttended() {
    return new HashSet<>(coursesAttended);
  }
}
