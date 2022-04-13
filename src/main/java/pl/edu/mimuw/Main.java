package pl.edu.mimuw;

import java.util.Date;

public class Main {

  public static void main(String[] args) {
    USOS usos = new USOS();

    Employee JK = PersonFactory.makeEmployee("Jan", "Kowalski", "12345678988");
    JK.addPublication(new Publication("Teoria Mnogości", new Person[]{JK}));

    Student JF = PersonFactory.makeStudent("Jacek", "Fasola", "2000678988");
    JF.addProgram(new Program(new Date[]{new Date(202322351)}, JK, 5));

    usos.addUser(JK);
    usos.addUser(JF);

    System.out.println(usos);
  }
}
