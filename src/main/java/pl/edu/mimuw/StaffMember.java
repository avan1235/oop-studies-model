package pl.edu.mimuw;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class StaffMember extends Person {

  private final String degree;
  private final List<Course> subjects;

  public StaffMember(String name, int age, String degree) {
    super(name, age);
    this.degree = degree;
    this.subjects = new ArrayList<Course>();
  }

  public StaffMember(StaffMember other) {
    super(other);
    this.degree = other.getDegree();
    this.subjects = new ArrayList<Course>();

    for(Course subject : other.subjects) {
      this.subjects.add(subject);
    }
  }

  public String toString() {
    var sb = new StringBuilder();
    sb.append("Hi, I'm ")
      .append(name)
      .append(" and I'm ")
      .append(age)
      .append("y/o staff member, I teach: ");

    for (Course subject : subjects) {
      sb.append(subject.getName())
        .append(" in program ")
        .append(subject.getProgram().getName())
        .append(", ");
    }
    return sb.toString();
  }

  public String getDegree() {
    return this.degree;
  }

  public void startTeaching(Course subject) {
    subjects.add(subject);
  }

  public void stopTeaching(Course subject) {
    subjects.remove(subject);
  }
}
