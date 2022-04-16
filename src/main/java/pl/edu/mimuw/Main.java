package pl.edu.mimuw;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    var people = new ArrayList<Person>();
    var programs = new ArrayList<Program>();
    var obligatory = new ArrayList<Subject>();
    var facultative = new ArrayList<Subject>();

    obligatory.add(new Subject("WPI", "WPI-INF"));
    obligatory.add(new Subject("PO", "PO-INF", 7.00, 30, 30, 30));
    facultative.add(new Subject("MN", "MN-INF"));
    programs.add(new Program("Mathematics", "Bachelors"));
    programs.add(new Program("Computer Science", "Bachelors", obligatory, facultative));
    people.add(new Student("StudentName", "999999", "02222222222", programs));

    var USOSMIM = new USOS(people);
    System.out.println(USOSMIM);

    USOSMIM.addPerson(new Educator("nowyWykładowca", "00000000000", "000", "Professor", obligatory));
    System.out.println(USOSMIM);

    USOSMIM.getPerson(0).die();
    System.out.println("Student still in USOS:" + USOSMIM.personInUSOS("02222222222"));
    USOSMIM.removePerson("02222222222");
    System.out.println("Student still in USOS:" + USOSMIM.personInUSOS("02222222222"));

    System.out.println(USOSMIM);
  }
}
