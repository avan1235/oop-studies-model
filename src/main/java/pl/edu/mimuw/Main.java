package pl.edu.mimuw;

import java.rmi.StubNotFoundException;

public class Main {

  public static void main(String[] args) {
    Usos mimuw = new Usos("MIMUW");
    System.out.println(mimuw);

    Program inf = new Program("Informatyka 1 stopnia", 3);
    Course wpi = new Course(inf, "Wstep do programowania");
    Course pmat = new Course(inf, "Podstawy matematyki");
    Course am = new Course(inf, "Analiza matematyczna");

    mimuw.addStudent(new Student("Jan Kowalski", 19));
    mimuw.addStudent(new Student("Tomasz Nowak", 20));
    mimuw.addStudent(new Student("Anna Studencka", 20));

    mimuw.hire(new StaffMember("Pawel Strzelecki", 59, "Profesor/dziekan"));

    var jk = mimuw.findStudentByName("Jan Kowalski");
    jk.enrollInCourse(wpi);
    jk.giveUpStudies();
    System.out.println(jk);

    var ps = mimuw.findStaffByName("Pawel Strzelecki");
    ps.startTeaching(am);
    System.out.println(ps);

    var as = mimuw.findStudentByName("Anna Studencka");
    as.enrollInCourse(pmat);
    as.enrollInCourse(wpi);
    as.enrollInCourse(am);

    System.out.println(as);

    as.finishCourse(pmat);
    as.finishCourse(wpi);

    System.out.println(as);

    System.out.println(mimuw);
  }
}
