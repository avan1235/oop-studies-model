package pl.edu.mimuw;

import java.util.HashSet;
import java.util.Set;

public class Employee extends Person {

  private Set<Publication> publications;
  private Set<Course> coursesTeached;

  public Employee(String name) {
    super(name);
    this.publications = new HashSet<Publication>();
    this.coursesTeached = new HashSet<Course>();
  }

  public void addPublication(Publication publication) {
    publications.add(publication);
  }

  public Set<Publication> getPublications() {
    return new HashSet<>(publications);
  }

  public void addCourseTeached(Course course) {
    coursesTeached.add(course);
  }

  public void removeCourseTeached(Course course) {
    coursesTeached.remove(course);
  }

  public Set<Course> getCoursesTeached() {
    return new HashSet<>(coursesTeached);
  }
}