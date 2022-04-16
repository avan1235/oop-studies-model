package pl.edu.mimuw.USOS;

import java.util.ArrayList;
import java.util.List;

public class Student extends People {

  private int age;
  private final String degreeCourse;
  private int year;
  private Character semestr;
  private final List<Subject> subjects;


  public Student(String name, String surname, int age, String BirthPlace, String degreeCourse, int year, char semestr) {
    super(name, surname, BirthPlace);
    this.age = age;
    this.degreeCourse = degreeCourse;
    this.year = year;
    this.semestr = semestr;
    this.subjects = new ArrayList<Subject>();
  }

  public int getAge() {
    return this.age;
  }

  public void increaseAge() {
    this.age += 1;
  }

  public String getDegreeCourse() {
    return this.degreeCourse;
  }

  public int getYear() {
    return this.year;
  }

  public Character getSemestr() {
    return this.semestr;
  }

  public void changeSemestr() {
    if (this.semestr == 'Z') {
      this.semestr = 'L';
    } else {
      this.semestr = 'Z';
    }
  }

  public void increaseYear() {
    this.year += 1;
    this.changeSemestr();
  }

  public List<Subject> getSubjects() {
    return this.subjects;
  }

  public void addSubject(Subject subject) {
    this.subjects.add(subject);
  }

  @Override
  public String printQuote() {
    return "Student debil, student piwo";
  }

  //@Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    result.append("Student info\n")
      .append("Name: ").append(this.getName()).append("\n")
      .append("Surname: ").append(this.getSurname()).append("\n")
      .append("Age: ").append(this.getAge()).append("\n")
      .append("Birth Place: ").append(this.getBirthPlace()).append("\n")
      .append("Degree Course: ").append(this.getDegreeCourse()).append("\n")
      .append("Year/semestr: ").append(this.getYear()).append(this.getSemestr()).append("\n")
      .append("List of subjects: \n");
    for (Subject subject : this.getSubjects()) {
      result.append("[\n")
        .append("     Subject:").append(subject.getName()).append("\n")
        .append("     ").append(subject.getAcademic().toString())
        .append("     Grade:").append(subject.getGrade()).append("\n")
        .append("]\n");
    }

    return result.toString();
  }
}
