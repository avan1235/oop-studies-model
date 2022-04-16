package pl.edu.mimuw.USOS;

public class Subject {

  private final String name;
  private int grade;
  private final Academic academic;


  public Subject(String name, int grade, Academic person) {
    this.name = name;
    this.grade = grade;
    this.academic = person;
  }

  public Subject(String name, Academic person) {
    this.name = name;
    this.grade = 0;
    this.academic = person;
  }

  public String getName() {
    return this.name;
  }

  public int getGrade() {
    return this.grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public Academic getAcademic(){
    return this.academic;
  }


}
