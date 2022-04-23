package pl.edu.mimuw;

import pl.edu.mimuw.usos.*;
import pl.edu.mimuw.usos.Faculty.Program;
import pl.edu.mimuw.usos.People.Employee;
import pl.edu.mimuw.usos.People.Student;

public class Main {


  public static void main(String[] args) {
    Usos usos = new Usos("MIM");
    Student firstStudent = new Student("student", "1", "2022-04-23", "Studying on first year");
    Student secondStudent = new Student("student", "2", "2020-02-22", "Studying on first year");
    Employee wpfProfessorLeder = new Employee("wpf_professor", "1", "2000-01-01");
    Employee wpfProfessor = new Employee("wpf_professor", "2", "2000-01-01");

    int wpfProfessorLederId = usos.addEmployee(wpfProfessorLeder);
    Program wpf = new Program("wpf", wpfProfessorLederId);
    int wpfId = usos.addProgram(wpf);
    usos.addEmployeeToProgram(wpfId, usos.addEmployee(wpfProfessor));

    int firstStudentId = usos.addStudent(firstStudent);
    int secondStudentId = usos.addStudent(secondStudent);
    usos.addProgramToStudent(wpfId, firstStudentId);
    usos.addProgramToStudent(wpfId, secondStudentId);

    Employee mathProfessorLeader = new Employee("math_professor", "leader", "2000-01-01");
    Employee mathProfessor2 = new Employee("math_professor", "2", "1999-11-03");
    Employee mathProfessor3 = new Employee("math_professor", "3", "2002-12-21");
    int mathProfessorLeaderId = usos.addEmployee(mathProfessorLeader);
    Program math = new Program("math", mathProfessorLeaderId);
    int mathId = usos.addProgram(math);
    usos.addEmployeeToProgram(mathId, usos.addEmployee(mathProfessor2));
    usos.addEmployeeToProgram(mathId, usos.addEmployee(mathProfessor3));
    usos.addEmployeeToProgram(mathId, wpfProfessorLederId);

    Student Student3 = new Student("student", "3", "2022-04-23", "Studying on second year");
    Student Student4 = new Student("student", "4", "2020-02-22", "Studying on third year");
    Student Student5 = new Student("student", "5", "2022-04-23", "suspended");
    Student Student6 = new Student("student", "6", "2020-02-22", "finished");

    int Student3Id = usos.addStudent(Student3);
    int Student4Id = usos.addStudent(Student4);
    int Student5Id = usos.addStudent(Student5);
    usos.addStudent(Student6);

    usos.addProgramToStudent(mathId, Student3Id);
    usos.addProgramToStudent(wpfId, Student3Id);
    usos.addProgramToStudent(mathId, Student4Id);
    usos.addProgramToStudent(wpfId, Student4Id);
    usos.addProgramToStudent(mathId, Student5Id);
    System.out.println(usos.studentsToString());
    System.out.println();
    System.out.println(usos.programsToString());
    System.out.println();
    System.out.println(usos.employeesToString());
  }
}
