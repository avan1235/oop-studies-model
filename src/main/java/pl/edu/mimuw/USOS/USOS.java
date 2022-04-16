package pl.edu.mimuw.USOS;

import java.util.HashMap;
import java.util.Map;

public class USOS {
  private static int studentIndex = 400000;
  private static int academicIndex = 1;

  private final Map<Integer, Student> students;
  private final Map<Integer, Academic> academics;

  public USOS() {
    students = new HashMap<>();
    academics = new HashMap<>();
  }

  public Map<Integer, Student> getStudents() {
    return new HashMap<>(students);
  }

  public Map<Integer, Academic> getAcademics() {
    return new HashMap<>(academics);
  }

  public void addStudent(Student student) {
    this.students.put(studentIndex++, student);
  }

  public void addAcademic(Academic academic) {
    this.academics.put(academicIndex++, academic);
  }

  public Student getStudent(int index) {
    if (this.students.containsKey(index)) {
      return this.students.get(index);
    } else {
      throw new IndexOutOfBoundsException("Student with this index does not exits.");
    }
  }

  public Academic getAcademic(int index) {
    if (this.academics.containsKey(index)) {
      return this.academics.get(index);
    } else {
      throw new IndexOutOfBoundsException("Academic with this index does not exists.");
    }
  }

}
