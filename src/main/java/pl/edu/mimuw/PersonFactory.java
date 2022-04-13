package pl.edu.mimuw;

public abstract class PersonFactory {
  private static int currentIndex = 0;
  public static Student makeStudent(String name, String last_name, String birthNumber) {
    return new Student(name, last_name, birthNumber, currentIndex++);
  }
  public static Employee makeEmployee(String name, String last_name,String birthNumber) {
    return new Employee(name, last_name, birthNumber, currentIndex++);
  }
}
