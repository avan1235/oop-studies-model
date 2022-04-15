package pl.edu.mimuw;

import pl.edu.mimuw.usos.*;

public class Main {

  public static void main(String[] args) {
    var personA = new Person(2002, "Artur", "Kamieniecki", "male", "3114341");
    var personB = new Person(2000, "Pawel", "Bozek", "male", "131231");
    var personC = new Person(1999, "Agata", "Duwe", "female", "1111231");
    var personD = new Person(1963, "Pawel", "Strzelecki", "male", "896471");

    var usos = new Usos("University of Warsaw");

    var studentA = new Student(personA);
    var studentB = new Student(personB);
    var staffA = new StaffMember(personC, "doctor");
    var staffB = new StaffMember(personD, "professor");

    System.out.println(usos);

    usos.addStaff(staffA);
    usos.addStaff(staffB);
    usos.addStudent(studentA);

    System.out.println(usos);

    usos.addStudent(studentB);

    System.out.println(staffA);
    System.out.println(studentA);

    var mim = new Faculty("MIM", "Banacha 2");
    var fuw = new Faculty("FUW", "Ludwika Pasteura 5");

    System.out.println(mim);

    var ITProgram = new Program("Computer science");
    var NuclearPhysicsProgram = new Program("Nuclear physics");
    var MathProgram = new Program("Mathematics");

    mim.newProgram(ITProgram);
    fuw.newProgram(NuclearPhysicsProgram);
    mim.newProgram(MathProgram);

    System.out.println(mim);
    System.out.println(fuw);

    studentA.addProgram(new ActiveProgram(ITProgram));
    studentA.addProgram(new ActiveProgram(MathProgram));
    studentA.getActivePrograms().get(1).incrementYear();

    System.out.println(studentA);

    var publicationA = new Publication("Pawel Strzelecki, H. von der Mosel", "Menger curvature as a knot energy", 2013);
    var publicationB = new Publication("Pawel Strzelecki", "Matematyka wspolczesna dla myslacych laikow", 2011);
    var publicationC = new Publication("Pawel Strzelecki, A. Zatorska-Goldstein",
      "A compactness theorem for higher dimensional H-systems", 2004);

    staffB.addPublication(publicationA);
    staffB.addPublication(publicationB);
    staffB.addPublication(publicationC);

    System.out.println(staffB);
  }
}
