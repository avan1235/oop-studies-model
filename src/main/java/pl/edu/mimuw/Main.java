package pl.edu.mimuw;

public class Main {

  public static void main(String[] args) {
    var overview = new USOS();
    var Mat = new Program("MIMUW", "mathematics");
    var Inf = new Program("MIMUW", "computer sciences");
    var CiekawaPraca = new Publication("On the laws", "agriculture");
    String prof1 = overview.addStaff("Adam", "Majewski", "mgr");
    String st1 = overview.addStudent("Mateusz", "Piasecki");
    String st2 = overview.addStudent("Mateusz", "Mak");
    String nothing = overview.addStudent("", ""); // returns an error - empty names
    overview.addProgramToStudent(st1, Mat);
    overview.addProgramToEveryStudent(Inf);
    overview.addProgramToStudent(prof1, Mat); // will add nothing, as staff won't have any programs
    overview.addProgramToStudent("1234576796sjidj", Mat); // returns an error - wrong id
    overview.addPublicationToStaff(prof1, CiekawaPraca);
    overview.addPublicationToStaff(prof1, CiekawaPraca); // duplicate works won't show up
    System.out.println(overview);
  }
}
