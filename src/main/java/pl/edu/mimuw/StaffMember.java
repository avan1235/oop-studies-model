package pl.edu.mimuw;

import java.util.HashSet;

public class StaffMember extends Person {
  private final HashSet<Publication> publications;
  private final HashSet<Course> courses;

  public StaffMember(String firstname, String lastname, int id, int day, int month, int year) {
    super(firstname, lastname, id, day, month, year);
    this.publications = new HashSet<>();
    this.courses = new HashSet<>();
  }

  public void addCourse(Course course) {
    this.courses.add(course);
  }

  public void removeCourse(Course course) {
    this.courses.remove(course);
  }

  public void addPublication(Publication publication) {
    this.publications.add(publication);
  }

  @Override
  public String toString() {
    final var sb = new StringBuilder();
    sb.append("--- Staff Member ").append(getFullName()).append(" ---\n")
      .append("Date of birth: ").append(getBirthday()).append("\n")
      .append("ID number: ").append(idnumber).append("\n")
      .append("has written:");
    for (final var publication : publications) sb.append("\n").append("  - ").append(publication.getTitle());
    sb.append("\n").append("teaches:");
    for (final var course : courses) sb.append("\n").append("  - ").append(course);

    return sb.append("\n").toString();
  }
}

