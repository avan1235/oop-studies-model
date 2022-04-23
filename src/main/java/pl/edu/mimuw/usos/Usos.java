package pl.edu.mimuw.usos;

import pl.edu.mimuw.usos.Faculty.*;
import pl.edu.mimuw.usos.People.*;

import java.util.HashMap;
import java.util.Map;

public class Usos {
  private final String name;
  private final static IndexCounter indexStudentsCounter = new IndexCounter();
  private final static IndexCounter indexProgramCounter = new IndexCounter();
  private final static IndexCounter indexEmployeeCounter = new IndexCounter();
  private final Map<Integer, Student> students;
  private final Map<Integer, Program> programs;
  private final Map<Integer, Employee> employees;

  public Usos(String name) {
    this.name = name;
    this.students = new HashMap<>();
    this.programs = new HashMap<>();
    this.employees = new HashMap<>();
  }


  public Integer addStudent(Student student) {
    Integer index = indexStudentsCounter.increment();
    this.students.put(index, student);
    return index;
  }

  public Integer addProgram(Program program) {
    Integer index = indexProgramCounter.increment();
    this.programs.put(index, program);

    Employee employee = this.employees.get(program.getLeaderIndex());
    employee.addProgram(index);
    this.employees.put(program.getLeaderIndex(), employee);
    return index;
  }

  public Integer addEmployee(Employee employee) {
    Integer index = indexEmployeeCounter.increment();

    this.employees.put(index, employee);
    return index;
  }


  public int setStudentStatus(Integer studentId, String status) {
    Student student = this.students.get(studentId);
    if (student == null) {
      return 1;
    }
    student.changeStatus(status);
    return 0;
  }

  public int addProgramToStudent(Integer programId, Integer studentId) {
    Student student = this.students.get(studentId);
    Program program = this.programs.get(programId);
    if (student == null || program == null) {
      return 1;
    }

    student.addProgram(programId);
    this.students.put(studentId, student);
    program.addParticipant(studentId);
    this.programs.put(programId, program);

    return 0;
  }

  public int addEmployeeToProgram(Integer programId, Integer employeeId) {
    Employee employee = this.employees.get(employeeId);
    Program program = this.programs.get(programId);
    if (employee == null || program == null) {
      return 1;
    }

    employee.addProgram(programId);
    this.employees.put(employeeId, employee);
    program.addEmployees(employeeId);
    this.programs.put(programId, program);

    return 0;
  }

  private void sbPrograms(StringBuilder sb, Person person) {
    for (int programId : person.getProgramsIds()) {
      sb.append(", ").append(programs.get(programId));
    }
    sb.append("}");
  }

  public String studentsToString() {
    StringBuilder sb = new StringBuilder(name + " Students: [");

    for (Student student : this.students.values()) {
      sb.append("\n ").append(student.studentDetailedInfo()).
        append(", attended:");
      sbPrograms(sb, student);
    }
    sb.append("]");
    return sb.toString();
  }

  public String programsToString() {
    StringBuilder sb = new StringBuilder(name + " Programs: [");

    for (Program program : this.programs.values()) {
      sb.append("\n ").append(program).
        append(", led by as head: ").append(employees.get(program.getLeaderIndex())).
        append(" and: ");
      for (int employeeId : program.getEmployeesIds()) {
        sb.append(" ").append(employees.get(employeeId));
      }
      sb.append(", attended by:");
      for (int studentId : program.getParticipantsIds()) {
        sb.append(" ").append(students.get(studentId));
      }
      sb.append("}");
    }
    sb.append("]");
    return sb.toString();
  }

  public String employeesToString() {
    StringBuilder sb = new StringBuilder(name + " Employees: [");

    for (Employee employee : this.employees.values()) {
      sb.append("\n ").append(employee).
        append(", runs: {");
      sbPrograms(sb, employee);
    }
    sb.append("]");
    return sb.toString();
  }
}
